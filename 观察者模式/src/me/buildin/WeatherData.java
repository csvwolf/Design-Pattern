package me.buildin;

import java.util.Observable;

/**
 * Created by SkyAo on 16/4/17.
 *
 * 用Java的自带库来完成观察者模式
 */
public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public void measurementsChanged() {
        setChanged();   // 告知变更让订阅方来获取
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // 由于要拉(获取),所以订阅方需要知道以下方法来获取数据
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
