package com.cacher.redis.cacherredis.controller;


import com.cacher.redis.cacherredis.service.SlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class CacheController {

    @Autowired
    SlowService slowService;

    @RequestMapping("/endpoint")
    public String getEndpoint() {

        return "hello";
    }

    @RequestMapping("/data/{id}")
    public String getData(@PathVariable("id") int id) throws InterruptedException {
        return slowService.getData(id);
    }
}