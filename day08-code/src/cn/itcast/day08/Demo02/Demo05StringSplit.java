package cn.itcast.day08.Demo02;

/**
 * 分割字符串
 * public String[] split(String regex), 暗转参数的规则, 将字符串划分成若干部分.
 *
 * 注意事项:
 *  split方法的参数regex其实是一个正则表达式.
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc,d";
        String[] split = str1.split(",");
        for (String s: split) {
            System.out.println(s);
        }

        System.out.println("---------------");
        String str2 = "aaa bbb ccc";
        String[] s2 = str2.split(" ");
        for (String s: s2) {
            System.out.println(s);
        }

        System.out.println("---------------");
        String str3 = "XXX.YYY.ZZZ";
        String[] split1 = str3.split("\\.");
        for (String s: split1) {
            System.out.println(s);
        }
    }
}
