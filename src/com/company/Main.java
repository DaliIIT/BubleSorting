package com.company;

import java.lang.reflect.Array;


public class Main {

    public static void main(String[] args) {

        int[] Arr = new int[]{2, 1, 3, 23, 12, 56, 1, 4, 8, 9, 11, 10, 4};
        int i,j,k;

        System.out.println("Unsorted elements:");

        for (k = 0; k < Arr.length; k++) {
            System.out.println("№: " + k + " value:" + Arr[k]);
        }


            for (i = 0; i < Arr.length; i++) {

                for (j = 0; j < Arr.length - i -1; j++) {


                    if (Arr[j] > Arr[j + 1]) {
                        int Temp = Arr[j + 1];
                        Arr[j + 1] = Arr[j];
                        Arr[j] = Temp;

                    } else {


                    }
                    ;
                }
            }

        System.out.println("Sorted elements:");


        for (k = 0; k < Arr.length; k++) {
            System.out.println("№: " + k + " value:" + Arr[k]);
        }


    }
}