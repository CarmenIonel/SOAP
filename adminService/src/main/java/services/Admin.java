package services;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import dao.CityDAO;
import dao.PackageDAO;
import dao.UserDAO;
import entity.City;
import entity.PackagE;
import entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

@WebService()
public class Admin {

    //add package
    @WebMethod
    public void addPackage(PackagE pack)
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        PackageDAO packageDAO=new PackageDAO(sf);
        packageDAO.addPackage(pack);
    }

    //remove package
    @WebMethod
    public void deletePackage(PackagE pack)
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        PackageDAO packageDAO=new PackageDAO(sf);
        pack.setDestinationCity(null);
        pack.setSenderCity(null);
        pack.setSender(null);
        pack.setReceiver(null);
        pack.setCities(null);
        packageDAO.deletePackage(pack);
    }

    //register package for tracking
    @WebMethod
    public void registerPackage(PackagE pack)
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        PackageDAO packageDAO=new PackageDAO(sf);

        pack.setTracking(true);

        List<City> cities = new ArrayList<City>();
        cities.add(pack.getSenderCity());
        cities.add(pack.getDestinationCity());
        pack.setCities(cities);
        packageDAO.updatePackage(pack);
    }

    //find by username
    @WebMethod
    public User findByUsername(String username)
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        UserDAO userDAO=new UserDAO(sf);
        return userDAO.findByUsername(username);
    }

    //add a user
    @WebMethod
    public void addUser(User user)
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        UserDAO userDAO=new UserDAO(sf);
        userDAO.addUser(user);
    }

    //find a package by its name
    @WebMethod
    public PackagE findByName(String name)
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        PackageDAO packageDAO=new PackageDAO(sf);
        PackagE pack =packageDAO.findByName(name);
        pack.setCities(null);
        return pack;
    }

    //find a city by its name
    @WebMethod
    public City findByCityName(String name)
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        CityDAO cityDAO=new CityDAO(sf);
        return cityDAO.findByName(name);
    }

    //add a city to the package's route
    @WebMethod
    public void updateStatus(PackagE pack, City city)
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        PackageDAO packageDAO=new PackageDAO(sf);

        List<City> cities=new ArrayList<City>();
        cities.add(pack.getSenderCity());
        cities.add(city);
        cities.add(pack.getDestinationCity());
        pack.setCities(cities);
        packageDAO.updatePackage(pack);

    }

    public static void main(String[] argv) {
        Object implementor = new Admin();
        String address = "http://localhost:9000/Admin";
        Endpoint.publish(address, implementor);
    }
}
