package tw.edu.mis;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class HelloListener
 *
 */
public class HelloListener implements ServletContextListener, HttpSessionListener, ServletRequestListener {
    
    /**
     * Default constructor. 
     */
    public HelloListener() {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0) {
        // TODO Auto-generated method stub
        HttpServletRequest request = (HttpServletRequest) arg0.getServletRequest();
        long time = System.currentTimeMillis() - (Long) request.getAttribute("dataCreated");
        System.out.println("[Listener requestDestroyed] IP " + request.getRemoteAddr() + "請求處理結束，用時 " + time + " 毫秒");
    }
    
    /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        ServletContext servletContext = arg0.getServletContext();
        System.out.println("[Listener contextInitialized] 即將啟動: " + servletContext.getContextPath());
    }
    
    /**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
        HttpSession session = arg0.getSession();
        System.out.println("[Listener sessionCreated] 新建立一個session, ID為: " + session.getId());
    }
    
    /**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
        HttpSession session = arg0.getSession();
        System.out.println("[Listener sessionDestroyed] 銷毀一個session, ID為: " + session.getId());
    }
    
    /**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        ServletContext servletContext = arg0.getServletContext();
        System.out.println("[Listener contextDestroyed] 即將關閉: " + servletContext.getContextPath());
    }
    
    /**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0) {
        // TODO Auto-generated method stub
        HttpServletRequest request = (HttpServletRequest) arg0.getServletRequest();
        String uri = request.getRequestURI();
        uri = request.getQueryString() == null ? uri : (uri + "?" + request.getQueryString());
        request.setAttribute("dataCreated", System.currentTimeMillis());
        System.out.println("[Listener requestInitialized] IP " + request.getRemoteAddr() + "請求" + uri);
    }
    
}
