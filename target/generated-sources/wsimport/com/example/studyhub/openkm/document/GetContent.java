
package com.example.studyhub.openkm.document;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getContent">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="docPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="checkout" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContent", propOrder = {
    "token",
    "docPath",
    "checkout"
})
public class GetContent {

    protected String token;
    protected String docPath;
    protected boolean checkout;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the docPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocPath() {
        return docPath;
    }

    /**
     * Sets the value of the docPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocPath(String value) {
        this.docPath = value;
    }

    /**
     * Gets the value of the checkout property.
     * 
     */
    public boolean isCheckout() {
        return checkout;
    }

    /**
     * Sets the value of the checkout property.
     * 
     */
    public void setCheckout(boolean value) {
        this.checkout = value;
    }

}
