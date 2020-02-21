package com.accp.t4.exam.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.t4.exam.dao.studentMapper;
import com.accp.t4.exam.dao.studentcjMapper;
import com.accp.t4.exam.pojo.student;
import com.accp.t4.exam.pojo.studentcj;
import com.accp.t4.exam.pojo.vo;

@Service("studentBiz")
public class studentBiz {
      @Autowired
    private  studentMapper dao;
      @Autowired
      private studentcjMapper  dao1;
      public List<student>  find(){
    	return dao.selectByPrimaryKey1();  
      }
      public List<vo>  find1(String name){
      	return dao.selectByPrimaryKey2(name);  
        }
      public int  add1(studentcj dx){
        	return dao1.insertSelective(dx);
          }
}
