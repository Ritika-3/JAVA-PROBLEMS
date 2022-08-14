package com.stackroute.basics;
import java.util.Scanner;
public class StringFinder {
    //Create Scanner object as instance variable
    Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        //Get three strings from the user
        new StringFinder().getInput();
    }

    public String getInput() {
        //INPUT STRINGS
        String searchString=sc.nextLine();
        String firstString=sc.nextLine();
        String secondString=sc.nextLine();

        //finding result & displaying
        int result = findString(searchString,firstString,secondString);
        displayResult(result);
        closeScanner();
        return null;
    }

    public void displayResult(int result) {
        //displays the result
        if(result==1){
            System.out.println("Found as expected");
        } else if (result==-1) {
            System.out.println("Empty string or null");
        }
        else{
            System.out.println("Not found");
        }
    }

    public int findString(String searchString,String firstString, String secondString) {
        // if the inputs are empty or null -1
        if(firstString==null || secondString==null || searchString==null || firstString.equals("") || secondString.equals("") || searchString.equals("") ) return -1;
        //if its equal 1
        else if( searchString.contains(firstString+secondString) ||(firstString+secondString).equals(searchString)) return 1;
        //if not found as expected 0
        else return 0;
    }

    public void closeScanner() {
        sc.close();
    }
}


//