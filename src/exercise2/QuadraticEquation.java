package exercise2;

import java.lang.Math;
import java.util.Scanner;

public class QuadraticEquation {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the values of a, b and c");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt(); 

    if(a != 0) {
    int D = ((b * b) - 4 * a * c);
      if(D >= 0) {
        double x1 = (-b + Math.sqrt(D)) / (2 * a);
        double x2 = (-b - Math.sqrt(D)) / (2 * a);
        System.out.println(x1 + ", " + x2);
      } else {
        System.out.println("Imaginary values");
      }
    } else {
      if(b != 0) {
      int x = ((0 - c) / b);
      System.out.println(x);
      } else if(c != 0){
      System.out.println("No values");
      } else {
        System.out.println("Many values");
      }
    }
  }
}