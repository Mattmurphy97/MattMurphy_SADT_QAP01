/*
 * Title: SADT QAP01
 * Author: Matt Murphy
 * Date: 10/1/2022
 */

package com.keyin.qap1;

public class Calculator {
    public int add01(int num1, int num2) {
        return num1 + num2;
    }

    public boolean add02(int num1, int num2) {
        int answer = num1 + num2;
        if (answer == num1 + num2) {
            return true;
        } else {
            return false;
        }
    }
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int multiple(int num1, int num2){
        return num1 * num2;
    }

    public double div(double num1, double num2){
        double result = num1 / num2;
        double roundOff = Math.round(result * 100.0) / 100.0;
        return roundOff;
    }


}



