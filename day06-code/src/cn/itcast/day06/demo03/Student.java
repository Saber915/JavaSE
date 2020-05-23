package cn.itcast.day06.demo03;


/*
对于基本数据类型中的boolean值, Getter方法一定要写成isXxx的形式, 而setXxx规则不变.
 */
public class Student {
    private String name;
    private int age;
    private boolean male;   //是否男性

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if (age < 100 && age > 0){
            this.age = age;
        }else{
            System.out.println("数据异常");
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setMale(boolean b){
        this.male = b;
    }

    public boolean isMale(){
        return this.male;
    }

}
