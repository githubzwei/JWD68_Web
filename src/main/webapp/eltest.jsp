<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>String</h3>
${reqName}

<h3>Array</h3>
${reqNumber[0]} , ${reqNumber[1]}

<h3>List</h3>
${reqList[0].name}

<h3>Object</h3>
${reqObj.name}

<h3>Map</h3>
${reqMap['"1"']}
</body>
</html>