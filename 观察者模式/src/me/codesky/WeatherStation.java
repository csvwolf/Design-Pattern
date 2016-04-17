package me.codesky;

/**
 * 观察者模式: 定义了对象间的一对多依赖,当一个对象改变状态时,它的所有依赖者都会收到通知并自动更新
 * 通过Subject来当做面向的接口来编程实现,从而Observer不需要直接知道他的订阅者有哪些,会发给多少人
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
