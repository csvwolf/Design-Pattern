package me.buildin;

import me.codesky.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by SkyAo on 16/4/17.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;

        observable.addObserver(this);
    }

    public void update(Observable obs, Object args) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
