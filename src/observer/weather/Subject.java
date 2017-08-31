package observer.weather;

import observer.weather.weatherObserver.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public  void removeObserver(Observer observer);
    public void notifyObserver();
}
