package com.woniuxueyuan.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
  
   
public class JdbcUtils {
	private static String driver;  
	private static String url;      
	private static String root;
	private static String pass;
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	static {
         
		try {
			InputStream in = JdbcUtils.class.getResourceAsStream("jdbc.properties");
			Properties prop = new Properties();
			prop.load(in);    
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			root = prop.getProperty("root");
			pass = prop.getProperty("pass");
			Class.forName(driver);  
		     
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}  

	public static Connection getConnection() throws SQLException {
		Connection conn = tl.get();
		if (conn == null) {
			conn = DriverManager.getConnection(url, root, pass);
			tl.set(conn);
			
		}  
		return conn;

	}  

	public static void free(Connection conn, Statement st, ResultSet re) {
		try {
			if (conn != null) {
				conn.close();
				tl.remove();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (st != null) {
					st.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			} finally {
				try {
					if (re != null) {
						re.close();
					}
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}

		}

	}
}
