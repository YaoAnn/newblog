package com.yaohuaxiang.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
/**
 * @author yaohuaxiang
 * @create 2020/12/10 - 14:49
 */

//博客实体,对应数据库blogs
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog implements Serializable {
    private Integer id;
    private String title;
    private Date createTime;
    private String content;
}
