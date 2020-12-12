package com.yaohuaxiang.service;

import com.yaohuaxiang.bean.Comment;
import com.yaohuaxiang.bean.Result;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/12/11 - 9:21
 */
public interface CommentService {
    Result getAllComment(Integer id);

    Result addComment(Integer id , Comment comment);

    Result deleteComment(Integer id);
}
