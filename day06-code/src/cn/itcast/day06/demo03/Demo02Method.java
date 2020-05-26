package cn.itcast.day06.demo03;

public class Demo02Method {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 20, 100};
        int max = getMax(array);
        System.out.println(max);


    }
    /*
    接收一个数组作为参数, 返回其中的最大值.
     */
    private static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

}