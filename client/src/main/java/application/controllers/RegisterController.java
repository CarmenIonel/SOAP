package application.controllers;

import application.stub.Admin;
import application.stub.AdminService;
import application.stub.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {

    @RequestMapping(value="/register", method= RequestMethod.GET)
    public String c(HttpServletRequest ht)
    {
        return "/register";
    }

    @RequestMapping(value="/register", method= RequestMethod.POST)
    public String register(HttpServletRequest ht)
    {
        try
        {
            Admin service =new AdminService().getAdminPort();
            User user = service.findByUsername(ht.getParameter("username"));
            if(user==null && ht.getParameter("password").equals(ht.getParameter("confirm")))
            {
                user=new User();
                user.setName(ht.getParameter("name"));
                user.setUsername(ht.getParameter("username"));
                user.setPassword(ht.getParameter("password"));
                user.setRole("ROLE_USER");

                service.addUser(user);
            }
            return "/login";
        }
        catch(Exception e)
        {
            return "/error";
        }
    }
}
