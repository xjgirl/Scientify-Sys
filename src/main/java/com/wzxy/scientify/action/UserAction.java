package com.wzxy.scientify.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wzxy.scientify.entity.User;
import com.wzxy.scientify.service.IUserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

@Controller("userAction")
@Scope("prototype")
public class UserAction  extends ActionSupport {

    private static final long serialVersionUID = -4543142472432152186L;

    @Resource
    private IUserService userService;

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public String login(){
        if(userService.login(user)){
            Map session = ActionContext.getContext().getSession();
            session.put("user", user);
            return SUCCESS;
        }else{
            return ERROR;
        }
    }
}
