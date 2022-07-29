package com.dzh.service.Impl;

import com.dzh.entity.Users;
import com.dzh.mapper.UserMapper;
import com.dzh.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    /**
     * ������ע��
     * @param userMapper ������
     */
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<Users> findAll() {
        return userMapper.findAll();
    }
}
