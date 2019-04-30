package com.woniuxueyuan.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.woniuxueyuan.domain.Dept;
import com.woniuxueyuan.domain.Page;
import com.woniuxueyuan.domain.Staff;
import com.woniuxueyuan.service.DeptService;
import com.woniuxueyuan.service.StaffServive;
import com.woniuxueyuan.service.impl.DeptServiceImpl;
import com.woniuxueyuan.service.impl.StaffServiceImpl;

public class StaffAction extends ActionSupport implements ModelDriven<Staff> {
	/**
	 *   
	 */
	private static final long serialVersionUID = 1L;
	private Staff staff = new Staff();
	private StaffServive service = new StaffServiceImpl();
	private DeptService deptservice = new DeptServiceImpl();
	private Integer p;

	public Integer getP() {
		return p;
	}

	public void setP(Integer p) {
		this.p = p;
	}

	public String saveUI() {
		ServletActionContext.getRequest().setAttribute("deptlist", deptservice.find());

		return "saveUI";
	}

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
		Page<Staff> list = service.getPage(1, 5);
		request.setAttribute("page", list);
		return "findUI";
	}

	public String findById() {
		HttpServletRequest request = ServletActionContext.getRequest();
		Staff s = service.find(staff.getSid());
		request.setAttribute("staff", s);
		ServletActionContext.getRequest().setAttribute("deptlist", deptservice.find());

		return "updateUI";
	}

	@Override
	public Staff getModel() {
		return staff;
	}

}
