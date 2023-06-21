package method;

import java.util.ArrayList;
import java.util.HashMap;

public class TestClass08 {

	//void: return값이 없는 경우+
	public void test1() {
		int num =1;
		if(num==1) {
			System.out.println("if 실행");
			return; //메소드를 빠져나올때 사용한다.
		}
		System.out.println("다음 문장 실행");
	}
	
	public String test02(String s) {
		return null;
	}
	
	public int test3() {
		int num=1;
		if(num==1) {
			return 100;
		}
		return 0;
	}
	
	public void test4() {
		int num=1;
		if(num==1) {
			//return "aaa"; //리턴값의 자료형은 하나만!
		}else {
			//return 100; //
		}
	}
	
	public int[] test5() {
		int n1=100, n2=200;
		//return n1, n2; //리턴값은 여러개를 돌려줄 수 없다.
		int[] arr = {n1, n2};
		return arr; //리턴값이 int형의 배열이니까 반환형은 int[]
	}
	
	public HashMap<String, String> test06(ArrayList<String>/*arraylist로 보낸다*/ ar) {
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		
		HashMap<String, String> map = new HashMap<>();
		map.put("키1", "값1");
		map.put("키2", "값2");
		String re = map.put("키2", "값2");
		System.out.println("re: "+re);
		
		return map;
	}
}























































