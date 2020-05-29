package cn.itcast.day09.demo05;

/**
 * 方法覆盖重写的主意事项:
 * 1. 必须保证福字类之间的方法名称相同, 参数列表也相同
 * @Override: 卸载方法前面用来检测是不是有效的正确覆盖重写.
 *
 * 这个注解就算不写, 只要满足覆盖重写的要求也算是覆盖重写.
 * 2. 子类方法的返回值必须小于等于父类方法的返回值.
 * java.lang.Object类是所有类的父类. java.lang.String就是Object的子类.
 * public > protected > default > private
 *
 * (default) 不是关键字default, 而是什么都不写, 留空
 */
public class Demo01Override {
}
