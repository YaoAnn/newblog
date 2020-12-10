package com.yaohuaxiang.dao;

import com.yaohuaxiang.bean.Blog;
import com.yaohuaxiang.bean.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/12/10 - 14:53
 */
//博客持久层

@Mapper
public interface BlogDao {
    List<Blog> getAllBlog();
    Blog getBlogById(Integer id);
}
