package com.loper.ben.tests;

import com.loper.ben.katas.SquareSumKata;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareSumKataTests {

    private SquareSumKata kata;

    @Before
    public void setup(){
        kata = new SquareSumKata();
    }

    @Test
    public void testBasic()
    {
        assertEquals(9, kata.squareSum(new int[] {1,2,2}));
        assertEquals(5, kata.squareSum(new int[] {1,2}));
        assertEquals(50, kata.squareSum(new int[] {5,-3,4}));
    }
}
