package cn.itcast.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("saber");
        student.setAge(18);
        System.out.println("姓名: "+ student.getName() + ", 年龄: "+ student.getAge());

        Student student1 = new Student("Archer", 20);
        System.out.println("姓名: "+ student1.getName() + ", 年龄: "+ student1.getAge());
        student1.setAge(28);
        System.out.println("姓名: "+ student1.getName() + ", 年龄: "+ student1.getAge());
    }
}
