package com.icss.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.hotel.dao.TypeDao;
import com.icss.hotel.pojo.Type;
import com.icss.hotel.service.TypeService;
@Service
public class TypeServiceImpl implements TypeService {
	@Autowired
	TypeDao dao;
	@Override
	public List<Type> selectAllType() {
		// TODO Auto-generated method stub
		List<Type> list = dao.selectAllType();
		System.out.println("service"+list);
		return list;
	}
	@Override
	public int addType(Type e) {
		// TODO Auto-generated method stub
		return dao.addType(e);
	}
	@Override
	public int deleteTypeById(String tno) {
		// TODO Auto-generated method stub
		return dao.deleteTypeById(tno);
	}
	@Override
	public int updateTypeById(Type t) {
		// TODO Auto-generated method stub
		return dao.updateTypeById(t);
	}

}
