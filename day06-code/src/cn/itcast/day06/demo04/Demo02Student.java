package cn.itcast.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student student = new Student("saber", 18);
        System.out.println("-------------------");
        Student student2 = new Student();

        //如果需要改变对象当中的成员变量数据内容, 仍然需要使用setXxx方法

        student.setAge(20);
        student.setName("Saber king");

    }
}
