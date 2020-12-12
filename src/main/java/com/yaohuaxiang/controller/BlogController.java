package com.yaohuaxiang.controller;

import com.yaohuaxiang.bean.Blog;
import com.yaohuaxiang.bean.Result;
import com.yaohuaxiang.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yaohuaxiang
 * @create 2020/12/10 - 15:01
 */

@RestController
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("/blog")
    public Result getAllBlog(){
        return blogService.getAllBlog();
    }

    @GetMapping("/blog/{id}")
    public Result getBlogById(@PathVariable("id")Integer id){
        return blogService.getBlogById(id);
    }

    @DeleteMapping("/blog/{id}")
    public Result deleteBlog(@PathVariable("id")Integer id){
        return blogService.deleteBlog(id);
    }

    @PutMapping("/blog/{id}")
    public Result updateBlog(@PathVariable("id")Integer id, Blog blog){
        blog.setId(id);
        return blogService.saveBlog(blog);
    }

    @PostMapping("/blog")
    public Result saveBlog(Blog blog){
        return blogService.saveBlog(blog);
    }
}
