package cn.itcast.day07.Demo04;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

/**
 * 如果希望像集合ArrayList当中存储基本数据类型, 必须使用基本类型对应的 包装类
 *
 * 基本类型         包装类
 * byte             Byte
 * short            Short
 * int              Integer
 * long             Long
 * float            Float
 * double           Double
 * char             Character
 * boolean          Boolean
 *
 *
 * 从JDK1.5开始支持自动装箱, 自动拆箱
 *
 * 自动装箱: 基本类型--->包装类型
 * 自动拆箱: 包装类型--->基本类型
 */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ArrayList<Integer> ilist = new ArrayList<>();
        ilist.add(100);
        ilist.add(101);
        ilist.add(102);
        ilist.add(103);
        ilist.add(200);
        ilist.add(900);
        System.out.println(ilist);

        int i = ilist.get(1);
        System.out.println("第一号元素是: " + i);


    }
}
