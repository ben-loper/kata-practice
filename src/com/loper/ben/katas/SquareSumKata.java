package com.loper.ben.katas;

public class SquareSumKata {


    public int squareSum(int[] ints) {
        int result = 0;

        for(int num : ints) {
            result += num * num;
        }

        return result;
    }
}
