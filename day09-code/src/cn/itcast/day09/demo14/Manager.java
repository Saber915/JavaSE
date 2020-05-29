package cn.itcast.day09.demo14;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, double balance) {
        super(name, balance);
    }

    public ArrayList<Double> send(double money, int count){
        ArrayList<Double> list = new ArrayList<>();
        double balance = this.getBalance();
        if (balance >= money){
            double moneyPer = money/count;
            this.setBalance(balance - money);
            for (int i = 0; i < count; i++) {
                list.add(moneyPer);
            }
        }
        return list;

    }


}
