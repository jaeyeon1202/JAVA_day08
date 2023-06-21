package method;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass08 {
	
	public static void main(String[] args) {
			
		TestClass08 t = new TestClass08();
		 t.test1();
		 
		 String s = t.test02(null);
		 System.out.println(s);
		  
		 int[] arr = t.test5();
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 
		// t.test06(100, "aaa", 1.11);
		 
		 ArrayList<String> ar = new ArrayList<>();
		 ar.add("안녕"); ar.add("하세요");
		 t.test06(ar); //arraylist를 보내면
		 
		 HashMap<String, String> m = t.test06(ar);
		 System.out.println(m);
	}
}
