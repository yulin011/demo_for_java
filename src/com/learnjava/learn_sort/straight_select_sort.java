package com.learnjava.learn_sort;

public class straight_select_sort
{
    int before_sort[];
    int after_sort[];
    straight_select_sort(int a[])
    {
        before_sort=a;
        after_sort=new int[a.length];
        System.out.println("init_before_finished");

    }
    public int[] sort()
    {
        int len=before_sort.length;

        for(int i=0;i<len;i++ )
        {
            after_sort[i]=before_sort[i];
        }
        int min;
        int temp;
        boolean isswap;
        for(int i=0;i<len;i++)
        {
            min=after_sort[i];
            temp=i;
            isswap=false;
            for(int j=i+1;j<len;j++)
            {
                if(min>after_sort[j])
                {
                    min=after_sort[j];
                    temp=j;
                    isswap=true;
                }
            }
            if(isswap)
            {
                swap(after_sort,i,temp);
            }
        }
        return after_sort;
    }


    public void swap(int arr[],int a,int b)//交换arr数组中的a和b两位置
    {
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


    public static void main(String[] args)
    {
        int arr[]=new int[]{8,50,12,6,91,3,10,20,20,7};
        straight_select_sort sss=new straight_select_sort(arr);
        System.out.println(sss.sort());
        for(int a:sss.sort())
            System.out.print(a+" ");

    }


}
