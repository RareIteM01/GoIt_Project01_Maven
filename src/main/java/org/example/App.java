package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        System.out.println( "Hello World!" );
        simpleMultiply(12, 56);
    }

    public static int simpleMultiply (int a, int b) {
        System.out.println("First number is " + a + " second number is " + b);
        return a + b;
    }
}
