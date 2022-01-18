package com.learnjava;

public class learn_java_function_parameter
{
    private int[] 参数问题(int[]num,int target)
    {
        int[]aaa= {};
        int bbb[]={1,2,5};
        bbb=num;
        System.out.println(num.hashCode());
        System.out.println(aaa.hashCode());
        System.out.println(bbb.hashCode());
        num[target]=333;
        return num;


    }
    public static void main(String[] args)
    {
        learn_java_function_parameter demo=new learn_java_function_parameter();
        int []sample={1,2,3};
        int[]a=demo.参数问题(sample,2);
        System.out.println(sample[2]);
        System.out.println(a[2]);
        System.out.println((sample.hashCode()));

    }
}
