package cn.zc.cris.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {
	
	/**
	 * @Field Name：serialVersionUID
	 * @Description：TODO (用一句话描述这个变量表示什么) 
	 */
	
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("before intercept");
		
		//String result = invocation.invoke();
		
		System.out.println("after intercept");
		
//		return result;
		return "success";
	}
}
