
package com.example.studyhub.openkm.repository;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for document complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="document">
 *   <complexContent>
 *     <extension base="{http://ws.openkm.com}node">
 *       <sequence>
 *         <element name="actualVersion" type="{http://ws.openkm.com}version" minOccurs="0"/>
 *         <element name="checkedOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="cipherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="convertibleToPdf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="convertibleToSwf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="lockInfo" type="{http://ws.openkm.com}lockInfo" minOccurs="0"/>
 *         <element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="signed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "document", propOrder = {
    "actualVersion",
    "checkedOut",
    "cipherName",
    "convertibleToPdf",
    "convertibleToSwf",
    "description",
    "language",
    "lastModified",
    "lockInfo",
    "locked",
    "mimeType",
    "signed",
    "title"
})
public class Document
    extends Node
{

    protected Version actualVersion;
    protected boolean checkedOut;
    protected String cipherName;
    protected boolean convertibleToPdf;
    protected boolean convertibleToSwf;
    protected String description;
    protected String language;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    protected LockInfo lockInfo;
    protected boolean locked;
    protected String mimeType;
    protected boolean signed;
    protected String title;

    /**
     * Gets the value of the actualVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Version }
     *     
     */
    public Version getActualVersion() {
        return actualVersion;
    }

    /**
     * Sets the value of the actualVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Version }
     *     
     */
    public void setActualVersion(Version value) {
        this.actualVersion = value;
    }

    /**
     * Gets the value of the checkedOut property.
     * 
     */
    public boolean isCheckedOut() {
        return checkedOut;
    }

    /**
     * Sets the value of the checkedOut property.
     * 
     */
    public void setCheckedOut(boolean value) {
        this.checkedOut = value;
    }

    /**
     * Gets the value of the cipherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCipherName() {
        return cipherName;
    }

    /**
     * Sets the value of the cipherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCipherName(String value) {
        this.cipherName = value;
    }

    /**
     * Gets the value of the convertibleToPdf property.
     * 
     */
    public boolean isConvertibleToPdf() {
        return convertibleToPdf;
    }

    /**
     * Sets the value of the convertibleToPdf property.
     * 
     */
    public void setConvertibleToPdf(boolean value) {
        this.convertibleToPdf = value;
    }

    /**
     * Gets the value of the convertibleToSwf property.
     * 
     */
    public boolean isConvertibleToSwf() {
        return convertibleToSwf;
    }

    /**
     * Sets the value of the convertibleToSwf property.
     * 
     */
    public void setConvertibleToSwf(boolean value) {
        this.convertibleToSwf = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the lockInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LockInfo }
     *     
     */
    public LockInfo getLockInfo() {
        return lockInfo;
    }

    /**
     * Sets the value of the lockInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockInfo }
     *     
     */
    public void setLockInfo(LockInfo value) {
        this.lockInfo = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     */
    public void setLocked(boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the signed property.
     * 
     */
    public boolean isSigned() {
        return signed;
    }

    /**
     * Sets the value of the signed property.
     * 
     */
    public void setSigned(boolean value) {
        this.signed = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
