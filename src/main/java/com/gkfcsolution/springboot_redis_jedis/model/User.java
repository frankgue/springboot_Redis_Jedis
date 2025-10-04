package com.gkfcsolution.springboot_redis_jedis.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created on 2025 at 20:26
 * File: null.java
 * Project: springboot_Redis_Jedis
 *
 * @author Frank GUEKENG
 * @date 04/10/2025
 * @time 20:26
 */
@Data
public class User implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;
}
