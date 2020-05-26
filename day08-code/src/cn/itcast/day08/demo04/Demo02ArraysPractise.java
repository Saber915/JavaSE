package cn.itcast.day08.demo04;

import java.util.Arrays;

public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String string = "kwjslvlkjfljalknlanlkjrakljflkasjfkanvx";
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        for (char c:chars) {
            System.out.print(c);
        }
        System.out.println();

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
