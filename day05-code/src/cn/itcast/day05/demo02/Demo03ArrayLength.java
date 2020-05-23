package cn.itcast.day05.demo02;

/**
 * 如果获取数组长度, 格式
 * array.length
 * 数组一旦创建, 程序运行期间, 长度不可改变.
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10, 20 , 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(arrayA.length);
        System.out.println(arrayB.length);

        System.out.println("------------------");
        int[] arrayC = new int[3];
        System.out.println(arrayC);
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC);
        System.out.println(arrayC.length);      //数组地址已经改变.
    }
}
