package com.yaohuaxiang.dao;

import com.yaohuaxiang.bean.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 11:25
 */

@Mapper
public interface MessageDao {
    List<Message> getAllMessage();
}
