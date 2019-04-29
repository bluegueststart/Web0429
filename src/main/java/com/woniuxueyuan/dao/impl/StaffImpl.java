package com.woniuxueyuan.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.woniuxueyuan.dao.IStaffDao;
import com.woniuxueyuan.domain.Staff;
import com.woniuxueyuan.utils.JdbcUtils;

public class StaffImpl implements IStaffDao {

	@Override
	public void save(Staff s) {
		try {
			Connection conn = JdbcUtils.getConnection();
			QueryRunner qu = new QueryRunner();
			String sql = "insert into  staff values(null,?,?,?,?)";
			qu.execute(conn, sql, s.getSname(), s.getSalary(), s.getHiredate(), s.getDid());
           
		} catch (SQLException e) {
			throw new RuntimeException(e);

		}
	}

	@Override
	public void delete(Integer sid) {
		try {
			Connection conn = JdbcUtils.getConnection();
			QueryRunner qu = new QueryRunner();
			String sql = "delete from   staff where sid=?";
			qu.execute(conn, sql, sid);

		} catch (SQLException e) {
			throw new RuntimeException(e);

		}

	}

	@Override
	public void update(Staff s) {
		try {
			Connection conn = JdbcUtils.getConnection();
			QueryRunner qu = new QueryRunner();
			String sql = "update   staff set sname=? ,salary=? ,hiredate=?, did=?   where sid=?";
			qu.execute(conn, sql, s.getSname(), s.getSalary(), s.getHiredate(), s.getDid(), s.getSid());

		} catch (SQLException e) {
			throw new RuntimeException(e);

		}
	}

	

	@Override
	public Staff find(Integer sid) {
		try {
			Connection conn = JdbcUtils.getConnection();
			QueryRunner qu = new QueryRunner();
			String sql = "select * from staff  where  sid=?";
			Staff s = qu.query(conn, sql, new BeanHandler<>(Staff.class), sid);
			return s;
		} catch (SQLException e) {
			throw new RuntimeException(e);

		}

	}

	@Override
	public List<Staff> find() {
		try {
			Connection conn = JdbcUtils.getConnection();
			QueryRunner qu = new QueryRunner();
			String sql = "select * from staff";
			List<Staff> list = qu.query(conn, sql, new BeanListHandler<>(Staff.class));
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);

		}
	}

}
