package application.controllers;

import application.stub.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {

    @RequestMapping(value = "/addPackage", method = RequestMethod.GET)
    public String showAddPackage() {
        return "/addPackage";
    }

    @RequestMapping(value = "/updateStatus", method = RequestMethod.GET)
    public String showUpdateStatus() {
        return "/updateStatus";
    }

    @RequestMapping(value = "/registerPackage", method = RequestMethod.GET)
    public String showRegisterPackage() {
        return "/registerPackage";
    }

    @RequestMapping(value = "/deletePackage", method = RequestMethod.GET)
    public String showDeletePackage() {
        return "/deletePackage";
    }

    @RequestMapping(value = "/addPackage", method = RequestMethod.POST)
    public String register(HttpServletRequest ht) {
        try {
            Admin service = new AdminService().getAdminPort();
            PackagE pack = new PackagE();

            pack.setTracking(false);
            pack.setDescription(ht.getParameter("description"));
            pack.setName(ht.getParameter("name"));

            User user = new User();
            user = service.findByUsername(ht.getParameter("sender"));
            if (user != null)
                pack.setSender(user);

            user = service.findByUsername(ht.getParameter("receiver"));
            if (user != null)
                pack.setReceiver(user);

            City city = new City();
            city = service.findByCityName(ht.getParameter("sCity"));
            if (city != null) {
                String date = ht.getParameter("stime");
                city.setDate(date);
                pack.setSenderCity(city);
            }

            City city2 = new City();
            city2 = service.findByCityName(ht.getParameter("dCity"));
            if (city2 != null) {
                String date = ht.getParameter("dtime");
                city2.setDate(date);
                pack.setDestinationCity(city2);
            }
            service.addPackage(pack);
            return "redirect:/index";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "/error";
        }
    }

    @RequestMapping(value = "/deletePackage", method = RequestMethod.POST)
    public String deletePackage(HttpServletRequest ht) {
        try {
            Admin service = new AdminService().getAdminPort();
            PackagE pack = service.findByName(ht.getParameter("name"));
            if (pack != null) {
                service.deletePackage(pack);
                return "redirect:/index";
            } else
                return "/error";
        } catch (Exception e) {
            return "/error";
        }
    }

    @RequestMapping(value = "/registerPackage", method = RequestMethod.POST)
    public String registerPackage(HttpServletRequest ht) {
        try {
            Admin service = new AdminService().getAdminPort();
            PackagE pack = new PackagE();

            pack = service.findByName(ht.getParameter("name"));
            if (pack != null)//&& pack.isTracking() != true)
            {
                service.registerPackage(pack);
                return "redirect:/index";
            } else
                return "/error";
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    @RequestMapping(value = "/updateStatus", method = RequestMethod.POST)
    public String updateStatus(HttpServletRequest ht) {
        try
        {
        Admin service = new AdminService().getAdminPort();
        PackagE pack = new PackagE();

        pack = service.findByName(ht.getParameter("name"));
        if (pack != null) {
            City city = service.findByCityName(ht.getParameter("city"));
            if (city != null)
                city.setDate(ht.getParameter("time"));
            System.out.println(city.getName());
            service.updateStatus(pack, city);
            return "redirect:/index";
        }
            else
                return "/error";
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            return "/index";
        }
    }
}
