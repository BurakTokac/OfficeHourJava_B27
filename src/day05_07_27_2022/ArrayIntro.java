package day05_07_27_2022;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        String colors = "Yellow Blue Black";
        //0       1       2
        String[] colorArray = {"Yellow", "Blue", "Black"};

        System.out.println("colorArray[0] = " + colorArray[0]);
        System.out.println("colorArray[1] = " + colorArray[1]);
        System.out.println("colorArray[2] = " + colorArray[2]);


        colorArray[1] = "White";
        System.out.println("colorArray[1] = " + colorArray[1]);

        String[] names = new String[5];
        names[0] = "Adam";
        names[1] = "Rabia";
        names[2] = "Nick";
        names[3] = "Busra";
        names[4] = "Sidar";
        // names[5]="Milana";  //we can not do this if  you do this you will get ArrayIndexOutOfBoundsException exception
        System.out.println("names[3] = " + names[3]);

        String[] names2 = new String[10];

        // how to write the elements of array

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        int[] nums1 = {2, 1, 3, 4};

        int[] nums2 = {2, 4, 3, 1};


        //how to compare the arrays

        System.out.println("Arrays.equals(nums1, nums2) = " + Arrays.equals(nums1, nums2));

        Arrays.sort(nums2);

        Arrays.sort(nums1);

        System.out.println("Arrays.equals(nums1, nums2) = " + Arrays.equals(nums1, nums2));

        //01234
        String brand = "Gucci";

        //if you want to split your string into the chars we need to use toCharArray()
        char[] chars = brand.toCharArray();

        System.out.println("chars[3] = " + chars[3]); //c
        System.out.println("chars[4] = " + chars[4]); //i

        //if you want to split your string into the String we need to use split()

        String[] charsString = brand.split("");

        String sentence = "I like playing Football games";
        String[] words = sentence.split(" ");
        String sentence1 = "I-like-playing-Football-games";
        String[] words1 = sentence1.split("-");

        String str = "abcbabcbdbd";
        //a c a c d d

        String[] bs = str.split("b");
        System.out.println("Arrays.toString(bs) = " + Arrays.toString(bs));
        String str1 = "abcdabcdabca";

        //d d a

        String[] abcs = str1.split("abc");

        str.toCharArray();

//assign short cut
        // Mac: option+enter
        //Windows:alt+enter

    }
}
