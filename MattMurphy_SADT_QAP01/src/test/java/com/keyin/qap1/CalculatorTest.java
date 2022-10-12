/*
 * Title: SADT QAP01
 * Author: Matt Murphy
 * Date: 10/1/2022
 * GitHub Repo: https://github.com/Mattmurphy97/MattMurphy_SADT_QAP01.git
 */

package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void plusTest01(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(5, calculator.add01(2, 3));
    }

    @Test
    public void plusTest02(){
        Calculator calculator = new Calculator();
        Assertions.assertTrue(calculator.add02(1, 1));
    }

    @Test
    public void minusTest01(){
        Calculator calculator = new Calculator();
        Assertions.assertNotEquals(11, calculator.sub(8, 3));
    }

    @Test
    public void timesTest01(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(25, calculator.multiple(5, 5));
    }

    @Test
    public void divTest01(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(2.7, calculator.div(10, 3.7));
    }

}
