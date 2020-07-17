<%@ page import="cn.itcast.domain.User" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取数据</title>
</head>
<body>

<%
    User user = new User();
    user.setName("张三");
    user.setAge(23);
    user.setBirthday(new Date());

    request.setAttribute("user", user);

    List list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add(user);
    request.setAttribute("list", list);

    Map map = new HashMap();
    map.put("sname", "李四");
    map.put("gender", "男");

    request.setAttribute("map", map);
%>

<h3>el获取对象中的值</h3>

${requestScope.user}<br>

${user.name}<br>
${user.age}<br>
${user.birthday.year}<br>
${user.birthday.month}<br>
${user.birthday.minutes}<br>
${user.birStr}<br>

<h3>el获取List集合中的值</h3>
${list}<br>
${list[0]}<br>
${list[1]}<br>
${list[2].name}<br>


<h3>el获取Map集合中的值</h3><br>
${map.gender}<br>
${map["gender"]}<br>

<h3>empty运算符</h3>
<%
    String str = "abc";
    request.setAttribute("str", str);
%>
${empty str}


</body>
</html>
