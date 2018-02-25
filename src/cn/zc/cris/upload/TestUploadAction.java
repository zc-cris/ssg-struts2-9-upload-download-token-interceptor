package cn.zc.cris.upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class TestUploadAction extends ActionSupport {

	
	/**
	 * @Field Name：serialVersionUID
	 * @Description：TODO (用一句话描述这个变量表示什么) 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private List<File> ppt;
	private List<String> pptContentType;
	private List<String> pptFileName;
	private List<String> desc;
	
	public List<File> getPpt() {
		return ppt;
	}


	public void setPpt(List<File> ppt) {
		this.ppt = ppt;
	}


	public List<String> getPptContentType() {
		return pptContentType;
	}


	public void setPptContentType(List<String> pptContentType) {
		this.pptContentType = pptContentType;
	}


	public List<String> getPptFileName() {
		return pptFileName;
	}


	public void setPptFileName(List<String> pptFileName) {
		this.pptFileName = pptFileName;
	}


	public List<String> getDesc() {
		return desc;
	}


	public void setDesc(List<String> desc) {
		this.desc = desc;
	}


	@Override
	public String execute() throws Exception {
		
		System.out.println(this.ppt);			//K:\apache-tomcat-9.0.0.M13\work\Catalina\localhost\ssg-struts2-9-upload\ (+) upload_57fa3470_074e_4f38_851c_12ff92bdf47f_00000002.tmp
		System.out.println(this.pptContentType);	//text/plain
		System.out.println(this.pptFileName);		//格式.txt
		System.out.println(this.desc);				//这是个文本
		
//		ServletContext servletContext = ServletActionContext.getServletContext();
//		String dir = servletContext.getRealPath("/upload/" + this.pptFileName);
//		System.out.println(dir);		//K:\apache-tomcat-9.0.0.M13\webapps\ssg-struts2-9-upload\ (+) upload\hrmsys需求分析.txt
//		//dir = "D:"+File.separator+this.pptFileName;
//		FileInputStream in = new FileInputStream(this.ppt);
//		FileOutputStream out = new FileOutputStream(dir);
//		
//		byte[] buffer = new byte[1024];
//		int len = 0;
//		while((len = in.read(buffer)) != -1) {
//			out.write(buffer,0,len);
//		}
//		out.close();
//		in.close();
		
		
//		return SUCCESS;
		return "input";
		
	}

}
