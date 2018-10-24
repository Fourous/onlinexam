package com.onlineexam.dao;

import com.onlineexam.pojo.Questions;
import com.onlineexam.pojo.QuestionsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionsMapper {
    long countByExample(QuestionsExample example);

    int deleteByExample(QuestionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Questions record);

    int insertSelective(Questions record);

    List<Questions> selectByExample(QuestionsExample example);

    Questions selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Questions record, @Param("example") QuestionsExample example);

    int updateByExample(@Param("record") Questions record, @Param("example") QuestionsExample example);

    int updateByPrimaryKeySelective(Questions record);

    int updateByPrimaryKey(Questions record);
}