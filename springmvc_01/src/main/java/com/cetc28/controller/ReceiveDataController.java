package com.cetc28.controller;

import com.cetc28.pojo.Person;
import com.cetc28.pojo.Pet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: WSC
 * @version: 1.0
 */
@RestController
public class ReceiveDataController {
    /*
    使用POJO接收参数时, 注意事项:
    提交的参数名必须和POJO的属性名保持一致(底层是利用反射给属性赋值实现的)
    一定要实现pojo类的setter方法, 如果不实现, 对应属性就会为null, 所以反射中设置属性调用的是setter方法, 不是直接操作属性)
     */
    @RequestMapping("/getDataByPojo")
    public String getDataByPojo(Person person){
        System.out.println(person);
        System.out.println(person.getPets());

        return "success";
    }
}
