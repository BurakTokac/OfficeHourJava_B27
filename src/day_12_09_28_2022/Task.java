package day_12_09_28_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task {

    /*
Count words
    String str ="I am learning learning java java java programming";    //get & read individual word

    Output - I-1 am-1 learning-2 java-3 programming-1


 */
    public static void main(String[] args) {
        String str = "I am learning learning java java java programming";

        String result = findFrequencyOfWord(str);


    }

    private static String findFrequencyOfWord(String str) {
        String[] words = str.split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(words));

        String temp="";


        for (String word : list) {
            if (!temp.contains(word))
            temp+=word+"-"+ Collections.frequency(list,word) +" ";
        }

        System.out.println(temp);


       // System.out.println(list);

        return null;
    }
}
