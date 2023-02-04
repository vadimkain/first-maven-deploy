package com.kainv.service;

import com.kainv.database.dao.UserDao;
import com.kainv.database.entity.User;
import com.kainv.dto.UserDto;

import java.util.Optional;

public class UserService {
    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        Optional<User> byId = userDao.findById(id);
        return byId.map(it -> new UserDto());
    }
}
