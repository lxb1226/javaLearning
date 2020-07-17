<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>if标签</title>
</head>
<body>

<%--

    c:if标签
        1. 属性：
            * test 必须属性： 接受boolean表达式，
                * 如果表达式为true，则显示if标签体内容，如果为false，则不显示标签体内容
                * 一般情况下，test属性值会结合表达式一起使用
        2.注意：c:if标签没有else语句


--%>
<c:if test="true">
    <h1>我是真...</h1>
</c:if>
<br>

<%
    // 判断request域中的一个list集合是否为空，如果不为null则显示遍历集合

    List list = new ArrayList();
    list.add("aaa");
    request.setAttribute("list", list);

    request.setAttribute("number", 3);
%>

<c:if test="${not empty list}">
    遍历集合...
</c:if>

<c:if test="${number % 2 != 0}">
    ${number}为奇数
</c:if>


</body>
</html>
