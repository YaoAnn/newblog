package com.yaohuaxiang.controller;

import com.yaohuaxiang.bean.Result;
import com.yaohuaxiang.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 9:28
 */
@RequestMapping("/comment")
@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping("/get/{id}")
    public Result getAllComment(@PathVariable("id")Integer id){
        return commentService.getAllComment(id);
    }
}
