package com.learnjava;

public class String_StringBuffer_StringBuilder {
    public static void main(String[] args)
    {


        String a="12345";
        //System.out.printf("%d,%c",a.length(),a.charAt(2));

        StringBuffer  con=new StringBuffer(a);
        con.append(" 6789");//不会产生大量中间对象，且线程安全，但就较慢
        a=con.toString();
        System.out.println(a);

        StringBuilder sbuilder=new StringBuilder(con);
        sbuilder.append(" 101112");//应对Stringbuffer较慢的问题，但线程不安全
        a=sbuilder.toString();
        System.out.println(a);




    }
}
