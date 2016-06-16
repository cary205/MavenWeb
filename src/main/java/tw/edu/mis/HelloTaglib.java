package tw.edu.mis;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class HelloTaglib extends TagSupport {
    
    public int doStartTag() throws JspException {
        try {
            pageContext.getOut().print("This is HelloTaglib~YOYO~~");
            System.out.println("[HelloTaglib] call doStartTag");
        } catch (Exception ex) {
            System.out.println("[HelloTaglib] ERROR: " + ex.toString());
        }
        
        return SKIP_BODY;
    }
    
    public int doEndTag() throws JspException {
        try {
            System.out.println("[HelloTaglib] call doEndTag");
        } catch (Exception ex) {
            System.out.println("[HelloTaglib] ERROR: " + ex.toString());
        }
        
        return EVAL_PAGE;
    }
}