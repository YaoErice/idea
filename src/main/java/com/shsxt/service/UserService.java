package com.shsxt.service;

import com.shsxt.base.BaseMapper;
import com.shsxt.base.BaseService;
import com.shsxt.dao.UserMapper;
import com.shsxt.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService extends BaseService<User> {
    @Autowired
    private UserMapper userMapper;
}
