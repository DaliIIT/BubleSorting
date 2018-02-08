package com.company;


public abstract class SortingMethods {






    public static void BubleSorting (int[] Arr) {

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
        System.out.println(" Time elapsed, s:" + TimeE);

    }



    public static int[] InitializeArray (int NumElms) {

        int[] Arr = new int[NumElms];

        for (int k = 0; k < Arr.length; k++) {
            Arr[k] = (int) (Math.random()*100);
        }

        return Arr;
    }



    public static void PrintArray (int[] Arr, String ArrayType) {

        System.out.println(ArrayType);

        for (int i = 0; i < Arr.length; i++) {
            System.out.println("№:" + i + " value:" + Arr[i]);
        }

    }


}







