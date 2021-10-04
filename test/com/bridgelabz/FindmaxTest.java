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

}