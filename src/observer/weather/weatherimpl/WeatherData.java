package observer.weather.weatherimpl;

import observer.weather.Subject;
import observer.weather.weatherObserver.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList observers;//存储观察者信息
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        int n=observers.indexOf(observer);
        if(n>=0){
            observers.remove(n);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer=(Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }
    public void measurementsChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
