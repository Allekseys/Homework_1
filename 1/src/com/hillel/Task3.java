
// Написать программу, которая проверит, является ли число четным или нечетным

package com.hillel;

import java.util.Scanner;

public class Task3 {
  public static void main(String... args){
	
      Scanner scanner=new Scanner(System.in);

      System.out.print("Введите ваше число: ");
      int a = scanner.nextInt();
      
      if(a == 0) System.out.println("Число не чётное и не нечётное, это просто ноль. Смиритесь.");
      else if(a % 2 == 0) System.out.println("Число чётное");
      else System.out.println("Число нечётное");

  }
}