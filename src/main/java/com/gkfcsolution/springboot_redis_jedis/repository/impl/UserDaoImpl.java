package com.gkfcsolution.springboot_redis_jedis.repository.impl;

import com.gkfcsolution.springboot_redis_jedis.model.User;
import com.gkfcsolution.springboot_redis_jedis.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created on 2025 at 20:37
 * File: null.java
 * Project: springboot_Redis_Jedis
 *
 * @author Frank GUEKENG
 * @date 04/10/2025
 * @time 20:37
 */
@Repository
public class UserDaoImpl implements UserDao {
private static final String KEY = "USER";
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public boolean saveUser(User user) {
        try {
            redisTemplate.opsForHash().put(KEY, user.getId().toString(), user);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<User> fetchAllUser() {
        List<User> users = redisTemplate.opsForHash().values(KEY);
        return users;
    }
}
