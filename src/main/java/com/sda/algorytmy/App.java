package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszy wyraz ciagu :");
        int a1= scanner.nextInt();
        System.out.println("podaj staly przyrost :");
        int d= scanner.nextInt();
        System.out.println("podaj wyraz ciagu jaki chcesz poznac  :");
        int n = scanner.nextInt();

        System.out.println(a1+(n-1)*d);

    }
}
