package com.baizhi.git_2004.dao;

import com.baizhi.git_2004.entity.User;

import java.util.List;

public interface UserDao {

    List<User> queryAll();

    User queryById(String id);

}
