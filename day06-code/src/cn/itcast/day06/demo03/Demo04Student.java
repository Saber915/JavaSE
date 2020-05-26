package cn.itcast.day06.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Saber");
        student.setAge(18);
        student.setMale(false);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.isMale());
    }
}
