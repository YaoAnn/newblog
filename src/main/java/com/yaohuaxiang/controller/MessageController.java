package com.yaohuaxiang.controller;

import com.yaohuaxiang.bean.Result;
import com.yaohuaxiang.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 11:27
 */

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/get")
    Result getAllMessage(){
        return messageService.getAllMessage();
    }
}
