package cn.itcast.day06.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.brand = "iphone";
        iphone.price = 8898.0;
        iphone.color = "土豪金";
        method(iphone); //传递进去的参数其实就是地址值
    }

    private static void method(Phone phone){
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
    }
}
