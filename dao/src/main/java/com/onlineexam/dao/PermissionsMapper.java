package com.onlineexam.dao;

import com.onlineexam.pojo.Permissions;
import com.onlineexam.pojo.PermissionsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionsMapper {
    long countByExample(PermissionsExample example);

    int deleteByExample(PermissionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Permissions record);

    int insertSelective(Permissions record);

    List<Permissions> selectByExample(PermissionsExample example);

    Permissions selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Permissions record, @Param("example") PermissionsExample example);

    int updateByExample(@Param("record") Permissions record, @Param("example") PermissionsExample example);

    int updateByPrimaryKeySelective(Permissions record);

    int updateByPrimaryKey(Permissions record);
}