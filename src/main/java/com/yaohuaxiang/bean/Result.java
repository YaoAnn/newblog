package com.yaohuaxiang.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yaohuaxiang
 * @create 2020/12/10 - 15:27
 * 通用的返回类型
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {
    private Boolean successful = true;//返回状态码
    private T data;//返回数据
    private String msg;//返回消息

}
