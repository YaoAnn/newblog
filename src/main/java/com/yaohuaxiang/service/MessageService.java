package com.yaohuaxiang.service;

import com.yaohuaxiang.bean.Message;
import com.yaohuaxiang.bean.Result;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 11:25
 */
public interface MessageService {
    Result getAllMessage();

    Result addMessage(Message message);

    Result deleteMessage(Integer id);
}
