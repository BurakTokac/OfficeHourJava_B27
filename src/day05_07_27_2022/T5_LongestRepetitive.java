package day05_07_27_2022;

public class T5_LongestRepetitive {
    public static void main(String[] args) {
        String word = "abcababcababcab";
        String longestOne = "";
        String temp = ""; //we will put letter one by
        //it is enough for checking till the half of the sentence
        for (int i = 0; i < word.length() / 2; i++) {
            //we will store each char in this variable
            temp += word.charAt(i);
            //we need to use temp as a delimeter and if the array size is zero it means that temp is repetitive and also we need to find the longest one so we we need to compare with the longest word
            String[] split = word.split(temp);
            if (split.length == 0 && longestOne.length() < temp.length()) {
                longestOne = temp;
            }
        }
        System.out.println("longest   " + longestOne);


    }
}
