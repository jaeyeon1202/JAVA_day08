package method;

import java.util.Scanner;

public class MainCalss05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0, sum=0;
		System.out.println("수 입력: ");
		num=sc.nextInt();
		
		TestClass05 t = new TestClass05();
		t.sumFunc(num);
		
	}
}
