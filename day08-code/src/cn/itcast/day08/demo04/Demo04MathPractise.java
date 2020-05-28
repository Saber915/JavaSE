package cn.itcast.day08.demo04;

/**
 * 题目:
 * 计算在-10.8到5.9之间, 绝对值大于6 或者小于2.1的整数有多少个.
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        for (int i = -10; i < 6; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) <= 2){
                System.out.println(i);
            }
        }
    }
}
