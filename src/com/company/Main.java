package com.company;

import java.lang.reflect.Array;
import java.sql.Time;
import java.time.LocalDateTime;

import static java.lang.Math.random;


public class Main {

    public static void main(String[] args) {

        int[] Arr = new int[100000];
        int i,j,k;

        for (k = 0; k < Arr.length; k++) {
            Arr[k] = (int) (Math.random()*100000);
        }


        System.out.println("Unsorted elements:");

        for (k = 0; k < Arr.length; k++) {
            System.out.println("№:" + k + " value:" + Arr[k]);
        }


        long StartDate = System.currentTimeMillis();


            for (i = 0; i < Arr.length; i++) {

//                Boolean Swapped = false;
                for (j = 0; j < Arr.length - i -1; j++) {


                    if (Arr[j] > Arr[j + 1]) {
                        int Temp = Arr[j + 1];
                        Arr[j + 1] = Arr[j];
                        Arr[j] = Temp;

//                        Swapped = true;
                    };
                }

//                if (Swapped = false) {
//
//                    break;
//                };
            }


         long EndDate = System.currentTimeMillis();


        System.out.println("Sorted elements:");


        for (k = 0; k < Arr.length; k++) {
            System.out.println("№: " + k + " value:" + Arr[k]);
        }



        long Time = (EndDate - StartDate)/1000;

        System.out.println(" Time elapsed, s:" + Time);


    }
}