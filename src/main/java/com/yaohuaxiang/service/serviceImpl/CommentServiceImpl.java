package com.yaohuaxiang.service.serviceImpl;

import com.yaohuaxiang.bean.Blog;
import com.yaohuaxiang.bean.Comment;
import com.yaohuaxiang.bean.Result;
import com.yaohuaxiang.dao.BlogDao;
import com.yaohuaxiang.dao.CommentDao;
import com.yaohuaxiang.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 9:21
 */

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired(required = false)
    CommentDao commentDao;

    @Autowired(required = false)
    BlogDao blogDao;

    @Override
    public Result getAllCommentByBlog(Integer id) {
        try {
            Blog blog = blogDao.getBlogById(id);
            List<Comment> comments = commentDao.getAllCommentByBlog(blog);
            return Result.newInstance4Success(comments);
        }catch (Exception e){
            e.printStackTrace();
            return Result.newInstance4Failure();
        }

    }

    @Override
    public Result addComment(Integer id, Comment comment) {
        try {
            Blog blog = blogDao.getBlogById(id);
            comment.setBlog(blog);
            commentDao.addComment(comment);
            return Result.newInstance4Success(comment);
        }catch (Exception e){
            e.printStackTrace();
            return Result.newInstance4Failure();
        }
    }

    @Override
    public Result getAllComment() {
        try{
            List<Comment> comments = commentDao.getAllComment();
            return Result.newInstance4Success(comments);
        }catch (Exception e){
            e.printStackTrace();
            return Result.newInstance4Failure();
        }
    }

    @Override
    public Result deleteComment(Integer id) {
        try{
            commentDao.deleteComment(id);
            return Result.newInstance4Success(null);
        }catch (Exception e){
            e.printStackTrace();
            return Result.newInstance4Failure();
        }
    }
}
