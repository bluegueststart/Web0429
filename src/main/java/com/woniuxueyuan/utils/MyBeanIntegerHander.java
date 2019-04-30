package com.woniuxueyuan.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.ResultSetHandler;

public class MyBeanIntegerHander implements ResultSetHandler<Integer> {

	@Override
	public Integer handle(ResultSet rs) throws SQLException {//把结果集穿进去,得到返回值
		Integer  i = 0;
		if (rs.next()) {   //底层就是我们以前的写法
			i = rs.getInt(1);  
		}
		return i;
	}

}
