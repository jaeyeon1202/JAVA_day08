package problems;

public class TestQ05 {
	//#1
	public int large1(int n1, int n2) {
		
		int max;
		if(n1>n2) max = n1;
		else if(n1 < n2) max = n2;
		else max=0;
		
		return max;
	}
	
	public void print1(int max) {
		System.out.println("큰수: "+max);
	}
	//=========================================
	
	//#2
	public int judgment(int n1) {
		
		int n=0;
		
		if(n1%2==0)
			n=0;
		else if(n1%2!=0)
			n=1;
		
		return n;
	}
	
	public void print2(int n) {
		
		if(n==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	
	}
	
	//==================================
	
	//#3
	public int multiple(int n1) {
		if(n1%3==0)
			n1=1;
		else
			n1=0;
		return n1;
	}
	
	public void print3(int n1) {
		if(n1==1) 
			System.out.println("3의 배수입니다.");
		else if(n1==0)
			System.out.println("3의 배수가 아닙니다.");
	}
	//===================================================
	
	//#4
	public int primeNumber(int n) {
		
		int count=0;
		for(int i=2; i<n-1;i++) {
			if(n%i==0) 
				count++;
		}
		
		return count;
	}
	
	public void primeNumberPrint(int count) {
		if(count==0)
			System.out.println("소수이다");
		else
			System.out.println("소수가 아니다");
	}
	//==============================================
	
	//#5
	public int absoluteValue(int n) {
		if(n<0)
			n *= (-1);
		return n;
	}
	
	public void print5(int n) {
		System.out.println(n);
	}
	
	
}








































































































