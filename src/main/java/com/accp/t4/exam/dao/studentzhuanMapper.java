package com.accp.t4.exam.dao;

import com.accp.t4.exam.pojo.studentzhuan;

public interface studentzhuanMapper {
    int deleteByPrimaryKey(Integer zhuanid);

    int insert(studentzhuan record);

    int insertSelective(studentzhuan record);

    studentzhuan selectByPrimaryKey(Integer zhuanid);

    int updateByPrimaryKeySelective(studentzhuan record);

    int updateByPrimaryKey(studentzhuan record);
}