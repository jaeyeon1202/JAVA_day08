package problems;

import java.util.Scanner;

public class MainQ05 {

	public static void main(String[] args) {
		//입력은 main, 연산 출력은 메소드로 구현
		//1. 두 수를 입력받아 큰 수를 출력하는 메소드
		//2. 입력 받은 값이 짝수인지 홀수인지 판별하는 메소드
		//3. 3의 배수를 판별하는 메소드를 만들고 이 메소드를 이용하여 main에서 3의 배수만 출력하시오
		//4. 수를 입력받아 소수를 판별하는 메소드
		//5. 절대값을 구하는 메소드
		
		TestQ05 t = new TestQ05();
		
		//#1
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("수 입력1: ");
		n1=sc.nextInt();
		System.out.print("수 입력2: ");
		n2=sc.nextInt();
		
		int max = t.large1(n1, n2);
		t.print1(max);
		System.out.println("===============");
		//========================================
		
		//#2
		System.out.print("수 입력: ");
		n1=sc.nextInt();
		
		int n = t.judgment(n1);
		t.print2(n);
		System.out.println("===============");
		//=======================================
		
		//#3
		System.out.print("수 입력: ");
		n1 = sc.nextInt();
		
		n1=t.multiple(n1);
		t.print3(n1);
		System.out.println("===============");
		//================================
		
		//#4
		System.out.print("수 입력: ");
		n= sc.nextInt();
		
		int count = t.primeNumber(n);
		t.primeNumberPrint(count);
		System.out.println("===============");
		//==========================================
		
		//#5
		System.out.print("수 입력: ");
		n= sc.nextInt();
		
		n = t.absoluteValue(n);
		t.print5(n);
		
		
	}//main

}//class

































