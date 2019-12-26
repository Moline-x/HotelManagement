package com.icss.hotel.service;

import java.util.List;

import com.icss.hotel.pojo.Type;

public interface TypeService  {

	List<Type> selectAllType();

	int addType(Type e);

	int deleteTypeById(String tno);

	int updateTypeById(Type t);

}
