package com.yaohuaxiang.service.serviceImpl;

import com.yaohuaxiang.bean.Comment;
import com.yaohuaxiang.bean.Result;
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

    @Override
    public Result getAllComment(Integer id) {
        try {
            List<Comment> comments = commentDao.getAllComment(id);
            return new Result(true,comments,"返回数据成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,null,"获取数据错误");
        }

    }
}
