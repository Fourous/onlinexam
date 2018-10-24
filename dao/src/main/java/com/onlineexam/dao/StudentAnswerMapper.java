package com.onlineexam.dao;

import com.onlineexam.pojo.StudentAnswer;
import com.onlineexam.pojo.StudentAnswerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentAnswerMapper {
    long countByExample(StudentAnswerExample example);

    int deleteByExample(StudentAnswerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StudentAnswer record);

    int insertSelective(StudentAnswer record);

    List<StudentAnswer> selectByExample(StudentAnswerExample example);

    StudentAnswer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StudentAnswer record, @Param("example") StudentAnswerExample example);

    int updateByExample(@Param("record") StudentAnswer record, @Param("example") StudentAnswerExample example);

    int updateByPrimaryKeySelective(StudentAnswer record);

    int updateByPrimaryKey(StudentAnswer record);
}