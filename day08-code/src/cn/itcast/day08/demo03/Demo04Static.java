package cn.itcast.day08.demo03;
/**
 * 静态代码块的格式
 * pubcic clss Class{
 *     static {
 *         //静态代码块的内容
 *     }
 * }
 *
 * 特点: 当第一次用来本类是, 静态代码块执行唯一的一次.
 * 静态内容总是优先于非静态, 所以静态代码块比构造方法先执行.
 *
 * 静态代码块的典型用途:
 * 用来一次性的对静态成员进行赋值.
 */
public class Demo04Static {
    public static void main(String[] args) {
        Person person = new Person();

    }
}
