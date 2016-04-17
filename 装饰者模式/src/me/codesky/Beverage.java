package me.codesky;

/**
 * Created by SkyAo on 16/4/17.
 * 饮料抽象类
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract  double cost();
}
