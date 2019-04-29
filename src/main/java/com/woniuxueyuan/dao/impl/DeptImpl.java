package com.woniuxueyuan.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.woniuxueyuan.dao.IDeptDao;
import com.woniuxueyuan.domain.Dept;
import com.woniuxueyuan.utils.JdbcUtils;

public class DeptImpl implements IDeptDao {

	@Override
	public void save(Dept d) {
		try {
			Connection conn = JdbcUtils.getConnection();
			QueryRunner qu = new QueryRunner();
			String sql = "insert into  dept values(null,?)";
			qu.execute(conn, sql, d.getDname());

		} catch (SQLException e) {
			throw new RuntimeException(e);

		}

	}

	@Override
	public void update(Dept d) {
		try {
			Connection conn = JdbcUtils.getConnection();
			QueryRunner qu = new QueryRunner();
			String sql = "update   dept set dname=? where did=?";
			qu.execute(conn, sql, d.getDname(), d.getDid());

		} catch (SQLException e) {
			throw new RuntimeException(e);

		}
	}

	@Override
	public void delete(Integer did) {
		try {
			Connection conn = JdbcUtils.getConnection();
			QueryRunner qu = new QueryRunner();
			String sql = "delete from   dept where did=?";
			qu.execute(conn, sql, did);

		} catch (SQLException e) {
			throw new RuntimeException(e);

		}
	}

	@Override
	public Dept find(Integer did) {
		try {
			Connection conn = JdbcUtils.getConnection();
			QueryRunner qu = new QueryRunner();
			String sql = "select * from dept where  did=?";
			Dept dept = qu.query(conn, sql, new BeanHandler<>(Dept.class), did);
			return dept;
		} catch (SQLException e) {
			throw new RuntimeException(e);

		}

	}

	@Override
	public List<Dept> find() {
		try {
			Connection conn = JdbcUtils.getConnection();
			QueryRunner qu = new QueryRunner();
			String sql = "select * from dept";
			List<Dept> list = qu.query(conn, sql, new BeanListHandler<>(Dept.class));
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);

		}
	}

}
