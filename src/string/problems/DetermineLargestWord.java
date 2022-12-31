package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();

        //implement
        String Word [] = wordGiven.split(" ");
        String[] word = new String[0];
        String maxWord = word[10];
        for (int i =1; i < wordGiven.length(); i++){
            if (word[i].length() > maxWord.length()){
                maxWord = word[i];
            }
        }


        return map;
    }
}
