package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class TestQ04 {

	public ArrayList<Integer> inputData(){//입력
		
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력1: ");
		int n1 = sc.nextInt();
		arr.add(n1);
		System.out.print("수 입력2: ");
		int n2 = sc.nextInt();
		arr.add(n2);
		
		return arr;
	}
	
	public ArrayList<Integer> plusData(ArrayList<Integer> arr){//덧셈연산
	
		arr.add(arr.get(0)+arr.get(1));
		
		return arr;
	}
	
	public ArrayList<Integer> printData(ArrayList<Integer> arr){//출력
		
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
		
		return arr;
	}
}










