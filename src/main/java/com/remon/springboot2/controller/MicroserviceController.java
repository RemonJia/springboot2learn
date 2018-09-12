package com.remon.springboot2.controller;

@RestController
@EnableAutoConfiguration
public class MicroserviceController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
