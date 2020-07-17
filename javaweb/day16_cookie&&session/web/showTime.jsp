<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>itcast</title>
</head>
<body>

<%
    // 1.获取所有的Cookie
    Cookie[] cs = request.getCookies();
    boolean flag = false;
    // 2.遍历Cookie数组
    if (cs != null && cs.length > 0) {
        for (Cookie cookie : cs) {
            String name = cookie.getName();
            if ("lastTime".equals(name)) {

                flag = true;

                // 设置cookie的value
//                    获取当前时间的字符串，重新设置cookie的值
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                String str_date = sdf.format(date);
                System.out.println("编码前:" + str_date);
                // URL编码
                str_date = URLEncoder.encode(str_date, "utf-8");
                System.out.println("编码后：" + str_date);
                cookie.setValue(str_date);
                // 设置cookie的存货时间
                cookie.setMaxAge(60 * 60 * 24 * 30);
                response.addCookie(cookie);

                // 响应数据
                String value = cookie.getValue();
                System.out.println("解码前：" + value);
                value = URLDecoder.decode(value, "utf-8");
                System.out.println("解码后：" + value);
                out.write("欢迎回来，你上次访问时间为:" + value);

                break;
            }
        }
    }

    if (cs == null || cs.length == 0 || !flag) {
        // 第一次访问
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str_date = sdf.format(date);
        System.out.println("编码前的数据:" + str_date);
        // URL编码
        str_date = URLEncoder.encode(str_date, "utf-8");
        System.out.println("编码后：" + str_date);
        // 设置cookie的存货时间

        Cookie cookie = new Cookie("lastTime", str_date);
        cookie.setMaxAge(60 * 60 * 24 * 30);
        response.addCookie(cookie);


        out.write("欢迎首次访问");

    }
%>

</body>
</html>
