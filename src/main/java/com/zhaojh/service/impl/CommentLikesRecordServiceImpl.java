package com.zhaojh.service.impl;

import com.zhaojh.mapper.CommentLikesMapper;
import com.zhaojh.model.CommentLikesRecord;
import com.zhaojh.service.CommentLikesRecordService;
import com.zhaojh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentLikesRecordServiceImpl implements CommentLikesRecordService {

    @Autowired
    CommentLikesMapper commentLikesMapper;
    @Autowired
    UserService userService;

    @Override
    public boolean isLiked(long articleId, long pId, String username) {
        return commentLikesMapper.isLiked(articleId, pId, userService.findIdByUsername(username)) != null;
    }

    @Override
    public void insertCommentLikesRecord(CommentLikesRecord commentLikesRecord) {
        commentLikesMapper.insertCommentLikesRecord(commentLikesRecord);
    }

    @Override
    public void deleteCommentLikesRecordByArticleId(long articleId) {
        commentLikesMapper.deleteCommentLikesRecordByArticleId(articleId);
    }
}
