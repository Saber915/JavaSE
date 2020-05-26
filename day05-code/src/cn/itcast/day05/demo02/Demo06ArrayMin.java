package cn.itcast.day05.demo02;

public class Demo06ArrayMin {
    public static void main(String[] args) {
        int[] array = {5, 15, 30, 20, 10000, -30 , 35, 67};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        //谁最后最渣, 就能在min当中留下谁的战斗力
        System.out.println("最小值: " + min);
    }
}
