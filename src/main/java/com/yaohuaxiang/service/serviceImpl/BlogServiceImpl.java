package com.yaohuaxiang.service.serviceImpl;

import com.yaohuaxiang.bean.Blog;
import com.yaohuaxiang.bean.Result;
import com.yaohuaxiang.dao.BlogDao;
import com.yaohuaxiang.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
            return new Result(true,blogs,"返回数据成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,null,"获取数据错误");
        }
    }

    @Override
    public Result getBlogById(Integer id) {
        try{
            Blog blog = blogDao.getBlogById(id);
            return new Result(true,blog,"获取数据成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,null,"获取数据失败");
        }
    }
}
