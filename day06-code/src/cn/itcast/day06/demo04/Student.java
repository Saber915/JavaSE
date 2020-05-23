package cn.itcast.day06.demo04;

/**
 * 构造方法是专门用来创建对象的方法, 当我们通过关键字new来创建对象时, 其实就是在调用构造方法.
 *
 * 格式:
 * public Student([参数列表...]){
 *     方法体
 * }
 *
 * 注意事项:
 * 1. 构造方法的名称必须和所在的类名称挖潜一样, 就连大小写也要一样.
 * 2. 构造方法不要写返回值类型. 连void都不要写.
 * 3. 构造方法不能return一个具体的返回值.
 * 4. 如果没有编写任何构造方法, 那么编译器将会默认调用一个构造方法, 没有参数, 方法体什么都不做
 * 5. 一旦编写了至少一个构造方法, 那么编译器将不再调用默认构造方法.
 */
public class Student {
    private String name;
    private int age;

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

    public Student(){
        System.out.println("无参构造方法执行.");
    }

    public Student(String name, int age){
        System.out.println("全参构造方法执行.");
        this.name = name;
        this.age = age;
    }
}
