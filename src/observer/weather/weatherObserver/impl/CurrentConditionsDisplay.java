package observer.weather.weatherObserver.impl;

import observer.weather.Subject;
import observer.weather.weatherObserver.DisplayElement;
import observer.weather.weatherObserver.Observer;

public class CurrentConditionsDisplay implements DisplayElement,Observer {

    private float temperature;
    private float humidity;
    private Subject subject;

    public CurrentConditionsDisplay(Subject weatherData){
        this.subject=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions :"+temperature+" F degrees and "+humidity+" % humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
       this.temperature=temp;
       this.humidity=humidity;
       display();
    }
}
