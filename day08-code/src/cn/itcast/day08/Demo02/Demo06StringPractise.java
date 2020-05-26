package cn.itcast.day08.Demo02;

/**
 * 题目:
 * 定义一个方法, 把数组{1, 2, 3}按照指定格式拼接成一个字符串, 格式参照如下: [word1#word2#word3]
 */
public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        String string = array2String(array);
        System.out.println(string);


    }
    private static String array2String(int[] array){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                sb.append("word");
                sb.append(array[i]);
                sb.append("]");

            }else{
                sb.append("word");
                sb.append(array[i]);
                sb.append("#");
            }
        }
        return sb.toString();
    }
}
