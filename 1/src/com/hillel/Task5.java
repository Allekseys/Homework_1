
// Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11

package com.hillel;

import java.util.Scanner;

public class Task5 {
  public static void main(String... args){

      Scanner scanner=new Scanner(System.in);

      System.out.print("Введите первое число: ");
      int a = scanner.nextInt();
      
      System.out.print("Введите второе число: ");
      int b = scanner.nextInt();
      
      if(Math.abs(10-a) == Math.abs(10-b)) System.out.println("Эти числа одинаково близки к десяти.");
      else if(Math.abs(10-a) < Math.abs(10-b) ) System.out.println("Число " + a + " ближе к десяти, нежели число " + b);
      else System.out.println("Число " + b + " ближе к десяти, нежели число " + a);

  }
}