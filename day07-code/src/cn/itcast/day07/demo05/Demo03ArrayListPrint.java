package cn.itcast.day07.demo05;

import java.util.ArrayList;

/**
 * 定义指定格式打印集合的方法(ArrayList类型作为参数), 使用{} 括起集合, 使用@分隔每个元素.
 * 格式参照 {元素@元素@元素}
 */
public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Saber");
        list.add("Archer");
        list.add("Lancer");
        list.add("Rider");
        list.add("Caster");
        printArrayList(list);

    }

    private static void printArrayList(ArrayList<String> str){
        System.out.print("{");
        for (int i = 0; i < str.size(); i++) {
            if (i == str.size()-1){

                System.out.println(str.get(i) + "}");
            }else{
                System.out.print(str.get(i) + "@");
            }
        }
    }
}
