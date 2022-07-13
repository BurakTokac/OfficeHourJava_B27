package day03_07_13_2022;

public class StringIntro {
    public static void main(String[] args) {
        String str1="Cydeo";
        String str2="Cydeo";

        String str3=new String("Cydeo");
        String str4=new String("Cydeo");

        // == for String pool
        // equals() or equalIgnoreCase()

        System.out.println(str1==str2); //T
        System.out.println(str1==str3); //F
        System.out.println(str3==str4); //F

        System.out.println(str1.equals(str3)); //T
        System.out.println(str3.equals(str4)); //T
        System.out.println(str1.equals(str2)); //T





    }
}
