package cn.itcast.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Saber";
//        person.age = 18;    //错误写法, 直接访问private.
        person.setAge(18);

        person.show();
    }
}
