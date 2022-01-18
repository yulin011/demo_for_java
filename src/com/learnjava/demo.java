package com.learnjava;

import javax.lang.model.element.Element;
import java.util.*;


public class demo
{

    int [] a;
    demo()
    {
       this.a=new int[10];


    }
    public void overload1(String a,char b)
    {

    }

    public boolean Find(int target,int [][] array)
    {
        int num_hang=array.length;
        int num_lie=array[0].length;

        int index_hang=num_hang-1;
        int index_lie=0;
        while(true)
        {
            if(index_hang<0||index_lie>=num_lie)
                break;
            int cur=array[index_hang][index_lie];
            if(cur==target)
                return true;
            else
            {
                if(target>cur)
                    index_lie=index_lie+1;
                if(target<cur)
                    index_hang=index_hang-1;
            }
        }




        return false;



    }
    public void overload1(String a,char b,int c)
    {

    }
    public static void main(String[] args)
    {

        Map map=new HashMap();
        map.put("mytest1",123);
        map.put("mytest2",123);

        System.out.println(map.get("mytest1"));
        System.out.println(map.entrySet());




    }


}

class test
{
    int i=0;
    test(int a)
    {

        this.i=a;
    }
    test()
    {
    }

}
