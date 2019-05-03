package com.woniuxueyuan.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.woniuxueyuan.domain.Dept;
import com.woniuxueyuan.domain.Page;
import com.woniuxueyuan.service.DeptService;
import com.woniuxueyuan.service.impl.DeptServiceImpl;

public class DeptAction extends ActionSupport implements ModelDriven<Dept> {
	/**     
	 * 
	 */  
	private static final long serialVersionUID = 1L;
	private DeptService service = new DeptServiceImpl();
	private Dept dept = new Dept();
	private int p;
	public int getP() {
		return p;
	}


	public void setP(int p) {
		this.p = p;
	}
	//只会检查进入save方法的参数
		public void validateSave() { //这
			//一旦发现错误,就调用方法吧错误记录下来
			if(dept.getDname()==null||dept.getDname().trim().length()<1) {
	           addFieldError("error", "名字输入错误");
	         //这个记录在哪里呢? 在一个叫error的map集合中
	   		//在validate方法结束之后,struts框架中 检测这个这个的error的map集合size() 是否为0来判断是否有错
	   		//你添加错误信息,就是往map中数据,
	   		//如果有,就会跳到 叫"input" 的逻辑视图上
			}else {
				boolean matches = dept.getDname().matches("[a-z]{2,4}");
				//正则式表示中文  "[\\u4e00-\\u9f5]{2,4}" ,表示2到4列中文
			     if(!matches) {
			    	 addFieldError("error", "必须是2到4列英文");
			     }
			}
			
			
			
		}

	@Override
	public void validate() { 
		super.validate();
	}


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
		HttpSession session = request.getSession();
		Integer k; // 设置一个中间变量,来接收会话中的p和请求中的p
		if (p != 0) {  //请求中的携带了p, 要跳转页数,而不是删除或者,是请求中的p
             k=p;
		} else {  //请求中没有带p, 说明使用删除修改的功能
			Integer x = (Integer)session.getAttribute("dept_p");
              if(x!=null) {  //会话中有当前页数
            	 k=x;
              }else {  //这里是因为会话中和请求中都没有p,说明是第一次进来的
            	  k=1;
              }   
		}
		session.setAttribute("dept_p",k);  //这里请求或者会话中的p给了会话
		//这样的话,以后查询请求中页有p, 会话中也有p
		//但是,修改和删除只有会中有p
		Page<Dept> list = service.getPage(k, 10);
		request.setAttribute("page", list);
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
