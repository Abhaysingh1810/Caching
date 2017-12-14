package com.cacher.redis.cacherredis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

@SpringBootApplication
@EnableCaching
public class CacherRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacherRedisApplication.class, args);
	}
/*
	@Bean
	public CacheManager cacheManager(){
		RedisCacheManager redisCacheManager=new RedisCacheManager(redisTemplate());
		redisCacheManager.setDefaultExpiration(300);
		return redisCacheManager;
	}

	@Bean
	public RedisTemplate redisTemplate(){
		RedisTemplate redisTemplate=new RedisTemplate();
		redisTemplate.setConnectionFactory(redisConnectionFactory());
		return redisTemplate;
	}

   @Bean
   public JedisConnectionFactory redisConnectionFactory(){
	   JedisPoolConfig poolConfig = new JedisPoolConfig();
	   poolConfig.setMaxTotal(10);
	   poolConfig.setMaxIdle(5);
	   poolConfig.setMinIdle(1);
		JedisConnectionFactory jedisConnectionFactory=new JedisConnectionFactory(poolConfig);
		jedisConnectionFactory.setHostName("127.0.0.1");
		jedisConnectionFactory.setPort(6376);
		return jedisConnectionFactory;
   }
*/

}
