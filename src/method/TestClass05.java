package method;

import java.util.Scanner;

public class TestClass05 {

	public void sumFunc(int num) {//100을 넘겨줌
		int sum=0;
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		System.out.println("1~"+num+"까지의 합 "+sum);
	}
}
