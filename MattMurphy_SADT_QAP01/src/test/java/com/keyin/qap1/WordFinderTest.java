/*
 * Title: SADT QAP01
 * Author: Matt Murphy
 * Date: 10/1/2022
 */

package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordFinderTest {

    @Test
    public void FindWordInSentence01(){
        WordFinder FindWord01 = new WordFinder();
        Assertions.assertTrue(FindWord01.FindWord("hello", "Hello Me!"));

    };

    @Test
    public void FindWordInSentence02(){
        WordFinder FindWord01 = new WordFinder();
        Assertions.assertFalse(FindWord01.FindWord("helloo", "Hello Me!"));

    };


}
