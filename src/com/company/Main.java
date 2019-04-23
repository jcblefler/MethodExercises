package com.company;

import java.util.*;

public class Main {


//1.
//  Added two inputs given by the user

//    public static void addValues(int x , int y ){
//        int added = x + y;
//        System.out.println(x + "+" + y + "=" + added);
//    }

//2.
//  Write an application to divide 2 numbers. Prompt the user
//  to enter two numbers. Take the first number and divide it
//  by the second number and print that result to the screen.
//  If the second number is a zero, print "Undefined" to the
//  screen, otherwise just print the result.

//
//  public static void divider(int x, int y){
//        if (y == 0){
//            System.out.println("Undefined");
//        } else {
//            int divided = x / y;
//            System.out.println(x + "+" + y + "=" + divided);
//        }
//
//    }

//3.
// Get 5 letters from the user, output them sorted (Hint:
// Use ArrayList and Collections.sort())

//    public static void sortItems(String x){
//
//        List<Character> wordList = new ArrayList<>();
//
//        for (char ch: x.toCharArray()){
//            wordList.add(ch);
//        }
//        Collections.sort(wordList);
//        System.out.println(wordList);
//    }

//4.
// Get the length of a string.
//
//    public  static void itemLength(String x){
//
//        int  wordLength = x.length();
//
//        System.out.println(x + " has a length of " + wordLength);
//    }


//5.
// Get the average of 3 numbers.
//
//    public  static void averager(int x, int y, int z){
//
//        int average = (x + y + z) / 3;
//        System.out.println("The average of " + x + ", " + y + ", and " + z + " = " + average);
//
//    }


//6.
// Check if a year is a leap year (A leap year is divisible by 4).
//
//    public static void isLeap(int x){
//        int calc = x%4;
//        if (calc == 0){
//            System.out.print(x + " was a leap year");
//        } else {
//            System.out.print(x + " was not a leap year");
//        }
//    }

//7.
// Count all words in the sentence: The dog jumped over the
// fence (use String.split(" ") method).
//
//    public static void wordCounter(String x){
//        int count = 0;
//        String scentence = x;
//        String[] scentenceOfString = scentence.split(" ");
//
//        for (String i : scentenceOfString){
//            count++;
//        }
//        System.out.println("There are " + count + " words in the sentence.");
//    }

//8.
// Calculate the area of a rectangle with length and width input from the user
//
//    public static void calcArea(double x, double y){
//        double area = x * y;
//        System.out.println("The area of the rectangle is " + area);
//    }

//9.
// Print a 5 random numbers given a bound

    public static String rand5(int x){
       Random random = new Random();
       int[] randNum = new int[5];
       for (int i = 0; i < 5; i++){
           randNum[i] = random.nextInt(x+1);

       }
        return "Five random number between 1 and " + x + " are " + randNum[0] + ", " + randNum[1] + ", " + randNum[2] + ", " + randNum[3] + ", and " + randNum[4];
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        1. and 2.
//        System.out.print("Number 1: ");
//        int userInput1 = scanner.nextInt();
//
//        System.out.print("Number 2: ");
//        int userInput2 = scanner.nextInt();


//        1.
//        addValues(userInput1, userInput2);
//        2.
//        divider(userInput1, userInput2);

//        3.
//        System.out.print("Input letters:");
//        String input = scanner.nextLine();
//        sortItems(input);

//        4.
//        System.out.print("Word: ");
//        String word = scanner.nextLine();
//        itemLength(word);



//        5.
//        System.out.print("Number 1: ");
//        int userInput1 = scanner.nextInt();
//
//        System.out.print("Number 2: ");
//        int userInput2 = scanner.nextInt();
//
//        System.out.print("Number 3: ");
//        int userInput3 = scanner.nextInt();
//
//        averager(userInput1, userInput2, userInput3);


//        6.
//        System.out.println("Enter a year to see if it was a leap year.");
//        System.out.print("Year: ");
//
//        int year = scanner.nextInt();
//
//        isLeap(year);

//        7.
//        System.out.println("Type a scentence to see how many words it contains.");
//        System.out.print("Scentence: ");
//        String input = scanner.nextLine();
//
//        wordCounter(input);

//        8.
//        System.out.println("What are the dimensions of the rectangle?");
//        System.out.print("Length: ");
//        double length = scanner.nextDouble();
//        System.out.print("Width: ");
//        double width = scanner.nextDouble();
//
//        calcArea(length, width);

//        9.
        System.out.print("Display five random numbers between 1 and ");
        int max = scanner.nextInt();

        System.out.print(rand5(max));



    }
}
