package com.service;

import com.bean.User;
import com.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaoqiang
 * @date $(DATE)-$(TIME)
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findByUserId(Integer userId) {
        return userMapper.findByuserId(userId);
    }
}
