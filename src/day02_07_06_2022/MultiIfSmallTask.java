package day02_07_06_2022;

public class MultiIfSmallTask {

    public static void main(String[] args) {

        int number=10;

        /*
        number smaller than 1 print invalid
        number between 1 and 3 print good
        number between 4 and 8 print better
        more than 8 print best

         */

        if (number>=8){
            System.out.println("best");
        }

        if (number>=4 && number<=8){
            System.out.println("better");
        }



        if (number>=8) {
            System.out.println("best");
        }
        else if (number>=4) {
            System.out.println("better");
        }else if(number>=1){
            System.out.println("good");
        }else {
            System.out.println("invalid");
        }


    }

}
