package com.stackroute.basics;

import java.util.Scanner;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //call the functions in the required sequence
        new PhoneNumberValidator().getInput();
    }

    public String getInput() {

        String str = sc.next();
        int result = validatePhoneNumber(str);
        displayResult(result);
        closeScanner();
        return null;
    }

    public void displayResult(int result) {
        if(result==1){
            System.out.println("Valid");
        }
        else if(result==-1){
            System.out.println("Empty string");
        }
        else{
            System.out.println("Invalid");
        }

    }

    public int validatePhoneNumber(String input) {
        if(input == null || input.isEmpty()){
            return -1;
        }
        else if(input.length()==12 && input.matches("[0-9]{2,3}-[0-9]{2,3}-[0-9]{5}") ){
            return 1;
        }
        return 0;
    }


    public void closeScanner(){
        sc.close();
    }
}
