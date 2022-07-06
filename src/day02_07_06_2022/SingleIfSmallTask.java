package day02_07_06_2022;

import java.util.Scanner;

public class SingleIfSmallTask {

    public static void main(String[] args) {
        //4-Write an if statement that prints "Ideal Temp" if the temp is between 70 and 80

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter temp");

        int temp = scanner.nextInt();



        if (temp >= 70 && temp <= 80) {
            System.out.println("Ideal Temp");
            System.out.println(temp);
        }
        else {
            System.out.println(" Not Ideal Temp");
        }

/*

     //   after if statement if you use one statement you don't need to use {}

        if (temp >= 70 && temp <= 80)
            System.out.println("Ideal Temp");


 */


    }
}
