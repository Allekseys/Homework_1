
// ���� 2 �����, ���������� ������� �� ������ ����� �� ������ ��� �������

package com.hillel;

import java.util.Scanner;

public class Task4 {
  public static void main(String... args){
	
      Scanner scanner=new Scanner(System.in);

      System.out.print("������� ������ �����: ");
      int a = scanner.nextInt();
      
      System.out.print("������� ������ �����: ");
      int b = scanner.nextInt();

      if(b == 0) System.out.println("������� �� ���� �������� ���������.");
      else if(a % b == 0) System.out.println("����� " + a + " ������� �� ����� " + b + " ��� �������.");
      else System.out.println("����� " + a + " �� ������� �� ����� " + b + " ��� �������.");

  }
}