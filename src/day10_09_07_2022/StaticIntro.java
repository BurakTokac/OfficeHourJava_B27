package day10_09_07_2022;

public class StaticIntro {

    public static int num;


    static {
        num=10;

    }

    public StaticIntro() {
        num+=15;
    }

    public  StaticIntro(int add){

        num+=add;
    }

    /*
static block: it is only run one time before everything.
Why we need it ?
- we can initialize the static variables.
     */
}
