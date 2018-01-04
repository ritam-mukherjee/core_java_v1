package design_patterns.behavioral.observer.weather_example;

import java.util.ArrayList;
import java.util.List;

public class Weather implements Subject{

    List<Observer> observers;

    private int temperature;
    private int humidity;
    private int rainfall;

    public Weather() {
        observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
            observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer observer:observers){
            observer.update();
        }

    }

    public void measurementChange(int temperature,int humidity,int rainfall){
        this.setTemperature(22);
        this.setHumidity(88);
        this.setRainfall(55);
        notifyAllObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getRainfall() {
        return rainfall;
    }

    public void setRainfall(int rainfall) {
        this.rainfall = rainfall;
    }
}
