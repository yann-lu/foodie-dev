package com.imooc.service;

import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;

/**
 * @author 陆炎
 * @version : UserService.java, v0.1 2019/11/27 陆炎 Exp $$
 */
public interface UserService {

    /**
     * 判断用户名是否存在
     * @param userName
     * @return boolean
     */
    boolean queryUserNameIsExist(String userName);

    /**
     * 新建用户
     * @param userBO
     * @return Users
     */
    Users createUser(UserBO userBO);
}
