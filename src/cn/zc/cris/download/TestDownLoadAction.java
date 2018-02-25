package cn.zc.cris.download;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class TestDownLoadAction extends ActionSupport {
	
	/**
	 * @Field Name：serialVersionUID
	 * @Description：TODO (用一句话描述这个变量表示什么) 
	 */
	
	private static final long serialVersionUID = 1L;
	private InputStream inputStream;
	private String filename;
	
	public String getFilename() {
		return filename;
	}
	
	public InputStream getInputStream() throws FileNotFoundException {
		
		return inputStream;
	}
	@Override
	public String execute() throws Exception {
		this.filename = "index.html";
		ServletContext servletContext = 
				ServletActionContext.getServletContext();
		String fileName = servletContext.getRealPath("/files/index.html");
		this.inputStream = new FileInputStream(fileName);
		return SUCCESS;
	}
}

