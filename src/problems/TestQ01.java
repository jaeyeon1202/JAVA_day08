package problems;

import java.util.Scanner;

public class TestQ01 {

	public String nameFunc() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = sc.next();
		
		return name;
	}
	
	public void printName(String name) {
		
		System.out.println("이름: "+name);
		
	}
}










