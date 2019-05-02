package com.woniuxueyuan.dao.impl;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.woniuxueyuan.dao.IStaffDao;
import com.woniuxueyuan.domain.Staff;
import com.woniuxueyuan.utils.JdbcUtils;
import com.woniuxueyuan.utils.MyBeanIntegerHander;

public class StaffImpl2 implements IStaffDao {

	@Override
	public void save(Staff s) {
		try {
			Writer wr = new FileWriter("E://a.txt");
			PrintWriter pw = new PrintWriter(wr); // 打印流
			pw.write(s.getDid() + "&&" + s.getSname() + "&&" + s.getSalary()); // 打印的类型
			pw.close(); // 关闭下层流就行
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void delete(Integer sid) {

	}

	@Override
	public void update(Staff s) {

	}

	@Override
	public Staff find(Integer sid) {

		return null;

	}

	@Override
	public List<Staff> find() {
		return null;
	}

	@Override
	public Integer getRowCount() {
		return null;

	}

	@Override
	public List<Staff> find(Integer startLine, Integer size) {
		return null;

	}

}
