package com.ab.cacher.controller;


import com.ab.cacher.distributedstore.DistributedMap;
import com.ab.cacher.service.SlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CacherController {

    @Autowired
    SlowService slowService;

    DistributedMap distributedMap=new DistributedMap();

    @RequestMapping("/endpoint")
    public String getEndpoint() {

        return "hello";
    }

    @RequestMapping("/data/{id}")
    public String getData(@PathVariable("id") int id) throws InterruptedException {
        return slowService.getData(id);
    }

    @RequestMapping("/value/{id}")
    public String getValue(@PathVariable("id") int id) throws InterruptedException {
        return distributedMap.getValue(id);
    }

    @RequestMapping(value = "/value/{id}/{value}",method = RequestMethod.PUT)
    public void putValue(@PathVariable("id") int id,@PathVariable("value") String value) throws InterruptedException {
        DistributedMap.updateValue(id,value);
    }
}
