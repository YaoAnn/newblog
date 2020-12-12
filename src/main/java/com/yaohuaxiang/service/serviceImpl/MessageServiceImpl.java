package com.yaohuaxiang.service.serviceImpl;

import com.yaohuaxiang.bean.Message;
import com.yaohuaxiang.bean.Result;
import com.yaohuaxiang.dao.MessageDao;
import com.yaohuaxiang.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 11:26
 */

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired(required = false)
    MessageDao messageDao;

    @Override
    public Result getAllMessage() {
        try {
            List<Message> messages = messageDao.getAllMessage();
            return Result.newInstance4Success(messages);
        }catch (Exception e){
            e.printStackTrace();
            return Result.newInstance4Failure();
        }
    }

    @Override
    public Result addMessage(Message message) {
        try {
            messageDao.addMessage(message);
            return Result.newInstance4Success(null);
        }catch (Exception e){
            e.printStackTrace();
            return Result.newInstance4Failure();
        }
    }

    @Override
    public Result deleteMessage(Integer id) {
        try{
            messageDao.deleteMessage(id);
            return Result.newInstance4Success(null);
        }catch (Exception e){
            e.printStackTrace();
            return Result.newInstance4Failure();
        }
    }
}
