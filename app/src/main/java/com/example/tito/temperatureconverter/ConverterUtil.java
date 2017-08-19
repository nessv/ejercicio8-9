package com.example.tito.temperatureconverter;

/**
 * Created by Tito on 8/19/17.
 */

public class ConverterUtil {

    static int currentExchageSell = 5560; //Aprox
    static int currentExchageBuy = 5520;

    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }

    public static float convertDolarsToGuaranies (float dolar){
        return (dolar/currentExchageSell);
    }

    public static float convertGuaraniesToDolars(float guaranies){
        return (guaranies*currentExchageBuy);
    }

    //O al reves porque nunca estoy seguro si tengo que usar Compra o Venta :D
}
