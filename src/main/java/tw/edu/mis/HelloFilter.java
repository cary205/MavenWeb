package tw.edu.mis;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class HelloFilter
 */
public class HelloFilter implements Filter {
    
    /**
     * Default constructor. 
     */
    public HelloFilter() {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * @see Filter#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
    }
    
    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        // place your code here
        System.out.println("[Filter] request 被處理之前...");
        
        // pass the request along the filter chain
        //一定要執行，否則request不會交給後面的request或servlet
        chain.doFilter(request, response);
        
        System.out.println("[Filter] request 被處理之後，response抵達用戶端瀏覽器之前...");
    }
    
    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
        // TODO Auto-generated method stub
    }
    
}
