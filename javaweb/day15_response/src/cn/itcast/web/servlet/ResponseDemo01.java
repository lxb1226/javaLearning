package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/responseDemo01")
public class ResponseDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo01....");
        // 访问/responseDem01,会自动跳转到/responseDemo02资源
        // 1.设置状态码为302
        response.setStatus(302);
        // 2.设置响应头location
//        response.setHeader("location","/day15/responseDemo02");

        // 动态获取虚拟目录
        String contextPath = request.getContextPath();
        System.out.println(contextPath);


        // 简单的重定向方法
        response.sendRedirect("/day15/responseDemo02");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
