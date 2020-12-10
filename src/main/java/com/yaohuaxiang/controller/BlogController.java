package com.yaohuaxiang.controller;

import com.yaohuaxiang.bean.Result;
import com.yaohuaxiang.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaohuaxiang
 * @create 2020/12/10 - 15:01
 */

@RestController
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("/get")
    public Result getAllBlog(){
        return blogService.getAllBlog();
    }

    @GetMapping("/get/{id}")
    public Result getBlogById(@PathVariable("id")Integer id){
        return blogService.getBlogById(id);
    }
}
