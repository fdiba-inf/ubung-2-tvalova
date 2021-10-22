package exercise2;

import java.util.Scanner;

public class SumOfDigits {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    int number = input.nextInt();
    int a = (number % 10);
    number = number / 10;
    int b = (number % 10);
    number = number / 10;
    int c = (number % 10);

    System.out.println(a + b +c);
  }
}