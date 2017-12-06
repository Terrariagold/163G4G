package com.flowers.struts2;


public class HelloWorldAction{
	private String uname;
	private String upwd;

	public String execute() throws Exception {
		if ((uname == "tom" || uname.equals("tom")) && (upwd == "123" || upwd.equals("123"))) {
			System.out.println("³É¹¦");
			return "success";
		}else {
			System.out.println("Ê§°Ü");
			return "input";
		}
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public HelloWorldAction(String uname, String upwd) {
		super();
		this.uname = uname;
		this.upwd = upwd;
	}
	public HelloWorldAction() {
		super();
	}
}
