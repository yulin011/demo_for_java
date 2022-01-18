package com.learnjava;

import java.util.ArrayList;
import java.util.List;

public class learn_泛型
{
    public static void main(String[] args)
    {
        List<String> a=new ArrayList<>();

        a.add("123");
        a.add("wuwuw");
        //a.add(123);
        System.out.println(a.size());
        System.out.println(a.contains("12"));
        System.out.println(a.contains("123"));



    }
}
