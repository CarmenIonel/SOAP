
package application.stub;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Client", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Client {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "status", targetNamespace = "http://services/", className = "application.stub.Status")
    @ResponseWrapper(localName = "statusResponse", targetNamespace = "http://services/", className = "application.stub.StatusResponse")
    @Action(input = "http://services/Client/statusRequest", output = "http://services/Client/statusResponse")
    public Boolean status(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns application.stub.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findUserByUsername", targetNamespace = "http://services/", className = "application.stub.FindUserByUsername")
    @ResponseWrapper(localName = "findUserByUsernameResponse", targetNamespace = "http://services/", className = "application.stub.FindUserByUsernameResponse")
    @Action(input = "http://services/Client/findUserByUsernameRequest", output = "http://services/Client/findUserByUsernameResponse")
    public User findUserByUsername(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchPackages", targetNamespace = "http://services/", className = "application.stub.SearchPackages")
    @ResponseWrapper(localName = "searchPackagesResponse", targetNamespace = "http://services/", className = "application.stub.SearchPackagesResponse")
    @Action(input = "http://services/Client/searchPackagesRequest", output = "http://services/Client/searchPackagesResponse")
    public String searchPackages(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findPackages", targetNamespace = "http://services/", className = "application.stub.FindPackages")
    @ResponseWrapper(localName = "findPackagesResponse", targetNamespace = "http://services/", className = "application.stub.FindPackagesResponse")
    @Action(input = "http://services/Client/findPackagesRequest", output = "http://services/Client/findPackagesResponse")
    public String findPackages(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

}
