package com.company;

public class Main {

    public static void main(String[] args) {

        int NumElms = 100000;
        int MaxVal = 1000;
        int[] InitialArr = new int[NumElms];
        int[] Arr1 = new int[NumElms];
        int[] Arr2 = new int[NumElms];

        InitialArr = SortingMethods.InitializeArray(NumElms,MaxVal);



        SortingMethods.PrintArray(InitialArr,"Unsorted elements:");
        Arr1 = SortingMethods.BubleSorting(InitialArr);
        SortingMethods.PrintArray(Arr1,"Sorted elements. Buble sorting:");

        int MaxValue = 1000;
        Arr2 = SortingMethods.BucketSorting(InitialArr, MaxValue);
        SortingMethods.PrintArray(Arr2,"Sorted elements.Bucket sorting:");

    }
}