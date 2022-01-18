package com.learnjava.javaio;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;

public class iodemo
{
    public static void read_file_byte(String path)
    {

        try {
            InputStream filein=new FileInputStream(path);
            int i;
            while(true)
            {
                    i=filein.read();
                    if(i==-1)break;
                    System.out.println(i);
            }
            filein.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void write_file_byte(String write_path) throws Exception
    {
        OutputStream out=new FileOutputStream(write_path);
        String str="吴祀霖";
        byte [] bytes=str.getBytes();
        System.out.println("待写入字节数："+bytes.length);
        for(byte b:bytes)
        {
            out.write(b);
        }
        out.close();

    }
    public static void Buffered_Reader(String path)
    {
        try{
            BufferedReader br=new BufferedReader(new FileReader(path));
            String str;
            while((str=br.readLine())!=null)
            {
                System.out.println(str);
            }
            br.close();

        }
        catch(Exception e)
        {

        }
    }
    public static void main(String[] strings)
    {
        String picpath="src/com/learnjava/javaio/pic.jpg";
        String textpath="src/com/learnjava/javaio/text.txt";


        //iodemo.read_file_byte(textpath);

        //因为wirtefilebyte方法throws Exception表示该方法不处理异常，而是将异常留待上层调用处理，即该处，故需要用try catch
        try
        {
            iodemo.write_file_byte("src/com/learnjava/javaio/writeresult.txt");
        }
        catch (Exception e)
        {

        }

       //bufferedreader读字符流
        iodemo.Buffered_Reader(textpath);






    }

}
