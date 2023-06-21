package problems;

import java.util.Scanner;

public class TestQ03 {

	public int[] inputData() {//입력
		int[] sum = new int[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력: ");
		sum[0]=sc.nextInt();
		System.out.print("두 번째 수 입력: ");
		sum[1]=sc.nextInt();
		
		return sum;
	}
	
	public int[] plusData(int[] sum) {//덧셈연산
		sum[2]=sum[0]+sum[1];
		
		return sum;
	}
	
	public void printData(int[] sum) {
		
		for(int i=0; i<3; i++) {
			System.out.print(sum[i]+" ");
		}
	}
}
