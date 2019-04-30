package com.woniuxueyuan.domain;

import java.util.List;

public class Page<T> {
  private int  pg;
  private int  rowCount;
  private int  maxPage;
  private int prev;
  private int  next;
  private int startLine ;
  private int size;
  private int  startPage;
  private int endPage;
  private List<T>  list;
public Page(int pg, int rowCount, int size) {
	this.pg = pg;
	this.rowCount = rowCount;
	this.size = size;
	
	maxPage=(int)Math.ceil(rowCount*1.0/size);
	if(pg>maxPage) {
		pg=maxPage;
	}
	prev=pg-1;
	next=pg+1;
	startLine=(pg-1)*size;
	
	if(maxPage<10) {
		startPage=1;
		endPage=maxPage;
		
	}else {
		 startPage=pg-5;
		 endPage=pg+4;
		 if(startPage<1) {
			 startPage=1;
			 endPage=10;
		 }
		 if(endPage>maxPage) {
			 startPage=maxPage-9;
			 endPage=maxPage;
		 }
		
	}
	
}
public int getPg() {
	return pg;
}
public void setPg(int pg) {
	this.pg = pg;
}
public int getRowCount() {
	return rowCount;
}
public void setRowCount(int rowCount) {
	this.rowCount = rowCount;
}
public int getMaxPage() {
	return maxPage;
}
public void setMaxPage(int maxPage) {
	this.maxPage = maxPage;
}
public int getPrev() {
	return prev;
}
public void setPrev(int prev) {
	this.prev = prev;
}
public int getNext() {
	return next;
}
public void setNext(int next) {
	this.next = next;
}
public int getStartLine() {
	return startLine;
}
public void setStartLine(int startLine) {
	this.startLine = startLine;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public int getStartPage() {
	return startPage;
}
public void setStartPage(int startPage) {
	this.startPage = startPage;
}
public int getEndPage() {
	return endPage;
}
public void setEndPage(int endPage) {
	this.endPage = endPage;
}
public List<T> getList() {
	return list;
}
public void setList(List<T> list) {
	this.list = list;
}
  
  
  
}
