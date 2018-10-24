package com.onlineexam.dao;

import com.onlineexam.pojo.Options;
import com.onlineexam.pojo.OptionsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OptionsMapper {
    long countByExample(OptionsExample example);

    int deleteByExample(OptionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Options record);

    int insertSelective(Options record);

    List<Options> selectByExample(OptionsExample example);

    Options selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Options record, @Param("example") OptionsExample example);

    int updateByExample(@Param("record") Options record, @Param("example") OptionsExample example);

    int updateByPrimaryKeySelective(Options record);

    int updateByPrimaryKey(Options record);
}