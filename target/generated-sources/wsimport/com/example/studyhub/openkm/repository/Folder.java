
package com.example.studyhub.openkm.repository;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for folder complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="folder">
 *   <complexContent>
 *     <extension base="{http://ws.openkm.com}node">
 *       <sequence>
 *         <element name="hasChildren" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "folder", propOrder = {
    "hasChildren"
})
public class Folder
    extends Node
{

    protected boolean hasChildren;

    /**
     * Gets the value of the hasChildren property.
     * 
     */
    public boolean isHasChildren() {
        return hasChildren;
    }

    /**
     * Sets the value of the hasChildren property.
     * 
     */
    public void setHasChildren(boolean value) {
        this.hasChildren = value;
    }

}
