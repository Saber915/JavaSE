package cn.itcast.day05.demo03;

/**
 * 数组可以作为方法的参数.
 * 当调用方法的时候, 向方法的小括号进行传参, 传递进去的其实是数组的地址值.
 */
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 20 , 30, 40 , 50};
        printArray(array);


    }

    private static void printArray(int[] arr){
        System.out.println(arr);    //地址值.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
