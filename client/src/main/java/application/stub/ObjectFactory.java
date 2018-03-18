
package application.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the application.stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindUserByUsernameResponse_QNAME = new QName("http://services/", "findUserByUsernameResponse");
    private final static QName _FindUserByUsername_QNAME = new QName("http://services/", "findUserByUsername");
    private final static QName _Status_QNAME = new QName("http://services/", "status");
    private final static QName _FindPackages_QNAME = new QName("http://services/", "findPackages");
    private final static QName _SearchPackages_QNAME = new QName("http://services/", "searchPackages");
    private final static QName _FindPackagesResponse_QNAME = new QName("http://services/", "findPackagesResponse");
    private final static QName _StatusResponse_QNAME = new QName("http://services/", "statusResponse");
    private final static QName _SearchPackagesResponse_QNAME = new QName("http://services/", "searchPackagesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: application.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchPackagesResponse }
     * 
     */
    public SearchPackagesResponse createSearchPackagesResponse() {
        return new SearchPackagesResponse();
    }

    /**
     * Create an instance of {@link FindPackagesResponse }
     * 
     */
    public FindPackagesResponse createFindPackagesResponse() {
        return new FindPackagesResponse();
    }

    /**
     * Create an instance of {@link StatusResponse }
     * 
     */
    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    /**
     * Create an instance of {@link FindUserByUsernameResponse }
     * 
     */
    public FindUserByUsernameResponse createFindUserByUsernameResponse() {
        return new FindUserByUsernameResponse();
    }

    /**
     * Create an instance of {@link FindUserByUsername }
     * 
     */
    public FindUserByUsername createFindUserByUsername() {
        return new FindUserByUsername();
    }

    /**
     * Create an instance of {@link FindPackages }
     * 
     */
    public FindPackages createFindPackages() {
        return new FindPackages();
    }

    /**
     * Create an instance of {@link SearchPackages }
     * 
     */
    public SearchPackages createSearchPackages() {
        return new SearchPackages();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserByUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findUserByUsernameResponse")
    public JAXBElement<FindUserByUsernameResponse> createFindUserByUsernameResponse(FindUserByUsernameResponse value) {
        return new JAXBElement<FindUserByUsernameResponse>(_FindUserByUsernameResponse_QNAME, FindUserByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserByUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findUserByUsername")
    public JAXBElement<FindUserByUsername> createFindUserByUsername(FindUserByUsername value) {
        return new JAXBElement<FindUserByUsername>(_FindUserByUsername_QNAME, FindUserByUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "status")
    public JAXBElement<Status> createStatus(Status value) {
        return new JAXBElement<Status>(_Status_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPackages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findPackages")
    public JAXBElement<FindPackages> createFindPackages(FindPackages value) {
        return new JAXBElement<FindPackages>(_FindPackages_QNAME, FindPackages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPackages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "searchPackages")
    public JAXBElement<SearchPackages> createSearchPackages(SearchPackages value) {
        return new JAXBElement<SearchPackages>(_SearchPackages_QNAME, SearchPackages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPackagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findPackagesResponse")
    public JAXBElement<FindPackagesResponse> createFindPackagesResponse(FindPackagesResponse value) {
        return new JAXBElement<FindPackagesResponse>(_FindPackagesResponse_QNAME, FindPackagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "statusResponse")
    public JAXBElement<StatusResponse> createStatusResponse(StatusResponse value) {
        return new JAXBElement<StatusResponse>(_StatusResponse_QNAME, StatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPackagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "searchPackagesResponse")
    public JAXBElement<SearchPackagesResponse> createSearchPackagesResponse(SearchPackagesResponse value) {
        return new JAXBElement<SearchPackagesResponse>(_SearchPackagesResponse_QNAME, SearchPackagesResponse.class, null, value);
    }

}
