package org.example;

import org.junit.jupiter.api.Test;

import static org.example.FirstTest.addition;
import static org.example.FirstTest.is_even;
import static org.junit.jupiter.api.Assertions.*;

class FirstTestTest{
    @Test
    public void addTest_when8and8thenreturn16() {
        //Given
        int a = 8;
        int b = 8;

        //When
        int result = addition(a,b);

        //Then
        assertEquals(16, result);
    }
    @Test
    public void is_evenTest_when5thenreturnfalse(){
        //Given
        int a = 5;

        //When
        boolean result = is_even(a);

        //Then
        assertFalse(result);

    }
    @Test
    public void is_evenTest_when2thenreturntrue(){
        //Given
        int a = 2;

        //When
        boolean result = is_even(a);

        //Then
        assertTrue(result);

    }


}