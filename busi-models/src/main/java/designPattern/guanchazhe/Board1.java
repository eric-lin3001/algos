package designPattern.guanchazhe;

public class Board1 implements Observer{

    public Board1(WeatherStation weatherStation) {
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity) {
        System.out.println("updated!");
    }
}
