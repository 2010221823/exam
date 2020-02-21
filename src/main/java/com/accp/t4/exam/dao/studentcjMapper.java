package com.accp.t4.exam.dao;

import com.accp.t4.exam.pojo.studentcj;

public interface studentcjMapper {
    int deleteByPrimaryKey(Integer xsid);

    int insert(studentcj record);

    int insertSelective(studentcj record);

    studentcj selectByPrimaryKey(Integer xsid);

    int updateByPrimaryKeySelective(studentcj record);

    int updateByPrimaryKey(studentcj record);
}