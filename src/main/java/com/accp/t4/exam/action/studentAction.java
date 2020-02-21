package com.accp.t4.exam.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.t4.exam.biz.studentBiz;
import com.accp.t4.exam.pojo.student;
import com.accp.t4.exam.pojo.studentcj;
import com.accp.t4.exam.pojo.vo;

@RestController
@RequestMapping("/api/student")
public class studentAction {
 @Autowired 
 studentBiz biz;
 @GetMapping()
 		public List<student> find(){
	return biz.find();
 }
 		 @GetMapping("/studentss/{name1}")
  		public List<vo> find1(@PathVariable String name1){
  				return biz.find1(name1);
  }
  		 @PostMapping("/studentss")
   		public Map<String,String> add(@RequestBody studentcj mess){
  			Map<String,String> map=new HashMap<String, String>();
  			
  			int js= biz.add1(mess);
  			if (js>0) {
  				map.put("code","200");	
  				return map;
  			}
  			map.put("code","500");	
  			return map;
   			
   }
 		
}
