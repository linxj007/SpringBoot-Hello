package com.example.springboothello.dao;

import com.example.springboothello.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lxj
 * @create 2022-09-17 13:09
 */
@Mapper
public interface UserInfoDao {

   List<UserInfo> findAll();
}
