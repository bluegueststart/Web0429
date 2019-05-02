package com.woniuxueyuan.service.impl;

import java.util.List;

import com.woniuxueyuan.dao.IDeptDao;
import com.woniuxueyuan.dao.impl.DeptImpl;
import com.woniuxueyuan.domain.Dept;
import com.woniuxueyuan.domain.Page;
import com.woniuxueyuan.factory.totalFactory;
import com.woniuxueyuan.service.DeptService;

public class DeptServiceImpl implements DeptService {
      IDeptDao  dept= totalFactory.getFactory().getDeptDap();
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
	@Override
	public Page<Dept> getPage(Integer pg, Integer size) {
		
		Page<Dept> p = new Page<Dept>(pg, dept.getRowCount(), size);
		
		List<Dept> list = dept.find(p.getStartLine(), p.getSize());
		p.setList(list);

		return p;
	}

}
