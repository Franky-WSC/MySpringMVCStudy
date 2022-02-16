package com.cetc28.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: WSC
 * @version: 1.0
 */
@Controller
public class PathController {
    @RequestMapping("/testPathVariable/{id}/{username}")
    public String testPathVariable(@PathVariable("id") Integer id, @PathVariable("username") String username){
        System.out.println("testPathVariable1");
        System.out.println("id : " + id);
        System.out.println("username : " + username);
        return "success";
    }
}
