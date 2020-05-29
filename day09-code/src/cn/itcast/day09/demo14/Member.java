package cn.itcast.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, double balance) {
        super(name, balance);
    }

    public void recive(ArrayList<Double> list){
        if (list.size() >0){
            int index = new Random().nextInt(list.size());
            Double remove = list.remove(index);
            double balance = this.getBalance();
            this.setBalance(balance + remove);
        }else {
            System.out.println("抢完了. ");
        }

    }

}
