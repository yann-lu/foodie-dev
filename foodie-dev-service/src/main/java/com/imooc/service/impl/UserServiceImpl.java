/**
 * Copyright (c) 2019-2019 All Rights Reserved.
 */
package com.imooc.service.impl;

import com.imooc.mapper.UsersMapper;
import com.imooc.pojo.Users;
import com.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * @author 陆炎
 * @version : UserServiceImpl.java, v0.1 2019/11/27 陆炎 Exp $$
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public boolean queryUserNameIsExist(String userName) {
        Users users = usersMapper.selectOneByExample(new Example(Users.class) {
            {
                createCriteria().andEqualTo("username", userName);
            }
        });
        return users == null ? false : true;
    }
}