package com.cetc28.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: WSC
 * @version: 1.0
 */
@RestController
public class TestDataController {
    //紧耦合方式参数注入
    //使用传统的HttpServletRequest对象获取参数 要导jar包-javax.servlet 因此是紧耦合
    @RequestMapping("/getParamByRequest.do")
    public String getParam1(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username : " + username + "   password : " + password);
        return "getParamSuccess";
    }

    //解耦合方式参数注入
    //HttpServletRequest对象获取参数,通过SpringMVC框架功能,自动转换参数,不用导jar包
    //处理单元参数列表中参数名必须和请求中的参数名一致, 如果不一致会找不到, 比如pwd-password就要用@RequestParam("pwd")
    @RequestMapping("/getParamByArgName.do")
    public String getParam2(String username, @RequestParam("pwd") String password ){
        System.out.println("username : " + username + "   password : " + password);
        return "getParamSuccess";
    }

}
