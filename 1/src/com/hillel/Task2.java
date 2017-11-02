
// Найти среди 3х чисел максимальное и минимальное

package com.hillel;

import java.util.Scanner;

public class Task2 {
  public static void main(String... args){
	
      Scanner scanner=new Scanner(System.in);

      System.out.print("Введите первое число: ");
      int a = scanner.nextInt();
		
      System.out.print("Введите второе число: ");
      int b = scanner.nextInt();

      System.out.print("Введите третье число: ");
      int c = scanner.nextInt();
      
      int max=a;
      if(b>=a && b>=c) max=b;
      else if(c>=a && c>=b) max=c;
          
      int min = a;
      if(b<=a && b<=c) min = b;
      else if(c<=a && c<=b) min = c;
      
      System.out.println("Максимальное из них - это число " + max);
      System.out.println("Минимальное из них - это число " + min);
  }

}