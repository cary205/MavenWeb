package tw.edu.mis.action;

import com.opensymphony.xwork2.ActionSupport;

public class SimpleAction extends ActionSupport{
    public String execute() throws Exception {
        System.out.println("[SimpleAction] call execute");
        return SUCCESS;
    }
}