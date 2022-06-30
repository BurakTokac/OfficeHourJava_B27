package day01_06_30_2022;

public class TemperatureConverter {
    /*
    1. Create class named "TemperatureConverter" and make a main method

						- Write a Java program to convert temperature from Fahrenheit to Celsius degree
						- Input a degree in Fahrenheit: 212

							Formula : 		C = (5(F-32))/9

							Expected Output:
							212.0 degree Fahrenheit is equal to 100.0 in Celsius

     */

    public static void main(String[] args) {
        int fahrenheit=212;
        double celcius=  (5*(fahrenheit-32))/9;            //we can get decimal so we choose double
        System.out.println("celcius = " + celcius);
        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println(fahrenheit+ " fahrenheit is equal to " + celcius + " celcius.");


    }

}
