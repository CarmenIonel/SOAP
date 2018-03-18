
package application.NET;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FindUserByUsernameResult" type="{http://tempuri.org/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "findUserByUsernameResult"
})
@XmlRootElement(name = "FindUserByUsernameResponse")
public class FindUserByUsernameResponse {

    @XmlElement(name = "FindUserByUsernameResult")
    protected User findUserByUsernameResult;

    /**
     * Gets the value of the findUserByUsernameResult property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getFindUserByUsernameResult() {
        return findUserByUsernameResult;
    }

    /**
     * Sets the value of the findUserByUsernameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setFindUserByUsernameResult(User value) {
        this.findUserByUsernameResult = value;
    }

}
