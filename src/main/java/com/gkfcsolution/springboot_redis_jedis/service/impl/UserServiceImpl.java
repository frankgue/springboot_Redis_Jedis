package com.gkfcsolution.springboot_redis_jedis.service.impl;

import com.gkfcsolution.springboot_redis_jedis.model.User;
import com.gkfcsolution.springboot_redis_jedis.repository.UserDao;
import com.gkfcsolution.springboot_redis_jedis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public boolean saveUser(User user) {

        return userDao.saveUser(user);
    }

    @Override
    public List<User> fetchAllUser() {
        return userDao.fetchAllUser();
    }
}
