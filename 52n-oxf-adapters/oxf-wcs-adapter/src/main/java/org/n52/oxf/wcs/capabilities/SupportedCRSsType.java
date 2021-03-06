/**
 * ﻿Copyright (C) 2012
 * by 52 North Initiative for Geospatial Open Source Software GmbH
 *
 * Contact: Andreas Wytzisk
 * 52 North Initiative for Geospatial Open Source Software GmbH
 * Martin-Luther-King-Weg 24
 * 48155 Muenster, Germany
 * info@52north.org
 *
 * This program is free software; you can redistribute and/or modify it under
 * the terms of the GNU General Public License version 2 as published by the
 * Free Software Foundation.
 *
 * This program is distributed WITHOUT ANY WARRANTY; even without the implied
 * WARRANTY OF MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program (see gnu-gpl v2.txt). If not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA or
 * visit the Free Software Foundation web page, http://www.fsf.org.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b11-EA 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.06.25 at 02:38:11 CEST 
//


package org.n52.oxf.wcs.capabilities;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.n52.oxf.wcs.model.CodeListType;

@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(name = "SupportedCRSsType", namespace = "http://www.opengis.net/wcs")
public class SupportedCRSsType {

    @XmlElement(name = "requestResponseCRSs", namespace = "http://www.opengis.net/wcs", type = CodeListType.class)
    protected List<CodeListType> requestResponseCRSs;
    @XmlElement(name = "requestCRSs", namespace = "http://www.opengis.net/wcs", type = CodeListType.class)
    protected List<CodeListType> requestCRSs;
    @XmlElement(name = "responseCRSs", namespace = "http://www.opengis.net/wcs", type = CodeListType.class)
    protected List<CodeListType> responseCRSs;
    @XmlElement(name = "nativeCRSs", namespace = "http://www.opengis.net/wcs", type = CodeListType.class)
    protected List<CodeListType> nativeCRSs;

    protected List<CodeListType> _getRequestResponseCRSs() {
        if (requestResponseCRSs == null) {
            requestResponseCRSs = new ArrayList<CodeListType>();
        }
        return requestResponseCRSs;
    }

    /**
     * Gets the value of the requestResponseCRSs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestResponseCRSs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestResponseCRSs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.n52.oxf.wcs.model.CodeListType}
     * 
     */
    public List<CodeListType> getRequestResponseCRSs() {
        return this._getRequestResponseCRSs();
    }

    protected List<CodeListType> _getRequestCRSs() {
        if (requestCRSs == null) {
            requestCRSs = new ArrayList<CodeListType>();
        }
        return requestCRSs;
    }

    /**
     * Gets the value of the requestCRSs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestCRSs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestCRSs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.n52.oxf.wcs.model.CodeListType}
     * 
     */
    public List<CodeListType> getRequestCRSs() {
        return this._getRequestCRSs();
    }

    protected List<CodeListType> _getResponseCRSs() {
        if (responseCRSs == null) {
            responseCRSs = new ArrayList<CodeListType>();
        }
        return responseCRSs;
    }

    /**
     * Gets the value of the responseCRSs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseCRSs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseCRSs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.n52.oxf.wcs.model.CodeListType}
     * 
     */
    public List<CodeListType> getResponseCRSs() {
        return this._getResponseCRSs();
    }

    protected List<CodeListType> _getNativeCRSs() {
        if (nativeCRSs == null) {
            nativeCRSs = new ArrayList<CodeListType>();
        }
        return nativeCRSs;
    }

    /**
     * Gets the value of the nativeCRSs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nativeCRSs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNativeCRSs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.n52.oxf.wcs.model.CodeListType}
     * 
     */
    public List<CodeListType> getNativeCRSs() {
        return this._getNativeCRSs();
    }

}
