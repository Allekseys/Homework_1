
// �������� ���������, ������� ��������, �������� �� ����� ������ ��� ��������

package com.hillel;

import java.util.Scanner;

public class Task3 {
  public static void main(String... args){
	
      Scanner scanner=new Scanner(System.in);

      System.out.print("������� ���� �����: ");
      int a = scanner.nextInt();
      
      if(a == 0) System.out.println("����� �� ������ � �� ��������, ��� ������ ����. ���������.");
      else if(a % 2 == 0) System.out.println("����� ������");
      else System.out.println("����� ��������");

  }
}