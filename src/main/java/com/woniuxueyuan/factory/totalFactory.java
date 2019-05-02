package com.woniuxueyuan.factory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.taglibs.standard.lang.jstl.test.beans.Factory;


public class totalFactory {
	public static Daofactory getFactory() {
		try {
			InputStream in = Factory.class.getClassLoader().getResourceAsStream("factory.txt");
			InputStreamReader ins = new InputStreamReader(in);// 字符流和字节流的转换
			BufferedReader br = new BufferedReader(ins);//利用缓冲流
			String name = br.readLine();//读一行是缓冲流独有的方法
			Object newInstance = Class.forName(name).newInstance();//这里注意了,直接用类加载出一个实例化对象
			

			return (Daofactory) newInstance;//实例化对象转为dao层接口
		} catch (Exception e) {
			throw  new  RuntimeException(e);
		}
	}
}
