package com.hwua.service;

import com.hwua.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectUser();

    List<User> selectAllUser();

    List<User> getAllUser();
}
