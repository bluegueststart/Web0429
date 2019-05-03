package com.woniuxueyuan.utils;

import java.math.BigDecimal;

public class test {
	public static void main(String[] args) {
		BigDecimal dec=new BigDecimal(0.4);
		BigDecimal dec1=new BigDecimal(0.3);
		
		System.out.println(dec.subtract(dec1));
		//0.100000000000000033306690738754696212708950042724609375
		
	    Double  double1= 1.4;
	    Double  double2=1.3;
	    System.out.println(double1-double2);
	    //0.09999999999999987 ,会损失精度
	    Float  f= (float) 0.4;
	    Float f1=(float) 0.3;
	    System.out.println(f-f1);
	    //0.099999994 损失精度
	    float a=(float) 1.32344435;//最后一位会被舍去
	    float a1=(float) 1.32344489;//最后一位会被舍去
	     System.out.println(a+":"+a1);
	    //1.3234444:1.3234448
	}
}
