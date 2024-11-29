package com.anqian.AlittleTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutPutTest1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("src/com/anqian/AlittleTest/abab.txt");

        os.write("hello我".getBytes());
        os.write("5141131231".getBytes(), 0, 4);
        //os.write('我');
        os.write("\n".getBytes());
        byte[] bytes = "你好".getBytes();
        os.write(bytes);
        os.close();
    }
}
