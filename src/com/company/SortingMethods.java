package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class SortingMethods {


    public static int[] BucketSorting (int[] a, int maxVal) {

        long StartDate = System.currentTimeMillis();


            int [] bucket=new int[maxVal+1];

            for (int i=0; i<bucket.length; i++) {
                bucket[i]=0;
            }

            for (int i=0; i<a.length; i++) {
                bucket[a[i]]++;
            }

            int outPos=0;
            for (int i=0; i<bucket.length; i++) {
                for (int j=0; j<bucket[i]; j++) {
                    a[outPos++]=i;
                }
            }

        long EndDate = System.currentTimeMillis();
        long TimeE = (EndDate - StartDate)/1000;
        System.out.println(" Bucket sorting. Time elapsed, s:" + TimeE);


        return a;

    }










    public static int[] BubleSorting (int[] Arr) {

        long StartDate = System.currentTimeMillis();

        for (int i = 0; i < Arr.length; i++) {
//                Boolean Swapped = false;
            for (int j = 0; j < Arr.length - i -1; j++) {

                if (Arr[j] > Arr[j + 1]) {
                    int Temp = Arr[j + 1];
                    Arr[j + 1] = Arr[j];
                    Arr[j] = Temp;

//                        Swapped = true;
                };
            }

//                if (Swapped = false) {
//                    break;
//                };

        }

        long EndDate = System.currentTimeMillis();
        long TimeE = (EndDate - StartDate)/1000;
        System.out.println(" Buble sorting. Time elapsed, s:" + TimeE);

        return Arr;

    }









    public static int[] InitializeArray (int NumElms, int MaxValue) {

        int[] Arr = new int[NumElms];

        for (int k = 0; k < Arr.length; k++) {
            Arr[k] = (int) (Math.random()*MaxValue);
        }

        return Arr;
    }



    public static void PrintArray (int[] Arr, String ArrayType) {

        System.out.println(ArrayType + Arrays.toString(Arr) );

//        for (int i = 0; i < Arr.length; i++) {
//            System.out.println("№:" + i + " value:" + Arr[i]);
//        }

    }


}







