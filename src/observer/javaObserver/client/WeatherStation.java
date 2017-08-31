package observer.javaObserver.client;

import observer.javaObserver.weatherImpl.CurrentConditionsDisplay;
import observer.javaObserver.weatherImpl.WeatherData;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData=new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(22,33,44);
        weatherData.setMeasurements(223.4f,33,44);
    }

}
