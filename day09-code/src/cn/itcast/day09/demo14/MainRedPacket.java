package cn.itcast.day09.demo14;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("Saber", 1000);

        Member member1 = new Member("saber", 0);
        Member member2 = new Member("saber", 0);
        Member member3 = new Member("saber", 0);
        Member member4 = new Member("saber", 0);
        Member member5 = new Member("saber", 0);

        printMember(manager, member1, member2, member3, member4, member5);

        ArrayList<Double> send = manager.send(100, 4);
        member1.recive(send);
        member2.recive(send);
        member3.recive(send);
        member4.recive(send);
        member5.recive(send);

        printMember(manager, member1, member2, member3, member4, member5);

    }

    private static void printMember(Manager manager, Member member1, Member member2, Member member3, Member member4, Member member5) {
        System.out.println("-------------");
        System.out.println(manager);
        System.out.println(member1);
        System.out.println(member2);
        System.out.println(member3);
        System.out.println(member4);
        System.out.println(member5);
    }
}
