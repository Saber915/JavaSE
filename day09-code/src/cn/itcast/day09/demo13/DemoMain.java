package cn.itcast.day09.demo13;

public class DemoMain {


    public static void main(String[] args) {
        //    Dog dog = new Dog();      //错误写法

        Dog2H ha = new Dog2H();     //普通类
        ha.sleep();
        ha.eat();
        System.out.println("--------------------");
        GoldenDog gd = new GoldenDog();
        gd.sleep();
        gd.eat();
    }
}
