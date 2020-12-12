package com.yaohuaxiang.dao;

import com.yaohuaxiang.bean.Message;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 11:25
 */

@Mapper
public interface MessageDao {
    List<Message> getAllMessage();

    //底下没有写好
    void addMessage(Message message);

    void deleteMessage(Integer id);
}
