<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<s:debug></s:debug>
	<s:form action="testUpload.action" method="post" enctype="multipart/form-data" theme="simple" >
		<s:fielderror name="ppt"></s:fielderror>
		<s:actionerror/><!-- 如果是总的文件大小超过默认的2m，就得使用s:actionerror标签来显示错误信息 -->
		ppt:<s:file name="ppt" label="PPT"></s:file>
		<!-- 后台是集合接收，注意回显 -->
		desc:<s:textfield name="desc[0]" label="Desc"></s:textfield>
		<br>
		ppt:<s:file name="ppt" label="PPT"></s:file>
		desc:<s:textfield name="desc[1]" label="Desc"></s:textfield>
		<br>		
		ppt:<s:file name="ppt" label="PPT"></s:file>
		desc:<s:textfield name="desc[2]" label="Desc"></s:textfield>
		<br>
		<s:submit></s:submit>
	</s:form>

</body>
</html>