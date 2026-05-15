<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

int i=10;
out.println("i : "+i);

String name="Mg Mg";
/* 
int get(){
	return j;
}
 */

%>
<br>
Name : <%= name %>
<br>
<%!

int j=20;

int get(){
	return j;
}


%>

j : <%= get() %>


Name : <%= request.getParameter("username") %>
<br>
<%-- Classes : <%= request.getParameterValues("classes")[0] %> --%>

<%

String[] classes = request.getParameterValues("classes");

if (classes != null) {
	for (String c : classes) {
		out.println(c);
	}
}


%>


</body>
</html>