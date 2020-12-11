package com.yaohuaxiang.dao;

import com.yaohuaxiang.bean.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 9:15
 */

@Mapper
public interface CommentDao {

    List<Comment> getAllComment(Integer id);
}
