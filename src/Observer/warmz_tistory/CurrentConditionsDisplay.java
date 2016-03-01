package Observer.warmz_tistory;

import java.util.Observable;

/**
 * Created by jwizard on 2016. 3. 2..
 */
public class CurrentConditionsDisplay implements java.util.Observer {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable ob, Object arg) {
        if (ob instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) ob;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();

            display();
        }
    }

    public void display() {
        System.out.println("온도 : " + temperature);
        System.out.println("습도 : " + humidity);
        System.out.println();
    }
}
