package day01_06_30_2022;

public class PersonInfo {
    //Task1
    /*
  Create class named "PersonInfo" and make a main method

						    Create variables and give value related to you:

						        - String name
						        - byte age
						        - char gender
						        - boolean student
						        - short number of siblings
						        - long favorite number
						        - int number of seasons in your area
						        - double birth date: (month.day)
						        - int year
						        - String full birthday date with year
						        - String favorite quote
						        - Print the person information with using concat/escape characters

     */

    public static void main(String[] args) {
        /*
        primitive data types:
        - Integer(Numeric): byte,short,int,long
        - Decimal(Floating): float,double
        - Character: char
        - Boolean: boolean
        non-primitive data types:

        String

         */

        String name; //only declaring
        name="Adam2";
        String name1="Adam";
        byte age=35;
        char gender='F';
        boolean isStudent=true; //or we can use false
        short numberOfSiblings=1;
        long myFavouriteNumber=35;
        double birthDate=01.14;
        int year=2022;
        //String full birthday date with year
        String fullBirthDay=birthDate+"."+year;
        System.out.println(fullBirthDay);
        System.out.println("name = " + name);
        System.out.println("name1 = " + name1);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("isStudent = " + isStudent);
        System.out.println("numberOfSiblings = " + numberOfSiblings);
        System.out.println("myFavouriteNumber = " + myFavouriteNumber);
        //  System.out.println(birthDate + year); //wrong

        int num1=1;
        int num2=3;
/*
int +int addition
String+int concat  return String  abc+1 abc1
int +String concat
int+double addition

 */


        int total=num1+num2;
        String result=" "+num1+num2; //13 or 4
                    // 1  //string
                  // 13

        String result2=num1+num2+""; //4

        String result3=""+(num1+num2); //4




        System.out.println("result = " + result);

        System.out.println("\t"); //tab
        System.out.println("\n");
        System.out.println("\"");
        System.out.println("\\");
        int hour=4;
        int min=10;
        int sec=23;

        System.out.println(hour+":"+min+":"+sec);

        System.out.println("2:10:23");




    }

}
