package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
    private static Scanner scan;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
        //firstValue,secondValue,operator
        do{
            int first= scan.nextInt();
            int second= scan.nextInt();
            int operation= scan.nextInt();

            System.out.println(calculate(first,second,operation));
            System.out.println("Do you want to try again(y/n)");
            char c = scan.next().trim().charAt(0);

            if(c=='n') {
                break;
            }
        }while(true);
    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {

            String answer;
            switch(operator){
                case 1: {
                    answer = Integer.toString(firstValue) + " + " + Integer.toString(secondValue) + " = " + (firstValue + secondValue);
                    break;
                }
                case 2: {
                    answer = Integer.toString(firstValue) + " - " + Integer.toString(secondValue) + " = " + (firstValue - secondValue);
                    break;
                }
                case 3: {
                    answer = Integer.toString(firstValue) + " * " + Integer.toString(secondValue) + " = " + (firstValue * secondValue);
                    break;
                }
                case 4: {
                    if (secondValue == 0)
                    {
                        answer = "The divider (secondValue) cannot be zero";
                        break;
                    }
                    answer = Integer.toString(firstValue) + " / " + Integer.toString(secondValue) + " = " + (firstValue / secondValue);
                    break;
                }
                default:
                    answer = "Entered wrong option "+operator;
            }

        return answer;
    }
}
