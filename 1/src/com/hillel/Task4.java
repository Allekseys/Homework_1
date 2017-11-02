
// Даны 2 числа, определить делится ли первое число на второе без остатка

package com.hillel;

import java.util.Scanner;

public class Task4 {
  public static void main(String... args){
	
      Scanner scanner=new Scanner(System.in);

      System.out.print("Введите первое число: ");
      int a = scanner.nextInt();
      
      System.out.print("Введите второе число: ");
      int b = scanner.nextInt();

      if(b == 0) System.out.println("Деление на ноль уголовно наказуемо.");
      else if(a % b == 0) System.out.println("Число " + a + " делится на число " + b + " без остатка.");
      else System.out.println("Число " + a + " не делится на число " + b + " без остатка.");

  }
}