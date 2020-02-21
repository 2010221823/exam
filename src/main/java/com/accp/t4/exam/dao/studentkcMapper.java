package com.accp.t4.exam.dao;

import com.accp.t4.exam.pojo.studentkc;

public interface studentkcMapper {
    int deleteByPrimaryKey(Integer kcid);

    int insert(studentkc record);

    int insertSelective(studentkc record);

    studentkc selectByPrimaryKey(Integer kcid);

    int updateByPrimaryKeySelective(studentkc record);

    int updateByPrimaryKey(studentkc record);
}