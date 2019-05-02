package com.woniuxueyuan.service;

import java.util.List;

import com.woniuxueyuan.domain.Dept;
import com.woniuxueyuan.domain.Page;

public interface DeptService {
	void save(Dept d);

	void update(Dept d);

	void delete(Integer  did);

	Dept find(Integer id);

	List<Dept> find();
	Page<Dept> getPage(Integer pg, Integer size);
}
