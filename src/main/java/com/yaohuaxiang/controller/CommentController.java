package com.yaohuaxiang.controller;

import com.yaohuaxiang.bean.Comment;
import com.yaohuaxiang.bean.Result;
import com.yaohuaxiang.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 9:28
 */
@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping("/comment/{id}")
    public Result getAllCommentByBlog(@PathVariable("id")Integer id){
        return commentService.getAllCommentByBlog(id);
    }

    @PostMapping("/comment/{id}")
    public Result addComment(@PathVariable("id")Integer id, Comment comment){
        return commentService.addComment(id,comment);
    }

    @GetMapping("/comment")
    public Result getAllComment(){
        return commentService.getAllComment();
    }

    @DeleteMapping("/comment/{id}")
    public Result deleteComment(@PathVariable("id")Integer id){
        return commentService.deleteComment(id);
    }
}