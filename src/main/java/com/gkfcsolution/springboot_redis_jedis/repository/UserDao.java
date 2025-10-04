package com.gkfcsolution.springboot_redis_jedis.repository;

import com.gkfcsolution.springboot_redis_jedis.model.User;

import java.util.List;

/**
 * Created on 2025 at 20:36
 * File: null.java
 * Project: springboot_Redis_Jedis
 *
 * @author Frank GUEKENG
 * @date 04/10/2025
 * @time 20:36
 */
public interface UserDao {
    boolean saveUser(User user);

    List<User> fetchAllUser();
}
