package cn.itcast.day06.demo03;

/**
 * 问题描述: 定义Person的年龄时, 无法阻止不合理的数组被设置进来.
 * 解决方案, 用private关键字将需要保护的成员变量进行修饰.
 *
 * 一旦使用private进行修饰, 那么本类中仍按可以随意访问.
 * 但是, 超出了本类范围就不能直接访问了.
 *
 * 间接访问成员变量, 就是定义一堆getter/setter方法
 */
public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("我叫: "+ name + "年龄: "+ age + "岁");
    }

    public void setAge(int age){
        if (age < 100 && age > 0){

            this.age = age;
        }else{
            System.out.println("数据不合理");
        }
    }

    public int getAge(){
        return this.age;
    }

}
