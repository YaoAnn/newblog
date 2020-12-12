package com.yaohuaxiang.dao;

import com.yaohuaxiang.bean.Blog;
import com.yaohuaxiang.bean.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 9:15
 */

@Mapper
public interface CommentDao {
    List<Comment> getAllComment(Blog blog);

    void addComment(Comment comment);

    void deleteComment(Integer id);

}
