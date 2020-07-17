<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="top.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h3>主体信息</h3>


<%
    pageContext.setAttribute("msg", "hello");

%>

<%
    Object msg = pageContext.getAttribute("msg");
    out.print(msg);
%>

</body>
</html>
