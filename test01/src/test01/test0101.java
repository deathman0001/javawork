package test01;

import java.io.PipedInputStream;

public class test0101 {

    public static void main(String[] args) {
        System.out.print("A");
        test0102 test01_01_02 = new test0102();
        System.out.println(test01_01_02.A);
        
        int a = test01_01_02.AA(5, 8);
        System.out.println(a);
        
    }
}

