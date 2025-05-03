package com.lzzkill.extradevices;

public class utils
{
    public static int pow(int a, int b)
    {
        if(b == 1) return a;
        else return a * pow(a, b - 1);
    }
}
