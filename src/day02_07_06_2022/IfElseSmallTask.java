package day02_07_06_2022;

public class IfElseSmallTask {
    public static void main(String[] args) {
/*
4- Create  program to check whether a character is an alphabet or not
							An input character is an alphabet if it lies in between a-z or A-Z.

							INPUT : '.'			EXPECTED : Your letter is not in alphabet

 							INPUT : 'a'			EXPECTED : Your letter is in alphabet
 */

        char input = 'A';

        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
            System.out.println("Your input is in alphabet");
        } else {
            System.out.println("Your input is not in alphabet");
        }


    }
}
