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


package org.n52.oxf.wcs.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.n52.oxf.adapter.wcs.model.version100.gml package. 
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

    private final static QName _Name_QNAME = new QName("http://www.opengis.net/gml", "name");
    private final static QName _LinearRing_QNAME = new QName("http://www.opengis.net/gml", "LinearRing");
    private final static QName _Envelope_QNAME = new QName("http://www.opengis.net/gml", "Envelope");
    private final static QName _Object_QNAME = new QName("http://www.opengis.net/gml", "_Object");
    private final static QName _RectifiedGrid_QNAME = new QName("http://www.opengis.net/gml", "RectifiedGrid");
    private final static QName _Polygon_QNAME = new QName("http://www.opengis.net/gml", "Polygon");
    private final static QName _Grid_QNAME = new QName("http://www.opengis.net/gml", "Grid");
    private final static QName _Geometry_QNAME = new QName("http://www.opengis.net/gml", "_Geometry");
    private final static QName _Surface_QNAME = new QName("http://www.opengis.net/gml", "_Surface");
    private final static QName _Description_QNAME = new QName("http://www.opengis.net/gml", "description");
    private final static QName _Exterior_QNAME = new QName("http://www.opengis.net/gml", "exterior");
    private final static QName _TimePosition_QNAME = new QName("http://www.opengis.net/gml", "timePosition");
    private final static QName _GeometricPrimitive_QNAME = new QName("http://www.opengis.net/gml", "_GeometricPrimitive");
    private final static QName _BoundedBy_QNAME = new QName("http://www.opengis.net/gml", "boundedBy");
    private final static QName _MetaDataProperty_QNAME = new QName("http://www.opengis.net/gml", "metaDataProperty");
    private final static QName _MetaData_QNAME = new QName("http://www.opengis.net/gml", "_MetaData");
    private final static QName _EnvelopeWithTimePeriod_QNAME = new QName("http://www.opengis.net/gml", "EnvelopeWithTimePeriod");
    private final static QName _Interior_QNAME = new QName("http://www.opengis.net/gml", "interior");
    private final static QName _Ring_QNAME = new QName("http://www.opengis.net/gml", "_Ring");
    private final static QName _GML_QNAME = new QName("http://www.opengis.net/gml", "_GML");
    private final static QName _Pos_QNAME = new QName("http://www.opengis.net/gml", "pos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.n52.oxf.adapter.wcs.model.version100.gml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.RectifiedGridType}
     * 
     */
    public RectifiedGridType createRectifiedGridType() {
        return new RectifiedGridType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.GridLimitsType}
     * 
     */
    public GridLimitsType createGridLimitsType() {
        return new GridLimitsType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.EnvelopeType}
     * 
     */
    public EnvelopeType createEnvelopeType() {
        return new EnvelopeType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.PolygonType}
     * 
     */
    public PolygonType createPolygonType() {
        return new PolygonType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.BoundingShapeType}
     * 
     */
    public BoundingShapeType createBoundingShapeType() {
        return new BoundingShapeType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.PointType}
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.TimePositionType}
     * 
     */
    public TimePositionType createTimePositionType() {
        return new TimePositionType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.GridType}
     * 
     */
    public GridType createGridType() {
        return new GridType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.AbstractSurfaceType}
     * 
     */
    public AbstractSurfaceType createAbstractSurfaceType() {
        return new AbstractSurfaceType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.EnvelopeWithTimePeriodType}
     * 
     */
    public EnvelopeWithTimePeriodType createEnvelopeWithTimePeriodType() {
        return new EnvelopeWithTimePeriodType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.CodeListType}
     * 
     */
    public CodeListType createCodeListType() {
        return new CodeListType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.LinearRingType}
     * 
     */
    public LinearRingType createLinearRingType() {
        return new LinearRingType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.StringOrRefType}
     * 
     */
    public StringOrRefType createStringOrRefType() {
        return new StringOrRefType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.DirectPositionType}
     * 
     */
    public DirectPositionType createDirectPositionType() {
        return new DirectPositionType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.GridEnvelopeType}
     * 
     */
    public GridEnvelopeType createGridEnvelopeType() {
        return new GridEnvelopeType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.VectorType}
     * 
     */
    public VectorType createVectorType() {
        return new VectorType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.ReferenceType}
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.AbstractRingPropertyType}
     * 
     */
    public AbstractRingPropertyType createAbstractRingPropertyType() {
        return new AbstractRingPropertyType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.MetaDataPropertyType}
     * 
     */
    public MetaDataPropertyType createMetaDataPropertyType() {
        return new MetaDataPropertyType();
    }

    /**
     * Create an instance of {@link org.n52.oxf.wcs.model.CodeType}
     * 
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.CodeType>}
     * 
     */
    @XmlElementDecl(name = "name", namespace = "http://www.opengis.net/gml")
    public JAXBElement<CodeType> createName(CodeType value) {
        return new JAXBElement<CodeType>(_Name_QNAME, ((Class) CodeType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.LinearRingType>}
     * 
     */
    @XmlElementDecl(name = "LinearRing", namespace = "http://www.opengis.net/gml", substitutionHeadName = "_Ring", substitutionHeadNamespace = "http://www.opengis.net/gml")
    public JAXBElement<LinearRingType> createLinearRing(LinearRingType value) {
        return new JAXBElement<LinearRingType>(_LinearRing_QNAME, ((Class) LinearRingType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.EnvelopeType>}
     * 
     */
    @XmlElementDecl(name = "Envelope", namespace = "http://www.opengis.net/gml", substitutionHeadName = "_Geometry", substitutionHeadNamespace = "http://www.opengis.net/gml")
    public JAXBElement<EnvelopeType> createEnvelope(EnvelopeType value) {
        return new JAXBElement<EnvelopeType>(_Envelope_QNAME, ((Class) EnvelopeType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<java.lang.Object>}
     * 
     */
    @XmlElementDecl(name = "_Object", namespace = "http://www.opengis.net/gml")
    public JAXBElement<Object> createObject(Object value) {
        return new JAXBElement<Object>(_Object_QNAME, ((Class) Object.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.RectifiedGridType>}
     * 
     */
    @XmlElementDecl(name = "RectifiedGrid", namespace = "http://www.opengis.net/gml", substitutionHeadName = "Grid", substitutionHeadNamespace = "http://www.opengis.net/gml")
    public JAXBElement<RectifiedGridType> createRectifiedGrid(RectifiedGridType value) {
        return new JAXBElement<RectifiedGridType>(_RectifiedGrid_QNAME, ((Class) RectifiedGridType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.PolygonType>}
     * 
     */
    @XmlElementDecl(name = "Polygon", namespace = "http://www.opengis.net/gml", substitutionHeadName = "_Surface", substitutionHeadNamespace = "http://www.opengis.net/gml")
    public JAXBElement<PolygonType> createPolygon(PolygonType value) {
        return new JAXBElement<PolygonType>(_Polygon_QNAME, ((Class) PolygonType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.GridType>}
     * 
     */
    @XmlElementDecl(name = "Grid", namespace = "http://www.opengis.net/gml", substitutionHeadName = "_Geometry", substitutionHeadNamespace = "http://www.opengis.net/gml")
    public JAXBElement<GridType> createGrid(GridType value) {
        return new JAXBElement<GridType>(_Grid_QNAME, ((Class) GridType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.AbstractGeometryType>}
     * 
     */
    @XmlElementDecl(name = "_Geometry", namespace = "http://www.opengis.net/gml", substitutionHeadName = "_GML", substitutionHeadNamespace = "http://www.opengis.net/gml")
    public JAXBElement<AbstractGeometryType> createGeometry(AbstractGeometryType value) {
        return new JAXBElement<AbstractGeometryType>(_Geometry_QNAME, ((Class) AbstractGeometryType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.AbstractSurfaceType>}
     * 
     */
    @XmlElementDecl(name = "_Surface", namespace = "http://www.opengis.net/gml", substitutionHeadName = "_GeometricPrimitive", substitutionHeadNamespace = "http://www.opengis.net/gml")
    public JAXBElement<AbstractSurfaceType> createSurface(AbstractSurfaceType value) {
        return new JAXBElement<AbstractSurfaceType>(_Surface_QNAME, ((Class) AbstractSurfaceType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.StringOrRefType>}
     * 
     */
    @XmlElementDecl(name = "description", namespace = "http://www.opengis.net/gml")
    public JAXBElement<StringOrRefType> createDescription(StringOrRefType value) {
        return new JAXBElement<StringOrRefType>(_Description_QNAME, ((Class) StringOrRefType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.AbstractRingPropertyType>}
     * 
     */
    @XmlElementDecl(name = "exterior", namespace = "http://www.opengis.net/gml")
    public JAXBElement<AbstractRingPropertyType> createExterior(AbstractRingPropertyType value) {
        return new JAXBElement<AbstractRingPropertyType>(_Exterior_QNAME, ((Class) AbstractRingPropertyType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.TimePositionType>}
     * 
     */
    @XmlElementDecl(name = "timePosition", namespace = "http://www.opengis.net/gml")
    public JAXBElement<TimePositionType> createTimePosition(TimePositionType value) {
        return new JAXBElement<TimePositionType>(_TimePosition_QNAME, ((Class) TimePositionType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.AbstractGeometricPrimitiveType>}
     * 
     */
    @XmlElementDecl(name = "_GeometricPrimitive", namespace = "http://www.opengis.net/gml", substitutionHeadName = "_Geometry", substitutionHeadNamespace = "http://www.opengis.net/gml")
    public JAXBElement<AbstractGeometricPrimitiveType> createGeometricPrimitive(AbstractGeometricPrimitiveType value) {
        return new JAXBElement<AbstractGeometricPrimitiveType>(_GeometricPrimitive_QNAME, ((Class) AbstractGeometricPrimitiveType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.BoundingShapeType>}
     * 
     */
    @XmlElementDecl(name = "boundedBy", namespace = "http://www.opengis.net/gml")
    public JAXBElement<BoundingShapeType> createBoundedBy(BoundingShapeType value) {
        return new JAXBElement<BoundingShapeType>(_BoundedBy_QNAME, ((Class) BoundingShapeType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.MetaDataPropertyType>}
     * 
     */
    @XmlElementDecl(name = "metaDataProperty", namespace = "http://www.opengis.net/gml")
    public JAXBElement<MetaDataPropertyType> createMetaDataProperty(MetaDataPropertyType value) {
        return new JAXBElement<MetaDataPropertyType>(_MetaDataProperty_QNAME, ((Class) MetaDataPropertyType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.AbstractMetaDataType>}
     * 
     */
    @XmlElementDecl(name = "_MetaData", namespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object", substitutionHeadNamespace = "http://www.opengis.net/gml")
    public JAXBElement<AbstractMetaDataType> createMetaData(AbstractMetaDataType value) {
        return new JAXBElement<AbstractMetaDataType>(_MetaData_QNAME, ((Class) AbstractMetaDataType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.EnvelopeWithTimePeriodType>}
     * 
     */
    @XmlElementDecl(name = "EnvelopeWithTimePeriod", namespace = "http://www.opengis.net/gml", substitutionHeadName = "Envelope", substitutionHeadNamespace = "http://www.opengis.net/gml")
    public JAXBElement<EnvelopeWithTimePeriodType> createEnvelopeWithTimePeriod(EnvelopeWithTimePeriodType value) {
        return new JAXBElement<EnvelopeWithTimePeriodType>(_EnvelopeWithTimePeriod_QNAME, ((Class) EnvelopeWithTimePeriodType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.AbstractRingPropertyType>}
     * 
     */
    @XmlElementDecl(name = "interior", namespace = "http://www.opengis.net/gml")
    public JAXBElement<AbstractRingPropertyType> createInterior(AbstractRingPropertyType value) {
        return new JAXBElement<AbstractRingPropertyType>(_Interior_QNAME, ((Class) AbstractRingPropertyType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.AbstractRingType>}
     * 
     */
    @XmlElementDecl(name = "_Ring", namespace = "http://www.opengis.net/gml", substitutionHeadName = "_Geometry", substitutionHeadNamespace = "http://www.opengis.net/gml")
    public JAXBElement<AbstractRingType> createRing(AbstractRingType value) {
        return new JAXBElement<AbstractRingType>(_Ring_QNAME, ((Class) AbstractRingType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.AbstractGMLType>}
     * 
     */
    @XmlElementDecl(name = "_GML", namespace = "http://www.opengis.net/gml", substitutionHeadName = "_Object", substitutionHeadNamespace = "http://www.opengis.net/gml")
    public JAXBElement<AbstractGMLType> createGML(AbstractGMLType value) {
        return new JAXBElement<AbstractGMLType>(_GML_QNAME, ((Class) AbstractGMLType.class), null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement<org.n52.oxf.adapter.wcs.model.version100.gml.DirectPositionType>}
     * 
     */
    @XmlElementDecl(name = "pos", namespace = "http://www.opengis.net/gml")
    public JAXBElement<DirectPositionType> createPos(DirectPositionType value) {
        return new JAXBElement<DirectPositionType>(_Pos_QNAME, ((Class) DirectPositionType.class), null, value);
    }

}
