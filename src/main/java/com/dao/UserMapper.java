package com.dao;

import com.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author xiaoqiang
 * @date $(DATE)-$(TIME)
 */
@Repository
public interface UserMapper {
    public User findByuserId(Integer id);
}
