package com.leetcode;

public class cut_sentence_1816
{
    public String truncateSentence(String s, int k)
    {
        String result="";
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a==' ')
                k--;

            if(k==0)
                break;
            else
                result=result+a;

        }

        return result;

    }
    public static void main(String[] args)
    {


    }
}
