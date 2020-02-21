package com.accp.t4.exam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.t4.exam.pojo.vo;
import com.accp.t4.exam.pojo.student;



public interface studentMapper {
    int deleteByPrimaryKey(Integer studentid);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(Integer studentid);
    List<student> selectByPrimaryKey1();
    List<vo> selectByPrimaryKey2(@Param("studentname") String name);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
}