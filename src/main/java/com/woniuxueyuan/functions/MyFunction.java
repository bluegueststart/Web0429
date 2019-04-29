package com.woniuxueyuan.functions;

import com.woniuxueyuan.domain.Dept;
import com.woniuxueyuan.service.DeptService;
import com.woniuxueyuan.service.impl.DeptServiceImpl;

public class MyFunction {
	public static Dept getDept(int did) {

		DeptService dept = new DeptServiceImpl();
		return dept.find(did);

	}
}
