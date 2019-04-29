package com.woniuxueyuan.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;  
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.woniuxueyuan.utils.JdbcUtils;

public class myFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	
  
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		Connection conn = null;
		try {  
			conn = JdbcUtils.getConnection();
			conn.setAutoCommit(false);
			chain.doFilter(request, response);
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				throw new RuntimeException(e);
			}
			throw new RuntimeException(e);
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
