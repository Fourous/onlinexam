package com.onlineexam.dao;

import com.onlineexam.pojo.PermissionRole;
import com.onlineexam.pojo.PermissionRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionRoleMapper {
    long countByExample(PermissionRoleExample example);

    int deleteByExample(PermissionRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PermissionRole record);

    int insertSelective(PermissionRole record);

    List<PermissionRole> selectByExample(PermissionRoleExample example);

    PermissionRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PermissionRole record, @Param("example") PermissionRoleExample example);

    int updateByExample(@Param("record") PermissionRole record, @Param("example") PermissionRoleExample example);

    int updateByPrimaryKeySelective(PermissionRole record);

    int updateByPrimaryKey(PermissionRole record);
}