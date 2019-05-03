package com.woniuxueyuan.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.woniuxueyuan.dao.IDeptDao;
import com.woniuxueyuan.domain.Dept;

public class DeptImpl2 implements IDeptDao {

	@Override
	public void save(Dept d) {
		try {
			Writer wr = new FileWriter("E://a.txt",true);
			PrintWriter pw = new PrintWriter(wr); // 打印流
			pw.write(d.getDid() + "&&" + d.getDname()); // 打印的类型
			pw.close(); // 关闭下层流就行
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
	@Override
	public List<Dept> find() {
		try {
			Reader in = new FileReader("E://1.txt");// 字符流读取文件
			BufferedReader br = new BufferedReader(in);// 缓冲流
			String line = null;
			List  list=new ArrayList<>();
			while ((line = br.readLine()) != null) {
				String[] split = line.split("::");
				Dept dept = new Dept();
				dept.setDid(Integer.parseInt(split[0]));
				dept.setDname(split[1]);
				list.add(dept);
			}
			return list;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void update(Dept d) {

	}

	@Override
	public void delete(Integer did) {

	}

	@Override
	public Dept find(Integer did) {
		
		return null;

	}

	

	@Override
	public Integer getRowCount() {
		
		return null;
	}

	@Override
	public List<Dept> find(Integer startLine, Integer size) {
		return null;

	}

}
