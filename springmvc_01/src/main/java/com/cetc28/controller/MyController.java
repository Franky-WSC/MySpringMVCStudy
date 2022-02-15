package com.cetc28.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: WSC
 * @version: 1.0
 */
@Controller//当springMVC框架扫描到controller包的时候, 发现这个类有@Controller这个注解, 就会实例化
public class MyController {
    //之前继承HttpServlet时, service方法参数中封装了请求req和响应resp, 用来对输入输出进行处理
//    void service(HttpServletRequest req, HttpServletResponse resp){
//    }
    /**
     * 定义一个处理请求的方法, 注意和之前继承HttpServlet时有所不同
     * 处理请求: 之前req; 现在
     * 处理响应: 之前resp; 现在返回值为String,指向跳转的路径
     */
    @RequestMapping("/firstController.do")//@RequestMapping可以直接给这个方法设置请求路径, 之前@WebServlet是给servlet类设置请求路径
    public String firstController(){
        System.out.println("firstController");
        //进行一系列处理之后, 进行页面的跳转
        return "first";
    }

    @RequestMapping("/secondController.do")//@RequestMapping可以直接给这个方法设置请求路径, 之前@WebServlet是给servlet类设置请求路径
    public String secondController(){
        System.out.println("secondController");
        //进行一系列处理之后, 进行页面的跳转
        return "first";
    }

    @RequestMapping(value = {"/success.do", "/success.action"})
    public String test1(){
        return "success";
    }

    @RequestMapping(value = "/testRequest", method = {RequestMethod.GET, RequestMethod.POST})
    public String testRequest(){
        System.out.println("testRequest");
        return "success";
    }

    @RequestMapping(value = "/testRequest2", params = {"username!=root", "password"})
    public String testRequest2(){
        System.out.println("testRequest2");
        return "success";
    }

    @RequestMapping(value = "/testRequest3", headers = "Accept-Encoding=gzip, deflate, br")
    public String testRequest3(){
        System.out.println("testRequest3");
        return "success";
    }
}
