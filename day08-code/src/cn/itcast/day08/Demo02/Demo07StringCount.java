package cn.itcast.day08.Demo02;

import java.util.Scanner;

/**
 * 题目
 * 键盘输入一个字符串, 并且统计其中各种字符出现的次数.
 * 种类有: 大写字母, 小写字母, 数字, 其他.
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String next = sc.next();
        char[] chars = next.toCharArray();
        int upperCount = 0;
        int lowserCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (char c: chars) {
            //大写字母
            if (c>='A' && c<= 'Z'){
                upperCount++;
            }else if(c>='a' && c<= 'z'){
                lowserCount++;
            }else if(c>='0' && c<= '9'){
                numberCount++;
            }else{
                otherCount++;
            }
        }

        System.out.println("大写字母: "+ upperCount);
        System.out.println("小写字母: "+ lowserCount);
        System.out.println("数字: "+ numberCount);
        System.out.println("其他字符:"+ otherCount);
    }

}
