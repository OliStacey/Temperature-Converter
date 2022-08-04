package com.qa.temperatureconverter;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;




public class TemperatureConverterTest {
	
private TemperatureConverter tempCon;
	
	@Before
	public void setup() {
		tempCon = new TemperatureConverter();
		
	}
	
	@Test
	public void createdTemperatureConverterTest() {
		boolean isTempCon = tempCon instanceof TemperatureConverter;
	
	    assertTrue(isTempCon);
	    }
	
	@Test
	public void fahrenheitToCelsiusSuccess() {
		float answer = 10;
		
		assertEquals(answer, TemperatureConverter.convertFahrenheitToCelsius(50), 0);
		
	}
	
	@Test
	public void celsiusToFahrenheitSuccess() {
		float answer = 140;
		assertEquals(answer, TemperatureConverter.convertCelsiusToFahrenheit(60), 0);
	}
	
	@Test
	public void kelvinToCelsiusSuccess() {
		float answer = 40;
		assertEquals(answer, TemperatureConverter.convertKelvinToCelsius(313), 1);
	}
	
	@Test
	public void celciusToKelvinSuccess() {
		float answer = 313;
		assertEquals(answer, TemperatureConverter.convertCelsiusToKelvin(40), 1);
	}
	
	@Test
	public void kelvinToFahrenheitSuccess() {
		float answer = (float) 80.33;
	    assertEquals(answer, TemperatureConverter.convertKelvinToFahrenheit(300), 0);
				
	}
	
	@Test
	public void fahrenheitToKelvinSuccess() {
		float answer= (float) 300;
		assertEquals(answer, TemperatureConverter.convertFahrenheitToKelvin((float) 80.33), 0);
	}
	

	
	










}