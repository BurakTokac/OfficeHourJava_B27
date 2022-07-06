package day02_07_06_2022;

public class CodilityTask {
    public static void main(String[] args) {
        /*
         Task : 	 Write a function:
				    		 that, given a positive integer N  However, any number divisible by 2, 3 or 5 shouldbe replaced by the word

				    			Codility -- 2
				    			Test     -- 3
				    			Coders   -- 5

				    			- If a number is divisible by more than one of the numbers:2,3 or 5, it should be
				    			replaced by a concatenation of the respective words Codility,
				    			Test and Coders in this given order.

				    			EXPECTED

				    						 numbers divisible by both 2 and 3 should be replacée by CodilityTest
				    						 INPUT : 6    OUTPUT :  CodilityTest

				    			 			 numbers divisible by allthree numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
				    			 			 INPUT : 15    OUTPUT :  CodilityTestCoders


				    			 			 Codility -- 2
				    			Test     -- 3
				    			Coders   -- 5


         */


        int number=6;

        String result="";

        if (number%2==0){
            result=result+"Codility"; // +=  short cut of result=result+ == result+=
        }

        if (number%3==0){
                   //Codility
            result=result+"Test";
        }

        if (number%5==0){
            result=result+"Coders";
        }

        System.out.println(result);


    }
}
