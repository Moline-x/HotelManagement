package com.icss.hotel.controller;

import java.util.Map;
import java.util.HashMap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icss.hotel.pojo.Emp;
import com.icss.hotel.pojo.Type;
import com.icss.hotel.service.EmpService;
import com.icss.hotel.service.RoomService;
import com.icss.hotel.service.TypeService;

/**
 * 请求转发
 * @author Moline-x
 *
 */
@Controller
public class EmpController {
	
	@Autowired
	EmpService service;
	@Autowired
	TypeService tservice;
	@Autowired
	RoomService rservice;
	
	//登录
	@RequestMapping("/login")
	@ResponseBody
	public Object login(String account,String password) {
		//逻辑处理 service
		Emp e = service.login(account,password);
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("emp",e);
		if(e != null) {
			map.put("state","success");
		}else {
			map.put("state","fail");
		}
		
		return map;
	}
	
	//检查密码
	@RequestMapping("/checkPwd")
	@ResponseBody
	public Object checkPwd(String password) {
		//逻辑处理 service
		Emp e = service.checkPwd(password);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("emp", e);
		if(e != null){
			map.put("state","success");
		}else {
			map.put("state","fail");
		}
		
		return map;
	}
	
	//查询所有员工信息
	@RequestMapping("/selectAllEmp")
	@ResponseBody
	public Object selectAllEmp() {
		List<Emp> list = service.selectAllEmp();
		return list;
	}
	
	
	//增加员工信息
	@RequestMapping("/addEmp")
	@ResponseBody
	public Object addEmp(Emp e) {
		int i = service.addEmp(e);
		if(i>0) {
			return "success";
		}else {
			return "fail";
		}
	}

	
	//查询所有员工信息
	@RequestMapping("/selectByEmpno")
	@ResponseBody
	public Object selectByEmpno(Integer empno) {
		
		Emp emp = service.selectByEmpno(empno);
		System.out.println("emp"+emp);
		return emp;
	}
	
	//更新个人信息 
		@RequestMapping("/updateEmpById")
		@ResponseBody
		public Object updateEmpById(String empno,String ename,String gender,String birth,String phone) {
			Integer empno2 = Integer.parseInt(empno);
					
			Emp e = new Emp(empno2,ename,gender,birth,phone);
			System.out.println(e);
			int i = service.updateEmpById(e);
			System.out.println(i);
			if(i > 0) {
				return "success";
			}else {
				return "fail";
			}
		}
	//更新个人密码信息 
		@RequestMapping("/updateEmpPassword")
		@ResponseBody
		public Object updateEmpPassword(String empno,String password) {

			Integer empno2 = Integer.parseInt(empno);
			Emp e = new Emp(empno2,password);
			System.out.println(e+"a");
			int i = service.updateEmpPassword(e);
			System.out.println(i);
			if(i > 0) {
				return "success";
			}else {
				return "fail";
			}
		}
	//修改员工信息
		@RequestMapping("/updateEmp")
		@ResponseBody
		public Object updateEmp(String empno, String state, String roleid) {

			Integer empno2 = Integer.parseInt(empno);
			Integer state1 = Integer.parseInt(state);
			Integer roleid1 = Integer.parseInt(roleid);
			
			Emp e = new Emp(empno2,state1,roleid1);
			System.out.println(e+"a");
			int i = service.updateEmp(e);
			System.out.println(i);
			if(i > 0) {
				return "success";
			}else {
				return "fail";
			}
		}
}
