package cn.itcast.day06.demo05;

/**
 * 一个标准的类, 通常要满足一下四个组成部门.
 * 1. 所有的成员变量都要用private修饰
 * 2. 每个成员变量都要编写一对Getter/Setter方法
 * 3. 编写一个无参的构造方法.
 * 4. 编写一个全餐的构造方法.
 *
 * 这样的标准被也叫Java Bean
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
