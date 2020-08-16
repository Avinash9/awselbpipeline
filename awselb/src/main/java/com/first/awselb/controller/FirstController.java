package com.first.awselb.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/awselb")
public class FirstController {


    @RequestMapping(value = "/person", method = RequestMethod.GET , produces = "application/json")
    public String hello()
    {

        return "test123478909091608";
    }



}
