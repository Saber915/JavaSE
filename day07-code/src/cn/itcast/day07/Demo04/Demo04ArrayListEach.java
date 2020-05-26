package cn.itcast.day07.Demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Saber");
        list.add("Archer");
        list.add("Lancer");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String name: list) {
            System.out.println(name);
        }
    }
}
