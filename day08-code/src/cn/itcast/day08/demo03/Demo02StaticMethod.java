package cn.itcast.day08.demo03;

/**
 * 一旦使用static修饰成员方法, 那么该方法就成为了静态方法, 静态方法不属于对象, 而是属于类.
 *
 * 如果没有static关键字, 那么必须首相创建对象, 然后通过对象才能使用它.
 *
 * 无论是成员变量还是成员方法, 如果有了static都推荐使用类名成进行调用.
 *
 * 静态变量: 类名称.静态变量
 * 静态方法: 类名称.静态方法
 *
 * 1. 静态不能直接访问非静态.
 *  原因: 因为在内存中是[先]有的静态内容[后]有的非静态内容.
 * 2.静态方法中不能写this.
 *  原因: this代表当前对象, 静态资源加载时没有对象.
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method();

        //静态方法可以通过对象名调用, 也可以通过类名直接调用.
        //推荐使用类名直接调用.
        MyClass.methodStatic();
        //对于本类当中的静态方法, 可以省略类名称.
        myMethod();
        Demo02StaticMethod.myMethod();      //两者等效.
    }

    private static void myMethod(){
        System.out.println("自己的方法!");
    }

}
