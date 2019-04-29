package com.woniuxueyuan.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.woniuxueyuan.domain.Dept;
import com.woniuxueyuan.domain.Staff;
import com.woniuxueyuan.service.StaffServive;
import com.woniuxueyuan.service.impl.StaffServiceImpl;

public class StaffAction extends ActionSupport implements ModelDriven<Staff> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Staff staff = new Staff();
	private StaffServive service = new StaffServiceImpl();
	@SuppressWarnings("unused")
	private Dept dept = new Dept();

	public String save() {
		service.save(staff);

		return "find";
	}

	public String update() {
		service.update(staff);
		return "find";
	}

	public String delete() {
		service.delete(staff.getSid());
		return "find";
	}

	public String find() {
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Staff> list = service.find();
		request.setAttribute("list", list);
		return "findUI";
	}

	public String findById() {
		HttpServletRequest request = ServletActionContext.getRequest();
		Staff s = service.find(staff.getSid());
		request.setAttribute("staff", s);
		return "updateUI2";
	}

	@Override
	public Staff getModel() {
		return staff;
	}

}
