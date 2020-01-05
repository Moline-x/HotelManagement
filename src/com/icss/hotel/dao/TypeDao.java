package com.icss.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.hotel.pojo.Type;

public interface TypeDao {

	List<Type> selectAllType();

	int addType(Type e);

	int deleteTypeById(@Param("tno")String tno);

	int updateTypeById(Type t);

	void reduceRoom(@Param("tno")Integer tno);

}
