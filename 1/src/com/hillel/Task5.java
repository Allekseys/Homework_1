
// ����� ��������� � 10 �� 2� �������� �����. ��������, ����� ����� 8 � 11 ��������� � ������ 11

package com.hillel;

import java.util.Scanner;

public class Task5 {
  public static void main(String... args){

      Scanner scanner=new Scanner(System.in);

      System.out.print("������� ������ �����: ");
      int a = scanner.nextInt();
      
      System.out.print("������� ������ �����: ");
      int b = scanner.nextInt();
      
      if(Math.abs(10-a) == Math.abs(10-b)) System.out.println("��� ����� ��������� ������ � ������.");
      else if(Math.abs(10-a) < Math.abs(10-b) ) System.out.println("����� " + a + " ����� � ������, ������ ����� " + b);
      else System.out.println("����� " + b + " ����� � ������, ������ ����� " + a);

  }
}