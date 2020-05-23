package cn.itcast.day06.demo02;

public class Demo04PhoneReturn {
    public static void main(String[] args) {
        Phone phone = getPhone();
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
    }

    public static Phone getPhone(){
        Phone iphone = new Phone();
        iphone.brand = "iphone";
        iphone.price = 8388.0;
        iphone.color = "white";
        return iphone;
    }
}
