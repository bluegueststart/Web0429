package com.woniuxueyuan.service.impl;

import java.util.List;

import com.woniuxueyuan.dao.IStaffDao;
import com.woniuxueyuan.dao.impl.StaffImpl;
import com.woniuxueyuan.domain.Page;
import com.woniuxueyuan.domain.Staff;
import com.woniuxueyuan.service.StaffServive;

public class StaffServiceImpl implements StaffServive {
	private IStaffDao staff = new StaffImpl();

	@Override
	public void save(Staff s) {  
		staff.save(s);
	}

	@Override
	public void update(Staff s) {
		staff.update(s);
	}

	@Override
	public void delete(Integer sid) {
		staff.delete(sid);
	}

	@Override
	public Staff find(Integer id) {
		return staff.find(id);
	}

	@Override
	public List<Staff> find() {
		return staff.find();
	}

	@Override
	public Page<Staff> getPage(Integer pg, Integer size) {
		
		Page<Staff> p = new Page<Staff>(pg, staff.getRowCount(), size);
		
		List<Staff> list = staff.find(p.getStartLine(), p.getSize());
		p.setList(list);

		return p;
	}

}
