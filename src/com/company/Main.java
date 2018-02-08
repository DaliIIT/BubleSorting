package com.company;

public class Main {

    public static void main(String[] args) {

        int NumElms = 100;
        int[] Arr = new int[NumElms];

        Arr = SortingMethods.InitializeArray(NumElms);

        SortingMethods.PrintArray(Arr,"Unsorted elements:");

        SortingMethods.BubleSorting(Arr);

        SortingMethods.PrintArray(Arr,"Sorted elements:");

    }
}