package com.company;

import java.lang.reflect.Array;


public class Main {

    public static void main(String[] args) {

        int[] Arr = new int[]{2, 1, 3};

        for (int k = 0; k < Arr.length; k++) {
            System.out.println("Number: " + k + " value:" + Arr[k]);
        }


        for (int i = 0; i < Arr.length; i++) {

            for (int j = 0; j < Arr.length - i; j++) {


                if (Arr[j] > Arr[j + 1]) {
                    int Temp = Arr[j + 1];
                    Arr[j + 1] = Arr[j];
                    Arr[j] = Temp;

                } else {


                }

            }

        }


//        for (int k: Arr) {
//            System.out.println(Arr[k]);
//        }


        for (int k = 0; k < Arr.length; k++) {
            System.out.println("Number: " + k + " value:" + Arr[k]);
        }


    }
}