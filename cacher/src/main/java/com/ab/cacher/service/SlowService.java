package com.ab.cacher.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class SlowService {

    @Cacheable(value="getData")
    public String getData() throws InterruptedException {

        Thread.sleep(3000);
        System.out.println("from slow service");
        return "here is ur data";
    }
}
