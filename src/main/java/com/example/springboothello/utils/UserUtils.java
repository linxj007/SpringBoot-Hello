package com.example.springboothello.utils;

import com.example.springboothello.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lxj
 * @create 2022-09-03 23:12
 */
public class UserUtils {

   public static List<User> getUserList(){
      List<User> list = new ArrayList<>();
      for (int i = 0; i < 10; i++) {
         User user = new User((long) i, "aa" + i, i);
         list.add(user);
      }
      return list;
   }
}
