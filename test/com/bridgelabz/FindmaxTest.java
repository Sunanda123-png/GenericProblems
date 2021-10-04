package com.bridgelabz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindmaxTest
{
    @Test
    public void TC1()
    {
        int result=Findmax.max(30,20,10);
        assertEquals(30,result);
    }
    @Test
    public void TC2()
    {
        int result=Findmax.max(20,30,10);
        assertEquals(30,result);
    }
    @Test
    public void TC3()
    {
        int result=Findmax.max(20,10,30);
        assertEquals(30,result);
    }
    @Test
    public void floatMaxTC1()
    {
        float result=Findmax.max(5.5f,0.01f, 1.02f);
        assertEquals(5.5f,result,0.0f);
    }
    @Test
    public void floatMaxTC2()
    {
        float result=Findmax.max(0.01f,5.5f, 1.02f);
        assertEquals(5.5f,result,0.0f);
    }
    public void floatMaxTC3()
    {
        {
            float result=Findmax.max(0.01f,1.02f, 5.5f);
            assertEquals(5.5f,result,0.0f);
        }
    }
    
}