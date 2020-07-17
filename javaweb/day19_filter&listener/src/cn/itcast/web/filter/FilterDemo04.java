package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


/**
 * 拦截路径配置：
 *      1./index.jsp :具体的资源
 *      2./user/*   :某个一级目录下的所有资源
 *      3.*.jsp:   后缀名
 *      4./*: 所有资源
 *
 *
 * 拦截方式配置：资源被访问的方式
 *      1.注解配置
 *          * 设置dispatcherTypes属性
 *              1.REQUEST:默认值。浏览器直接请求资源
 *              2.FORWARD：转发访问资源
 *              3.INCLUDE：包含访问资源
 *              4.ERROR：错误跳转资源
 *              5.ASYNC：异步访问资源
 *      2.web.xml配置
 *      3.
 *      4.
 */
@WebFilter("/index.jsp")
public class FilterDemo04 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
