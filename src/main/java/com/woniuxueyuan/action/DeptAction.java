package com.woniuxueyuan.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.woniuxueyuan.domain.Dept;
import com.woniuxueyuan.service.DeptService;
import com.woniuxueyuan.service.impl.DeptServiceImpl;

public class DeptAction extends ActionSupport implements ModelDriven<Dept> {
	/**     
	 * 
	 */  
	private static final long serialVersionUID = 1L;
	private DeptService service = new DeptServiceImpl();
	private Dept dept = new Dept();
  
	public String save() {   
		
		service.save(dept);
		return "find";
	}  

  
	public String update() {       
	
		service.update(dept);
		return "find";
	}

	public String delete() {  
	
		service.delete(dept.getDid());
		return "find";
	}

	public String find() {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("list", service.find());
		
		return "findUI";
	}    

	public String findById() {
		Dept d=service.find(dept.getDid());
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("dept", d);
		return "updateUI";
	}

	@Override
	public Dept getModel() {
		return dept;
	}

}
