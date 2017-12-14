package com.ab.cacher.controller;


import com.ab.cacher.service.SlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacherController {

    @Autowired
    SlowService slowService;

    @RequestMapping("/endpoint")
    public String getEndpoint() {

        return "hello";
    }

    @RequestMapping("/data")
    public String getData() throws InterruptedException {
        return slowService.getData();
    }
}
