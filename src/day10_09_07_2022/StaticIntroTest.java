package day10_09_07_2022;

import static day10_09_07_2022.StaticIntro.num;

public class StaticIntroTest {

    public static void main(String[] args) {
        System.out.println("StaticIntro.num = " + num); // we will not see 0 because static bblock is working before everthing



        StaticIntro staticIntro1=new StaticIntro(60);
        System.out.println("num = " + num);


        StaticIntro staticIntro=new StaticIntro();
        System.out.println("num = " + num); //num=?

    }
}
