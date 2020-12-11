package com.yaohuaxiang.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 11:23
 * 留言实体类
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message implements Serializable {
    private Integer id;
    private String content;
}
