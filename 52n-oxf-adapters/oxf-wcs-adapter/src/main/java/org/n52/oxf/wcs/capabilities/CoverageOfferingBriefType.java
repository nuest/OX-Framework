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

@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(name = "CoverageOfferingBriefType", namespace = "http://www.opengis.net/wcs")
public class CoverageOfferingBriefType
    extends AbstractDescriptionType
{

    @XmlElement(name = "lonLatEnvelope", namespace = "http://www.opengis.net/wcs", type = LonLatEnvelopeType.class)
    protected LonLatEnvelopeType lonLatEnvelope;
    @XmlElement(name = "keywords", namespace = "http://www.opengis.net/wcs", type = Keywords.class)
    protected List<Keywords> keywords;

    /**
     * Gets the value of the lonLatEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link org.n52.oxf.wcs.capabilities.LonLatEnvelopeType}
     */
    public LonLatEnvelopeType getLonLatEnvelope() {
        return lonLatEnvelope;
    }

    /**
     * Sets the value of the lonLatEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.n52.oxf.wcs.capabilities.LonLatEnvelopeType}
     */
    public void setLonLatEnvelope(LonLatEnvelopeType value) {
        this.lonLatEnvelope = value;
    }

    protected List<Keywords> _getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<Keywords>();
        }
        return keywords;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.n52.oxf.wcs.capabilities.Keywords}
     * 
     */
    public List<Keywords> getKeywords() {
        return this._getKeywords();
    }

}
