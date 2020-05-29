package cn.itcast.day09.demo09;

/**
 * this用法
 * 1. 在本类方法中访问本类的成员变量.
 * 2. 在本类的成员方法中, 访问本类的另一个成员方法.
 * 3. 本类的构造方法中, 访问本类的另一个构造方法
 *
 * 注意:
 * 在第三种用法当中要注意:
 *  A. this(...)调用也必须是构造方法的第一个语句, 并且是唯一一个.
 *  B. super和this两种构造调用, 不能同时使用.
 */
public class Zi extends Fu {
    int num = 20;

    public Zi(){
        this(23);   //  调用本类的重载构造方法.不在调用父类默认构造函数.
//        this(10, 20);     //错误写法,
    }

    public Zi(int n){
        this(10, 20);

    }

    public Zi(int m, int n){
        //注意循环调用问题.
    }
    public void showNum(){
        int num = 10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);


    }

    public void showA(){
        System.out.println("AAAAAAAAAAAA");
    }

    public void showB(){
        this.showA();
        System.out.println("BBBBBBBBBBBB");
    }

}
