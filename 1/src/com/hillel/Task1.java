
// ����� ����������� �� 3� �����

package com.hillel;

import java.util.Scanner;

public class Task1 {
  public static void main(String... args){
	
      Scanner scanner=new Scanner(System.in);

      System.out.print("������� ������ �����: ");
      int a = scanner.nextInt();
		
      System.out.print("������� ������ �����: ");
      int b = scanner.nextInt();

      System.out.print("������� ������ �����: ");
      int c = scanner.nextInt();

      int min = a;
      if(b<=a && b<=c) min = b;
      else if(c<=a && c<=b) min = c;
      
      System.out.println("����������� �� ��� - ��� ����� " + min);
  }
}