package com.gkfcsolution.springboot_redis_jedis.service;

import com.gkfcsolution.springboot_redis_jedis.model.User;

import java.util.List;

/**
 * Created on 2025 at 20:35
 * File: null.java
 * Project: springboot_Redis_Jedis
 *
 * @author Frank GUEKENG
 * @date 04/10/2025
 * @time 20:35
 */
public interface UserService {
    boolean saveUser(User user);

    List<User> fetchAllUser();
}
