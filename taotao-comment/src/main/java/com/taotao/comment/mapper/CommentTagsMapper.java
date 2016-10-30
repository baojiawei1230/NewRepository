package com.taotao.comment.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.abel533.mapper.Mapper;
import com.taotao.comment.pojo.CommentTags;

public interface CommentTagsMapper extends Mapper<CommentTags>{

    List<CommentTags> findCommentTags(@Param("itemId")Long itemId);

}
