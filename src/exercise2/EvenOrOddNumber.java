package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {

  public static void main(String[] args) {
  System.out.println("Please enter a number: ");
  Scanner input = new Scanner(System.in);
  int number = input.nextInt();

  if(number % 2 == 0) {
    System.out.println("Number is even.");
  } else {
    System.out.println("Number is odd.");
  }
  }

  }
