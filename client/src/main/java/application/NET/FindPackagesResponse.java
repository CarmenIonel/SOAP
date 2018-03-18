
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
 *         &lt;element name="FindPackagesResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "findPackagesResult"
})
@XmlRootElement(name = "FindPackagesResponse")
public class FindPackagesResponse {

    @XmlElement(name = "FindPackagesResult")
    protected String findPackagesResult;

    /**
     * Gets the value of the findPackagesResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindPackagesResult() {
        return findPackagesResult;
    }

    /**
     * Sets the value of the findPackagesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindPackagesResult(String value) {
        this.findPackagesResult = value;
    }

}
