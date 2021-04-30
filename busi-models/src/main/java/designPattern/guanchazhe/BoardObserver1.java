package designPattern.guanchazhe;

import java.util.Observable;
import java.util.Observer;

public class BoardObserver1 implements Observer {

    public BoardObserver1(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obj, Object arg) {
        WeatherStationObservable wso = (WeatherStationObservable) obj;
        System.out.println(wso.getTemp());
        System.out.println("updated!");
    }
}
