package method;
/*
method(소괄호가 있느느지 없는지, 소괄호가 있으면 기능이 있다->메소드다.exprintln();, next(); ->메소드
- 독립적인 기능을 가지는 작은 프로그램
- 또 다른 언어에서는 function이라고도 표현함
- method는 class안에서 만드는 기능을 말한다
- function은 class가 없는 공간에서 만드는 기능을 말한다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		
		TestClass02 t = new TestClass02(); //객체화
		
		System.out.println("main시작"); //f6
		t.test(); //메소드 호출 //f5
		System.out.println("main종료");//f6
	}
}
