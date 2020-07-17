<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

${3 > 4}
\${3 > 4}

<hr>
<h1>算数运算符</h1>


<h3>empty运算符</h3>
<%
    String str = "abc";
    request.setAttribute("str", str);
%>

${not empty str}

</body>
</html>
