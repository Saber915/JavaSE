package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
1. 定义Student学生类.
2. 定义一个ArrayList.
3. 添加学生.
4. 遍历
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Saber", 18));
        list.add(new Student("Archer", 19));
        list.add(new Student("Lancer", 20));
        list.add(new Student("高圆圆", 21));

        for (Student s: list) {
            System.out.println(s);
        }
    }
}
