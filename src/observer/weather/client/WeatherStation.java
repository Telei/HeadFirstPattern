package observer.weather.client;

import observer.weather.weatherimpl.WeatherData;
import observer.weather.weatherObserver.impl.CurrentConditionsDisplay;

public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData=new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(99,55,43.3f);
        weatherData.setMeasurements(223.4f,33,44);
    }
}
