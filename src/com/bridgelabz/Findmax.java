package com.bridgelabz;

import static java.util.Collections.max;

public class Findmax
{
    public static <T extends Comparable<T>> T max(T x,T y,T z)
    {
        return max(max(x,y),z);
    }

    private static <T extends Comparable<T>> T max(T x, T y)
    {
        if (x.compareTo(y)>0)
        {
            return x;

        }
        return y;
    }
    public static <T extends Comparable<T>> T max(T ... ele)
    {
        T max=null;
        for (T value:ele)
        {
            if (max==null)
            {
                max=value;
            }
            if (value.compareTo(max)>0)
            {
                max=value;
            }
        }
        return max;
    }
}
