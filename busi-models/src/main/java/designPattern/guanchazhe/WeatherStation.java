package designPattern.guanchazhe;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    ArrayList observerList;
    private float temp;
    private float humidity;

    public WeatherStation() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observerList.indexOf(observer);
        if (i >= 0) {
            observerList.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<observerList.size();i++){
            Observer observer = (Observer) observerList.get(i);
            observer.update(temp,humidity);
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }


    public void setMeasurements(float temp,float humidity){
        this.temp = temp;
        this.humidity = humidity;
        measurementChanged();
    }
}
