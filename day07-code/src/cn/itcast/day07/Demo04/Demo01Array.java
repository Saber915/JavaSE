package cn.itcast.day07.Demo04;

/**
 * 定义一个数组, 用来存储3个person对象.
 */
public class Demo01Array {

    public static void main(String[] args) {

        //首先创建一个长度为3的数字, 里面用来存放Person类型的对象.
        Person[] array = new Person[3];
        array[0] = new Person("Saber", 18);
        array[1] = new Person("Archer", 20);
        array[2] = new Person("Lancer", 19);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);


        Person person = array[1];
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }

}
