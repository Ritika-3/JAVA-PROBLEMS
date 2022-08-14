package com.stackroute.strings;
import java.util.Arrays;

public class Anagram {
    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {
        // IF STRINGS ARE EMPTY
        if(phraseOne.isEmpty() || phraseTwo.isEmpty()){
            return "Give proper input not empty phrases";
        }

        //IF STRING LENGTH IS EQUAL
        else if(phraseOne.length()==phraseTwo.length()){
            char[] phrase1 = phraseOne.toCharArray();
            char[] phrase2 = phraseTwo.toCharArray();

            Arrays.sort(phrase1);
            Arrays.sort(phrase2);

            for(int i=0;i<phraseOne.length();i++)
            {
                if(phrase1[i]!=phrase2[i]){
                    return "Given phrases are not anagrams";
                }
            }
            return "Given phrases are anagrams";
        }
        //IF LENGTH IS NOT EQUAL
        return "Given phrases are not anagrams";
    }
}
