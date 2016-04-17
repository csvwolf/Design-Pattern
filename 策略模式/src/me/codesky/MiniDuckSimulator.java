package me.codesky;

/**
 * Created by SkyAo on 16/4/17.
 *
 * 策略模式: 让算法独立于类, 可以随意复用
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
