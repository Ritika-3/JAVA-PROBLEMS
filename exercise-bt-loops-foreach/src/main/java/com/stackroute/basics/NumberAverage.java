package com.stackroute.basics;
import java.util.Scanner;


public class NumberAverage {

    public static void main(String[] args) {
        new NumberAverage().getArrayValues();
    }

    //get the values of the array from the user
    public void getArrayValues() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        System.out.println(findAverage(array));
    }

    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {
        int sum=0;
        if(inputArray.length==0) return "Empty array";
        for (int x:inputArray) {
            if(x<0) return "Give proper positive integer values";
            sum+=x;
        }

        return "The average value is: "+(sum/inputArray.length);
    }
}
