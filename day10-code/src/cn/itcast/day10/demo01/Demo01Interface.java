package cn.itcast.day10.demo01;

/**
 * 接口是一种引用数据类型, 最重要的内容就是其中的抽象方法.
 *
 * 如何定义一个接口
 *
 * public interface 接口名称{
 *     //接口内容
 * }
 * 如果是Java7, 那么接口中可以包含的内容有:
 *  1. 常量
 *  2. 抽象方法
 *
 * 如果是java8+ 还可以额外包含
 * 3. 默认方法.
 * 4. 静态方法
 *
 * 如果是java9, 还可以额外包含
 * 5. 私有方法.
 *
 *
 * 接口使用步骤:
 * 1. 接口不能直接使用, 必须有一个 "实现类" 来实现该接口
 *  public 实现类名称 implements 接口名称{
 *     //...
 *  }
 * 2. 接口的实现类必须覆盖重写(实现) 接口中所有的抽象方法.
 *
 * 3. 创建实现类的对象
 *
 *
 * 注意事项:
 * 如果实现类并没有覆盖重写所有的抽象方法, 那么这个实现类自己就必须是抽象类.
 */
public class Demo01Interface {
}
