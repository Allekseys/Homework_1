
// Найти минимальное из 3х чисел

package com.hillel;

import java.util.Scanner;

public class Task1 {
  public static void main(String... args){
	
      Scanner scanner=new Scanner(System.in);

      System.out.print("Введите первое число: ");
      int a = scanner.nextInt();
		
      System.out.print("Введите второе число: ");
      int b = scanner.nextInt();

      System.out.print("Введите третье число: ");
      int c = scanner.nextInt();

      int min = a;
      if(b<=a && b<=c) min = b;
      else if(c<=a && c<=b) min = c;
      
      System.out.println("Минимальное из них - это число " + min);
  }
}