package com.learnjava;

public class learn_Integer_int
{

    public static void main(String[] args)
    {
        //Integer 的缓冲区范围为 -128到127
        int i = 128;
        Integer i2=128;//autoboxing: java会主动调用Integer.valueOf(128)
        System.out.println(i==i2);//true;java规定当包装类和基本类对比时，
                                  // autounboxing:i2.intValue()==i 即对比的堆栈的真实值

        Integer i3=127;//调用的Integer 缓冲区的实例
        Integer i4=new Integer(127);//自己在堆栈存储新建实例的地址
        System.out.println(i3==i4);//false;

        Integer i5=200;//autoboxing
        Integer i6=200;
        System.out.println(i5==i6);//false 相当于建新实例了，指向的地址当然不同
        System.out.println(i5.equals(i6));//ture 地址不同，但这次比较的是value相同


        Integer i7=100;
        Integer i8=100;
        System.out.println(i7==i8);//true;因为在缓冲区范围内，直接调用的缓冲区实例相同


    }

}
