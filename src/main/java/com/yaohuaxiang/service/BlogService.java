package com.yaohuaxiang.service;

import com.yaohuaxiang.bean.Blog;
import com.yaohuaxiang.bean.Result;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/12/10 - 14:57
 */

public interface BlogService {
    Result getAllBlog();
    Result getBlogById(Integer id);
}
