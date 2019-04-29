package com.woniuxueyuan.service;

import java.util.List;

import com.woniuxueyuan.domain.Staff;

public interface StaffServive {
	void save(Staff s);

	void update(Staff s);

	void delete(Integer sid);

	Staff find(Integer id);

	List<Staff> find();

}
