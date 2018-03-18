using App_Code;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

[WebService]
[WebServiceBinding]

public class userServiceNET : System.Web.Services.WebService
{
    [WebMethod]
    public user FindUserByUsername(string username)
    {
        userDAO userDAO = new userDAO();
        return userDAO.FindUserByUsername(username);
    }

    [WebMethod]
    public string SearchPackage(string name)
    {
        packageDAO packageDAO = new packageDAO();
        List<package> packages = packageDAO.SearchPackage(name);

        string aux = "";
        foreach(package pack in packages)
            aux += pack.ToString();
        return aux;
    }

    [WebMethod]
    public string Status(string name)
    {
        packageDAO packageDAO = new packageDAO();
        return packageDAO.Status(name);
    }

    [WebMethod]
    public string FindPackages(int id)
    {
        packageDAO packageDAO = new packageDAO();
        return packageDAO.FindPackages(id);
    }

}
