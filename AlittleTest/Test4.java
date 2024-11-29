package com.anqian.AlittleTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test4 {
    public static void main(String[] args) throws IOException {
        InputStream is=new FileInputStream("src/com/anqian/AlittleTest/abab.txt");

//        byte[] b=new byte[3];
//        int len;
//        while ((len=is.read(b))!=-1){
//            String str=new String(b,0,len);
//            System.out.print(str);
//        }
        byte[] bytes=is.readAllBytes();
        String str=new String(bytes);
        System.out.println(str);
        is.close();
    }
}
