
package application.NET;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "userServiceNETSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserServiceNETSoap {


    /**
     * 
     * @param username
     * @return
     *     returns application.NET.User
     */
    @WebMethod(operationName = "FindUserByUsername", action = "http://tempuri.org/FindUserByUsername")
    @WebResult(name = "FindUserByUsernameResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "FindUserByUsername", targetNamespace = "http://tempuri.org/", className = "application.NET.FindUserByUsername")
    @ResponseWrapper(localName = "FindUserByUsernameResponse", targetNamespace = "http://tempuri.org/", className = "application.NET.FindUserByUsernameResponse")
    public User findUserByUsername(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SearchPackage", action = "http://tempuri.org/SearchPackage")
    @WebResult(name = "SearchPackageResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SearchPackage", targetNamespace = "http://tempuri.org/", className = "application.NET.SearchPackage")
    @ResponseWrapper(localName = "SearchPackageResponse", targetNamespace = "http://tempuri.org/", className = "application.NET.SearchPackageResponse")
    public String searchPackage(
        @WebParam(name = "name", targetNamespace = "http://tempuri.org/")
        String name);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Status", action = "http://tempuri.org/Status")
    @WebResult(name = "StatusResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Status", targetNamespace = "http://tempuri.org/", className = "application.NET.Status")
    @ResponseWrapper(localName = "StatusResponse", targetNamespace = "http://tempuri.org/", className = "application.NET.StatusResponse")
    public String status(
        @WebParam(name = "name", targetNamespace = "http://tempuri.org/")
        String name);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "FindPackages", action = "http://tempuri.org/FindPackages")
    @WebResult(name = "FindPackagesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "FindPackages", targetNamespace = "http://tempuri.org/", className = "application.NET.FindPackages")
    @ResponseWrapper(localName = "FindPackagesResponse", targetNamespace = "http://tempuri.org/", className = "application.NET.FindPackagesResponse")
    public String findPackages(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        int id);

}