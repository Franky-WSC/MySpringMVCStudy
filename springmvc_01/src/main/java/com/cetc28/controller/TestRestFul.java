package com.cetc28.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: WSC
 * @version: 1.0
 */
@RestController
public class TestRestFul {
    @RequestMapping(value = "testRest/{id}", method = RequestMethod.GET)
    public String testGET(@PathVariable("id") String id){
        System.out.println("testGET : " + id);
        return "success";
    }

    @RequestMapping(value = "testRest/{id}", method = RequestMethod.POST)
    public String testPOST(@PathVariable("id") String id){
        System.out.println("testPOST : " + id);
        return "success";
    }

    @RequestMapping(value = "testRest/{id}", method = RequestMethod.PUT)
    public String testPUT(@PathVariable("id") String id){
        System.out.println("testPUT : " + id);
        return "success";
    }

    @RequestMapping(value = "testRest/{id}", method = RequestMethod.DELETE)
    public String testDELETE(@PathVariable("id") String id){
        System.out.println("testDELETE : " + id);
        return "success";
    }
}
