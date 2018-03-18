package application.controllers;

import application.NET.User;
import application.NET.UserServiceNET;
import application.NET.UserServiceNETSoap;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

@Controller
public class ClientController {

    //view packages
    @RequestMapping(value = "/viewPackage", method = RequestMethod.GET)
    public String register(Model model) {
        try {

            UserServiceNETSoap service = new UserServiceNET().getUserServiceNETSoap();

            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String username =auth.getName();

            User user = new User();
            user= service.findUserByUsername(username);
            String packages = service.findPackages(user.getId());

            model.addAttribute("pack", packages);

            return "/viewPackage";

        } catch (Exception e) {
            System.out.println(e.toString());
            return "/index";
        }
    }

    //search package
    @RequestMapping(value = "/searchPackage", method = RequestMethod.POST)
    public String showSearchPackagePOST(HttpServletRequest ht) {

        String name=ht.getParameter("name");
        return "redirect:/searchPackage?name="+name;
    }

    @RequestMapping(value = "/searchPackage", method = RequestMethod.GET)
    public String showSearchPackageGET(Model model, @PathParam("name") String name) {
        if(name!=null)
        {
            UserServiceNETSoap service = new UserServiceNET().getUserServiceNETSoap();
            String pack =service.searchPackage(name);

            model.addAttribute("pack", pack);
        }
        return "/searchPackage";
    }

    //check status
    @RequestMapping(value = "/checkPackage", method = RequestMethod.POST)
    public String showStatusPackagePOST(HttpServletRequest ht) {

        String name=ht.getParameter("name");
        return "redirect:/checkPackage?name="+name;
    }

    @RequestMapping(value = "/checkPackage", method = RequestMethod.GET)
    public String showStatusPackageGET(Model model, @PathParam("name") String name) {
        if(name!=null)
        {
            UserServiceNETSoap service = new UserServiceNET().getUserServiceNETSoap();
            String pack =service.status(name);
            model.addAttribute("pack", pack);
        }
        return "/checkPackage";
    }
}
