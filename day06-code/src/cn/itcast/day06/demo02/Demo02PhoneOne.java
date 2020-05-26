package cn.itcast.day06.demo02;

public class Demo02PhoneOne {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.brand = "iphone";
        iphone.color = "white";
        iphone.price = 10086;

        System.out.println(iphone.brand);
        System.out.println(iphone.color);
        System.out.println(iphone.price);


        iphone.call("Saber");
        iphone.sendMsg();

        System.out.println("-----------------------");
        Phone samsung = new Phone();
        samsung.brand = "samsumg";
        samsung.color = "white";
        samsung.price = 10086;

        System.out.println(samsung.brand);
        System.out.println(samsung.color);
        System.out.println(samsung.price);


        samsung.call("Saber");
        samsung.sendMsg();
    }
}
