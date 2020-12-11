package com.yaohuaxiang.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 9:10
 * 评论实体
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comment implements Serializable {
    private Integer id;
    private String content;
    private Blog blog;
}
