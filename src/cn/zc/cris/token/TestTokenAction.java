package cn.zc.cris.token;

import com.opensymphony.xwork2.ActionSupport;

public class TestTokenAction extends ActionSupport{

	
	/**
	 * @Field Name：serialVersionUID
	 * @Description：TODO (用一句话描述这个变量表示什么) 
	 */
	
	private static final long serialVersionUID = 1L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(name+"-----------");
		Thread.sleep(1000);
		
		return SUCCESS;
	}
	
}
