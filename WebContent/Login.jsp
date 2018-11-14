<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		//기존 session 확인
		if(session.getAttribute("memberId") != null){
			response.sendRedirect("LoginOk.jsp");
		}
	%>
	<form action="LoginConn" method="post">
		ID : <input type="text" name="ID"><br>
		PW : <input type="password" name="PW"><br>
		<input type="submit" value="login">
	</form>
</body>
</html>