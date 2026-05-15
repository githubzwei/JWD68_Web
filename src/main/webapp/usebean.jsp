<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="studObj" class="model.Student" ></jsp:useBean>
<jsp:setProperty property="id" name="studObj" value="1"/>
<jsp:setProperty property="name" name="studObj" value="Mg Mg"/>

Id : <jsp:getProperty property="id" name="studObj"/> <br>
Name : <jsp:getProperty property="name" name="studObj"/>
</body>
</html>