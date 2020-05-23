package cn.itcast.day06.demo02;

/**
 * 定义一个类, 用来模拟"手机"
 *
 * 属性: 品牌, 价格, 颜色
 * 行为: 打电话, 发短信.
 */
public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who){
        System.out.println("打电话给: "+ who);
    }

    public void sendMsg(){
        System.out.println("新年快乐.");
    }
}
