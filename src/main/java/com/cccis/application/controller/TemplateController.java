package com.cccis.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

    @GetMapping("/test")
    @ResponseBody
    public String getProviderTypes() {
        return "Test";
    }
}
