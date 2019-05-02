package com.woniuxueyuan.factory.impl;

import com.woniuxueyuan.dao.IDeptDao;
import com.woniuxueyuan.dao.IStaffDao;
import com.woniuxueyuan.dao.impl.DeptImpl;
import com.woniuxueyuan.dao.impl.StaffImpl;
import com.woniuxueyuan.factory.Daofactory;

public class MysqlFactory implements Daofactory {

	@Override
	public IStaffDao getStaffFDao() {

		return new StaffImpl();//依赖于接口的实现了
	}

	@Override
	public IDeptDao getDeptDap() {
		return new DeptImpl();
	}

}
