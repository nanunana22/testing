package org.example;

import org.junit.jupiter.api.Test;

import static org.example.FirstTest.*;
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
    @Test
    public void multiplicationTest_when3and3thenreturn9() {
        //Given
        int a = 3;
        int b = 3;

        //When
        int result = multiplication(a,b);

        //Then
        assertEquals(9,result);
    }

    @Test
    public void toUpperCaseTest_whenhellothenreturnHELLO() {
        //Given
        String a = "hello";

        //When
        String result = toUpperCase(a);

        //Then
        assertEquals("HELLO",result);
    }


}