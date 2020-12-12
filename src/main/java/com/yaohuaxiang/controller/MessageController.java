package com.yaohuaxiang.controller;

import com.yaohuaxiang.bean.Message;
import com.yaohuaxiang.bean.Result;
import com.yaohuaxiang.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 11:27
 */

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/message")
    Result getAllMessage(){
        return messageService.getAllMessage();
    }

    @PostMapping("/message")
    Result addMessage(Message message){
        return messageService.addMessage(message);
    }

    @DeleteMapping("/message/{id}")
    Result deleteMessage(@PathVariable("id") Integer id){
        return  messageService.deleteMessage(id);
    }
}
