package com.example.springboothello.service;

import com.example.springboothello.dao.UserDao;
import com.example.springboothello.dao.UserInfoDao;
import com.example.springboothello.pojo.User;
import com.example.springboothello.pojo.UserInfo;
import com.example.springboothello.pojo.dto.UserDto;
import com.example.springboothello.pojo.dto.UserInfoDto;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lxj
 * @create 2022-09-17 12:55
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public List<User> findAll() {
//        return userDao.findAll();
        return null;
    }

    @Override
    public PageInfo<User> pageUser(UserInfoDto userInfoDto) {

        PageHelper.startPage(userInfoDto.getPageNum(), userInfoDto.getPageSize());

        List<UserInfo> infoList = userInfoDao.findAll();
        if (CollectionUtils.isEmpty(infoList)) {
            return new PageInfo<>(Collections.EMPTY_LIST);
        }

        List<Long> ids = infoList.stream().map(UserInfo::getUid).collect(Collectors.toList());
        UserDto userDto = new UserDto();
        userDto.setIds(ids);
        List<User> userList = userDao.findAll(userDto);
        return new PageInfo(userList);
//            PageInfo<User> pageInfo =new PageInfo<>(userList);
//            System.out.println(pageInfo);
//            String s = JSON.toJSONString(pageInfo);
//            System.out.println(s);


    }
}
