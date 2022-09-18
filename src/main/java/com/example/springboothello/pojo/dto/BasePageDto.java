package com.example.springboothello.pojo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lxj
 * @create 2022-09-17 22:28
 * 分页传参公共dto
 */
@Data
public class BasePageDto implements Serializable {
   /**
    * 当前页
    */
   private Integer pageNum;

   /**
    * 每页数量
    */
   private Integer pageSize;
}
