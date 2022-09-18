package com.example.springboothello;

import com.alibaba.fastjson2.JSON;
import com.example.springboothello.dao.UserDao;
import com.example.springboothello.dao.UserInfoDao;
import com.example.springboothello.pojo.User;
import com.example.springboothello.pojo.dto.UserDto;
import com.example.springboothello.pojo.dto.UserInfoDto;
import com.example.springboothello.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootHelloApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private UserDao userDao;


    @Test
    public void pageUser(){
        PageHelper.startPage(1,5);
        List<User> userList = userService.findAll();
        PageInfo<User> userPageInfo = new PageInfo<>(userList);

        System.out.println(userPageInfo.getList());
    }

    @Test
    public void aa(){
        UserDto userDto = new UserDto();
        userDto.setName("Jack");
//        userDto.setIds(Arrays.asList(1L,2L));
        List<User> userList = userDao.findAll(userDto);
        System.out.println(userList);
    }

    @Test
    public void bb(){
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setPageNum(1);
        userInfoDto.setPageSize(10);
        PageInfo<User> pageInfo = userService.pageUser(userInfoDto);
        System.out.println(JSON.toJSONString(pageInfo));

    }

}
