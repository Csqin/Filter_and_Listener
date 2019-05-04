package it.cast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 	1. 注解配置：按照类名的字符串比较规则比较，值小的先执行
             如： AFilter 和 BFilter，AFilter就先执行了。
    2. web.xml配置： <filter-mapping>谁定义在上边，谁先执行
 */
@WebFilter("/*")
public class FilterDemo6 implements Filter {


    public void init(FilterConfig config) throws ServletException {

    }


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("FilterDemo6执行了..........");
        chain.doFilter(req, resp);
        System.out.println("FilterDemo6回来了..........");
    }


    public void destroy() {

    }

}
