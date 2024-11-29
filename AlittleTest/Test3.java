package com.anqian.AlittleTest;

import java.io.FileInputStream;
import java.io.InputStream;

public class Test3 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream(("src/com/anqian/AlittleTest/abab.txt"));
//        int b1=is.read();
//        System.out.println((char)b1);
//
//        int b2=is.read();
//        System.out.println((char)b2);
//
//        int b3=is.read();
//        System.out.println(b3);
//
//        int b4=is.read();
//        System.out.println(b4);
//
//

        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }
        is.close();
    }
}
