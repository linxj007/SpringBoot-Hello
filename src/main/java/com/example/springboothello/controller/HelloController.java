package com.example.springboothello.controller;

import com.example.springboothello.pojo.User;
import com.example.springboothello.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }


    @GetMapping("/hello1")
    public String hello1(){
        return "hello world!";
    }

    @GetMapping("/user/{pageNum}/{pageSize}")
    public Map<String, Object> pageUser(@PathVariable("pageNum") Integer pageNum,
                                        @PathVariable("pageSize") Integer pageSize) {

        Map<String, Object> map = new HashMap<>();
        // 分页
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userService.findAll();

        map.put("data",userList);
        map.put("total",page.getTotal());
        map.put("pageNum",page.getPageNum());
        map.put("pages",page.getPages());
        map.put("pageSize",page.getPageSize());
        return map;
    }
}
