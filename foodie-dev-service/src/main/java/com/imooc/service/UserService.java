package com.imooc.service;

/**
 * @author 陆炎
 * @version : UserService.java, v0.1 2019/11/27 陆炎 Exp $$
 */
public interface UserService {

    /**
     * 判断用户名是否存在
     */
    boolean queryUserNameIsExist(String userName);
}
