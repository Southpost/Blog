package com.lrm.blog.dao;

import com.lrm.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 追梦
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);
}
