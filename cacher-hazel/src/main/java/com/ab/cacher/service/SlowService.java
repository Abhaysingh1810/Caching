package com.ab.cacher.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class SlowService {

      @Cacheable(value="getData",key="#id")
    public String getData(int id) throws InterruptedException {

        Thread.sleep(7000);
        System.out.println("from slow service id is "+id);
        return "here is ur data "+id;
    }
}
