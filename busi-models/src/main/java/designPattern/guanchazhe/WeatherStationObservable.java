package designPattern.guanchazhe;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherStationObservable extends Observable {

    private float temp;
    private float humidity;

    public WeatherStationObservable() {
    }


    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    // data changed
    public void setMeasurements(float temp,float humidity){
        this.temp = temp;
        this.humidity = humidity;
        measurementChanged();
    }
}
