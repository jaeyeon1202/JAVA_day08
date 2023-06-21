package test;

import com.care.test.MemberClass;

public class MainClass {
	public static void main(String[] args) {
		MemberClass mem = new MemberClass();//객체화
		mem.name="김개똥";
		System.out.println("이름: "+mem.name);
	}
}
