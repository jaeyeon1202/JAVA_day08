package method;

public class TestClass06 {

	public int/*반환타입*/ sumFunc(int num) {//100을 넘겨줌
		int sum=0;
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		/*
		 return
		 - return 다음에 값이 있으면 해당 값을 돌려주는 역할
		 , 메소드를 종료하는 역할
		 - return 다음에 값이 없으면 메소드를 종료하는 역할
		 */
		return sum; //리턴값과 반환타입 매치시켜준다.
	}//method
}//class
