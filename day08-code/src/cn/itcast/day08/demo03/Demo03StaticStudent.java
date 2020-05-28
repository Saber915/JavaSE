package cn.itcast.day08.demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room = "101教室";

        Student one = new Student("Saber", 18);
        Student two = new Student("Archer", 18);

        System.out.println(one);
        System.out.println(two);


    }
}
