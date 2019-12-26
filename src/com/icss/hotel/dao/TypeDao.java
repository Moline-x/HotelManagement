package com.icss.hotel.dao;

import java.util.List;

import com.icss.hotel.pojo.Type;

public interface TypeDao {

	List<Type> selectAllType();

	int addType(Type e);

}
