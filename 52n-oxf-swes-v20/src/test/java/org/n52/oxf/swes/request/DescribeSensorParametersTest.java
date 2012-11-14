package org.n52.oxf.swes.request;

import static org.junit.Assert.assertEquals;
import static org.n52.oxf.swes.request.DescribeSensorParameters.DESCRIBE_SENSOR_OUTPUT_FORMAT;
import static org.n52.oxf.swes.request.DescribeSensorParameters.DESCRIBE_SENSOR_PROCEDURE_PARAMETER;
import static org.n52.oxf.swes.request.DescribeSensorParameters.OUTPUT_FORMAT_SENSORML;

import org.junit.Before;
import org.junit.Test;
import org.n52.ows.request.RequestParameters;

public class DescribeSensorParametersTest {
    
    private RequestParameters parameterAssembly;

    @Before
    public void setUp() {
        parameterAssembly = new DescribeSensorParameters("sensorId", OUTPUT_FORMAT_SENSORML);
    }

	@Test
	public void testValidConstructorParameters() {
		new DescribeSensorParameters("sdf", "sdf");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidConstructorParameters() {
		new DescribeSensorParameters(null, null);
		new DescribeSensorParameters("", null);
		new DescribeSensorParameters(null, "");
        new DescribeSensorParameters("", "");
        new DescribeSensorParameters("", "sdf");
        new DescribeSensorParameters("sdf", "");
	}
	
	@Test
	public void testApplyingAndGettingMandatoryParameters() {
		String parMan_01 = parameterAssembly.getSingleValue(DESCRIBE_SENSOR_PROCEDURE_PARAMETER);
		String parMan_02 = parameterAssembly.getSingleValue(DESCRIBE_SENSOR_OUTPUT_FORMAT);
		
		assertEquals("sensorId", parMan_01);
		assertEquals(OUTPUT_FORMAT_SENSORML, parMan_02);
	}

}
