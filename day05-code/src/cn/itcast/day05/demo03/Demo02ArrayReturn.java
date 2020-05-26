package cn.itcast.day05.demo03;

/**
 * 一个方法可以有多个参数;
 * 但是只能有0或者1个返回值, 不能有多个返回值.
 * 如果希望一个方法中产生了多个结果数据进行返回, 怎么办?
 *
 * 任何数据类型都能作为方法的参数类型, 或者返回值类型.
 *
 * 数组作为方法的参数, 传递进去的其实是数组的地址值.
 * 数组作为方法的返回值, 返回的也是数组的地址值.
 */
public class Demo02ArrayReturn {
    public static void main(String[] args) {

        int[] calculate = calculate(1, 2, 3);
        System.out.println("sum: "+calculate[0]);
        System.out.println("avg: "+calculate[1]);

    }

    private static int[]  calculate(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum / 3;
        //两个结果需要返回
        int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;
        return array;
    }
}
