package cn.itcast.day06.demo02;

public class Demo01PhoneOne {
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
    }
}
