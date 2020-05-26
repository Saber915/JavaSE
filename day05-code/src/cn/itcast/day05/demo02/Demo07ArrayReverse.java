package cn.itcast.day05.demo02;

/**
 * 数组元素反转
 * 本来的样子: [1, 2, 3, 4]
 * 之后的样子: [4, 3, 2, 1]
 * 要求不能用新的数组, 就用原来的数组
 */
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        printArray(array);
        System.out.println("--------------------");
        arrayReverseFor(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void arrayReverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length-i-1] = temp;
        }

    }
        //使用两个指针来操作.
    private static void arrayReverseFor(int[] arr){
        for (int min = 0, max=arr.length-1; min< max; min++, max--){
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
    }


}
