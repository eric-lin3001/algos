package designPattern.guanchazhe;

import java.util.Observable;

public class Main extends Observable {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
//        WeatherStationObservable weatherStation = new WeatherStationObservable();

        // 观察者向主题注册
        Board1 board1 = new Board1(weatherStation);
//        BoardObserver1 boardObserver1 = new BoardObserver1(weatherStation);

        // 模拟改变气象数据，触发通知
        weatherStation.setMeasurements(80,25);
        weatherStation.setMeasurements(70,26);


        /**
         *
         * 针对实现编程
         *
         * public void measurementChanged(){
         *    Board1.update(temp,humidity);
         *    Board2.update(temp,humidity);
         *    Board3.update(temp,humidity);
         *    ...
         * }
         *
         * 缺点：
         *
         * 1. 每次增加或减少Board，都修改主程序（即WeatherStation.java）
         * 2. 缺少封装。
         */
    }
}
