package com.woniuxueyuan.dao;

import java.util.List;

import com.woniuxueyuan.domain.Dept;

public interface IDeptDao {
	void save(Dept d);

	void update(Dept d);

	void delete(Integer  did);

	Dept find(Integer id);

	List<Dept> find();
	//获取行数
		Integer  getRowCount();
		//获取分页数据
		List<Dept>  find(Integer startLine , Integer size );

}
