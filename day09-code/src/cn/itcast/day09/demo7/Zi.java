package cn.itcast.day09.demo7;

public class Zi extends Fu {
    public Zi(){
//        super();    //默认隐含调用父类无参构造
        super(3);       //调用父类重载父类构造方法
        System.out.println("子类构造方法");
    }
}
