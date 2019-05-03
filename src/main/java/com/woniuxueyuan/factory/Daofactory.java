package com.woniuxueyuan.factory;

import com.woniuxueyuan.dao.IDeptDao;
import com.woniuxueyuan.dao.IStaffDao;

//工厂依赖接口
public interface Daofactory {
	IStaffDao getStaffFDao();//接口作为返回值

	IDeptDao getDeptDao();
}
