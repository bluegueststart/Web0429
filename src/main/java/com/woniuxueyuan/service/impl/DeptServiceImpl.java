package com.woniuxueyuan.service.impl;

import java.util.List;

import com.woniuxueyuan.dao.IDeptDao;
import com.woniuxueyuan.dao.impl.DeptImpl;
import com.woniuxueyuan.domain.Dept;
import com.woniuxueyuan.service.DeptService;

public class DeptServiceImpl implements DeptService {
      IDeptDao  dept= new  DeptImpl();
	@Override
	public void save(Dept d) {
		dept.save(d);   
	}  

	@Override
	public void update(Dept d) {
		dept.update(d);
	}

	@Override
	public void delete(Integer did) {
		dept.delete(did);
	}

	@Override
	public Dept find(Integer id) {
		return dept.find(id);
	}

	@Override
	public List<Dept> find() {
		return  dept.find();
	}

}
