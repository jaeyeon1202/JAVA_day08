package method;

import java.util.Scanner;

public class MainClass06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0, sum=0;
		System.out.println("수 입력: ");
		num=sc.nextInt();
		
		TestClass06 t = new TestClass06();
		sum = t.sumFunc(num); //function에서 넘어온 sum값을 저장하려면 변수가 필요하기 때문에
		//sum=t.sumFunc(num);으로 받아준다!
		
		System.out.println("1~"+num+"까지의 합: "+sum);
		
	}//main
}//class
