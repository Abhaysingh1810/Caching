package com.ab.cacher.distributedstore;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;

public class DistributedMap {

   private static  HazelcastInstance hazelcastInstance= Hazelcast.newHazelcastInstance();

   private static Map<Integer,String> dMap=hazelcastInstance.getMap("dmap");

   static {

       dMap.put(1,"abhay");
       dMap.put(2,"singh");
   }

   public static String getValue(int i) throws InterruptedException {
       System.out.println("getting value from map");
      // Thread.sleep(5000);
        return dMap.getOrDefault(i,"no Value");
   }

    public static void updateValue(int id,String value){
        System.out.println("putting  value in map");
        dMap.put(id,value);
    }



}
