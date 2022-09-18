package com.example.springboothello.dao;

import com.example.springboothello.pojo.User;
import com.example.springboothello.pojo.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lxj
 * @create 2022-07-07 16:10
 */
@Mapper
public interface UserDao {

   List<User> findAllByIds(@Param("ids") List<Long> ids);

   List<User> findAll(@Param("userDto")UserDto userDto);


}
