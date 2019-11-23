package com.lrm.blog.service;

import com.lrm.blog.po.User;

/**
 * @author 追梦
 */
public interface UserService {

    User checkUser(String username,String password);
}
