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
package org.n52.oxf.conversion.unit.aixm;

import org.n52.oxf.conversion.unit.CustomUnitConverter;
import org.n52.oxf.conversion.unit.NumberWithUOM;


public class FlightLevelUnitConverter implements CustomUnitConverter {

	private static final String RESULT_UOM = "[ft_i]";
	
	@Override
	public NumberWithUOM convert(double doubleValue) {
		/*
		 * simple FL -> feet conversion, taking no atmospheric pressure into account
		 */
		return new NumberWithUOM(doubleValue * 100, RESULT_UOM);
	}

	@Override
	public String getBaseUnit() {
		return RESULT_UOM;
	}

	@Override
	public String getUnitString() {
		return "FL";
	}

}
