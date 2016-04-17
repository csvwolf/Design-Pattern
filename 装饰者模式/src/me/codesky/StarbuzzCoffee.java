package me.codesky;

/**
 * Created by SkyAo on 16/4/17.
 *
 * 装饰者模式: 动态将责任附加到对象上,若要扩展功能,装饰者提供了比继承更有弹性的替代方案.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);   // Mocha继承的是CondimentDecorator类,而这个类又继承于Beverage,所以可以方便的进行转换
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
