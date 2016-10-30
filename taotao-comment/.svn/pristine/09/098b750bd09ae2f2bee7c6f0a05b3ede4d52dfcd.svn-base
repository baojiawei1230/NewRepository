package com.taotao.comment.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.abel533.mapper.Mapper;
import com.taotao.comment.pojo.Comments;

public interface CommentsMapper extends Mapper<Comments>{

    List<Comments> queryCommentsByProductId(@Param("itemId")Long itemId);

    
    
}
