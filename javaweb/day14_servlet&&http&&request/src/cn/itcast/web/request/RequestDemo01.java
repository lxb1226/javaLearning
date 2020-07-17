package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo01")
public class RequestDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取请求方式
        String method = request.getMethod();
        System.out.println(method);
        // 2.获取虚拟目录
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        // 3.获取Servlet路径
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
        // 4.获取get方式请求参数
        String queryString = request.getQueryString();
        System.out.println(queryString);
        // 5.获取请求URI
        String requestURI = request.getRequestURI();
        // 6.获取请求的URL
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURI);

        // 7.获取协议以及版本
        String protocol = request.getProtocol();
        System.out.println(protocol);

        // 8.获取客户机的ip地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
