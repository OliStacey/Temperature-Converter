package com.qa.temperatureconverter;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(TemperatureConverter.convertFahrenheitToCelsius((int) 70.0));
		
		System.out.println(TemperatureConverter.convertCelsiusToFahrenheit((int) 25.0));
				
		System.out.println(TemperatureConverter.convertCelsiusToKelvin((int) 100.00));
		
		System.out.println(TemperatureConverter.convertKelvinToCelsius((int) 100.00));
		
		System.out.println(TemperatureConverter.convertFahrenheitToKelvin((float) 60.00));
		
		System.out.println(TemperatureConverter.convertKelvinToFahrenheit((int) 200.00));

	}

}
