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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(name = "RangeSetType", namespace = "http://www.opengis.net/wcs")
public class RangeSetType
    extends AbstractDescriptionType
{

    @XmlElement(name = "axisDescription", namespace = "http://www.opengis.net/wcs", type = AxisDescription.class)
    protected List<AxisDescription> axisDescription;
    @XmlElement(name = "nullValues", namespace = "http://www.opengis.net/wcs", type = ValueEnumType.class)
    protected ValueEnumType nullValues;
    @XmlAttribute(name = "refSys", namespace = "")
    protected String refSys;
    @XmlAttribute(name = "refSysLabel", namespace = "")
    protected String refSysLabel;
    @XmlAttribute(name = "semantic", namespace = "http://www.opengis.net/wcs")
    protected String semantic;

    protected List<AxisDescription> _getAxisDescription() {
        if (axisDescription == null) {
            axisDescription = new ArrayList<AxisDescription>();
        }
        return axisDescription;
    }

    /**
     * Defines a range provided by a coverage. Multiple occurences are used for compound observations, to descibe an additional parameter (that is, an independent variable besides space and time), plus the valid values of this parameter (which GetCoverage requests can use to select subsets of a coverage offering).Gets the value of the axisDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.n52.oxf.wcs.capabilities.AxisDescription}
     * 
     */
    public List<AxisDescription> getAxisDescription() {
        return this._getAxisDescription();
    }

    /**
     * Gets the value of the nullValues property.
     * 
     * @return
     *     possible object is
     *     {@link org.n52.oxf.wcs.capabilities.ValueEnumType}
     */
    public ValueEnumType getNullValues() {
        return nullValues;
    }

    /**
     * Sets the value of the nullValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.n52.oxf.wcs.capabilities.ValueEnumType}
     */
    public void setNullValues(ValueEnumType value) {
        this.nullValues = value;
    }

    /**
     * Gets the value of the refSys property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    public String getRefSys() {
        return refSys;
    }

    /**
     * Sets the value of the refSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setRefSys(String value) {
        this.refSys = value;
    }

    /**
     * Gets the value of the refSysLabel property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    public String getRefSysLabel() {
        return refSysLabel;
    }

    /**
     * Sets the value of the refSysLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setRefSysLabel(String value) {
        this.refSysLabel = value;
    }

    /**
     * Gets the value of the semantic property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    public String getSemantic() {
        if (semantic == null) {
            return "closed";
        } else {
            return semantic;
        }
    }

    /**
     * Sets the value of the semantic property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setSemantic(String value) {
        this.semantic = value;
    }

}
