package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
//  *//  public static void main( String[] args )
//    {
//        System.out.println("przyklad 1 ");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("podaj pierwszy wyraz ciagu :");
//        int a1= scanner.nextInt();
//        System.out.println("podaj staly przyrost :");
//        int d= scanner.nextInt();
//        System.out.println("podaj wyraz ciagu jaki chcesz poznac  :");
//        int n = scanner.nextInt();
//
//        System.out.println(a1+(n-1)*d);
//
//    }

    public static void main( String[] args )
    {
        System.out.println("przyklad 2 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("liczba wyrazów ciągu do wygenerowania");
        int n= scanner.nextInt();
        System.out.println("pierwszy wyraz ciągu");
        int a = scanner.nextInt();
        System.out.println("przyrost");
        int d = scanner.nextInt();

        for(int i =2; i<=n ; i++){
            System.out.println(a+(i-1) * d);
        }


    }



}
