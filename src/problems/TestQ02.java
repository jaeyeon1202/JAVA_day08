package problems;

import java.util.Scanner;

public class TestQ02 {
	
	public String[] inputName() {
		
		String[] name = new String[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 이름 입력: ");
		name[0]=sc.next();
		
		System.out.print("두 번째 이름 입력: ");
		name[1]=sc.next();
		
		System.out.print("세 번째 이름 입력: ");
		name[2]=sc.next();
		
		return name;
	}
	
	public void printName(String[] name) {
		
		for(int i=0; i<3; i++) {
			System.out.println(name[i]);
		}
	}
}
