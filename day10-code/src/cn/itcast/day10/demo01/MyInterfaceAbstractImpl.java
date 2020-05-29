package cn.itcast.day10.demo01;

public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    @Override
    public void methodAbs() {
        System.out.println("这是第一个方法");
    }

    @Override
    public void methodAbs1() {
        System.out.println("这是第二个方法");
    }

    @Override
    public void methodAbs2() {
        System.out.println("这是第三个方法");
    }

    @Override
    public void methodAbs4() {
        System.out.println("这是第四个方法");
    }

    public static void main(String[] args) {
        MyInterfaceAbstract inter = new MyInterfaceAbstractImpl();
        inter.methodAbs();
        inter.methodAbs1();
        inter.methodAbs2();
        inter.methodAbs4();

    }
}
