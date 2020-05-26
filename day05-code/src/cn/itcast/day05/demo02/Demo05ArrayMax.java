package cn.itcast.day05.demo02;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 15, 30, 20, 10000, 30 , 35, 67};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        //谁最后最厉害, 就能在max当中留下谁的战斗力
        System.out.println("最大值: " + max);
    }
}
