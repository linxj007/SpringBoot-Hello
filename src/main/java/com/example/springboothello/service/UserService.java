package com.example.springboothello.service;

import com.example.springboothello.pojo.User;
import com.example.springboothello.pojo.dto.UserInfoDto;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author lxj
 * @create 2022-09-17 12:51
 */
public interface UserService {
    List<User> findAll();

    PageInfo<User> pageUser(UserInfoDto userInfoDto);
}
