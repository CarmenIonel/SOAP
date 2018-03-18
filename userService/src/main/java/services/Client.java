package services;

import dao.PackageDAO;
import dao.UserDAO;
import entity.PackagE;
import entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.OneToOne;
import javax.xml.ws.Endpoint;
import java.util.List;

@WebService()
public class Client {

    @WebMethod
    public User findUserByUsername(String username)
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        UserDAO userDAO=new UserDAO(sf);
        return userDAO.findByUsername(username);
    }

    //list all packages of the user
    @WebMethod
    public String findPackages(User user)
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        PackageDAO packageDAO = new PackageDAO(sf);
        List<PackagE> packages =packageDAO.findByUser(user);
        String result="";
        for(int i=0; i<packages.size(); i++)
            result += packages.get(i).toString()+" ";
        return result;
    }

    //search packages

    @WebMethod
    public String searchPackages(String name)
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        PackageDAO packageDAO = new PackageDAO(sf);
        PackagE pack = packageDAO.findByName(name);

        return pack.toString();
    }

    //packages status checking

    @WebMethod
    public Boolean status(String name)
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        PackageDAO packageDAO = new PackageDAO(sf);
        PackagE pack = packageDAO.findByName(name);

        return pack.isTracking();
    }

    public static void main(String[] argv) {
        Object implementor = new Client();
        String address = "http://localhost:9010/Client";
        Endpoint.publish(address, implementor);
    }
}
