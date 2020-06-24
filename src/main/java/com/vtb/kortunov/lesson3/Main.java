package com.vtb.kortunov.lesson3;

import com.vtb.kortunov.lesson3.task1.Cat;
import com.vtb.kortunov.lesson3.task1.Person;
import com.vtb.kortunov.lesson3.task1.Robot;
import com.vtb.kortunov.lesson3.task2.Barrier;
import com.vtb.kortunov.lesson3.task2.Member;
import com.vtb.kortunov.lesson3.task2.RunningTrack;
import com.vtb.kortunov.lesson3.task2.Wall;

public class Main {

    public static void main(String[] args) {
        //Task 1
        Cat cat = new Cat();
        Person person = new Person();
        Robot robot = new Robot();

        cat.jump();
        cat.run();

        person.jump();
        person.run();

        robot.jump();
        robot.run();

        //Task 3
        Barrier[] barriers = {new Wall(2), new RunningTrack(3),
                new Wall(8), new RunningTrack(8)};
        Member[] members = {new Member(5, 10), new Member(10, 20)};
        for (Member member : members) {
            if (go(member, barriers)) {
                System.out.println("Преодолел");
            } else {
                System.out.println("Не преодолел");
            }
        }
    }

    //Task 3
    public static boolean go(Member member, Barrier[] barriers) {
        for (Barrier barrier : barriers) {
            if (!barrier.overcome(member)) {
                return false;
            }
        }
        return true;
    }
}
