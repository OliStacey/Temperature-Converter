package com.qa.temperatureconverter;

public class TemperatureConverter {
	
	
	  

	

	    public static float convertFahrenheitToCelsius(int fahrenheit) {
	        return ((float) 5 / 9) * (fahrenheit - 32);
	    }

	    public static float convertCelsiusToFahrenheit(int celsius) {
	        return ((float) 9 / 5) * (celsius) + 32;
	    }

	    public static float convertKelvinToCelsius(int kelvin) {
	        return (float) (kelvin - 273.15);
	    }

	    public static float convertCelsiusToKelvin(int celsius) {
	        return (float) (celsius + 273.15);
	    }

	    public static float convertKelvinToFahrenheit(int kelvin) {
	        return (float) (((float) 9 / 5) * (kelvin - 273.15) + 32);
	    }

	    public static float convertFahrenheitToKelvin(float fahrenheit) {
	        return (float) (((float) 5 / 9) * (fahrenheit - 32) + 273.15);
	    }

	 
}
