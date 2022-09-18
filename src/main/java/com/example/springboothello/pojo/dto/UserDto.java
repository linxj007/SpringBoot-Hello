package com.example.springboothello.pojo.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lxj
 * @create 2022-09-17 22:58
 */
@Data
public class UserDto implements Serializable {

   private String name;

   private List<Long> ids;
}
