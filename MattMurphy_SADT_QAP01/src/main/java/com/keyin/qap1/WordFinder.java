/*
 * Title: SADT QAP01
 * Author: Matt Murphy
 * Date: 10/1/2022
 */

package com.keyin.qap1;

public class WordFinder {

    public Boolean FindWord(String word2Find, String sentence){
        String sentence01 = sentence.toLowerCase();
        if (sentence01.contains(word2Find) == true){
             return true;
         } else {
             return false;
         }

    }



}
