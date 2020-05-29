package cn.itcast.day10.demo01;

/**
 * 任何版本的Java中, 接口都能定义抽象方法.
 *
 * public abstract 返回值 方法名称(参数列表)
 *
 * 注意事项:
 * 1. 接口当中的抽象方法, 修饰符必须是两个固定的关键字 public abstract
 * 2. 这两个关键字可以选择性的省略(省略其中之一, 或者两者都省略)
 */
public interface MyInterfaceAbstract {

    //这是一个抽象方法.
    public abstract void methodAbs();
    abstract void methodAbs1();
    public void methodAbs2();
    void methodAbs4();
}
