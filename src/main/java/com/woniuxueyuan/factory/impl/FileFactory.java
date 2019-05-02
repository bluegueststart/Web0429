package com.woniuxueyuan.factory.impl;

import com.woniuxueyuan.dao.IDeptDao;
import com.woniuxueyuan.dao.IStaffDao;
import com.woniuxueyuan.dao.impl.DeptImpl2;
import com.woniuxueyuan.dao.impl.StaffImpl2;
import com.woniuxueyuan.factory.Daofactory;

public class FileFactory implements Daofactory {

	@Override
	public IStaffDao getStaffFDao() {

		return new StaffImpl2();
	}

	@Override
	public IDeptDao getDeptDap() {
		return new DeptImpl2();
	}

}
