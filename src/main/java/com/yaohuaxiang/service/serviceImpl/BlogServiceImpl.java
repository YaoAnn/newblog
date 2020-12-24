package com.yaohuaxiang.service.serviceImpl;

import com.yaohuaxiang.bean.Blog;
import com.yaohuaxiang.bean.Result;
import com.yaohuaxiang.dao.BlogDao;
import com.yaohuaxiang.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/12/10 - 15:00
 */

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired(required = false)
    BlogDao blogDao;

    @Override
    public Result getAllBlog() {
        try{
            List<Blog> blogs = blogDao.getAllBlog();
            return Result.newInstance4Success(blogs);
        }catch (Exception e){
            e.printStackTrace();
            return Result.newInstance4Failure();
        }
    }

    @Override
    public Result getBlogById(Integer id) {
        try{
            Blog blog = blogDao.getBlogById(id);
            return Result.newInstance4Success(blog);
        }catch (Exception e){
            e.printStackTrace();
            return Result.newInstance4Failure();
        }
    }

    @Override
    @Transactional
    public Result deleteBlog(Integer id) {
        try{
            blogDao.deleteBlog(id);
            return Result.newInstance4Success(null);
        }catch (Exception e){
            e.printStackTrace();
            return Result.newInstance4Failure();
        }
    }

    @Override
    @Transactional
    public Result saveBlog(Blog blog) {
        try{
            if(blog.getId()!=null){
                blogDao.updateBlog(blog);
            }else{
                blogDao.addBlog(blog);
            }
            return Result.newInstance4Success(blog);
        }catch (Exception e){
            e.printStackTrace();
            return Result.newInstance4Failure();
        }
    }
}
