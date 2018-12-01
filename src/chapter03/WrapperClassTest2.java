package chapter03;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		String s = "123456";
		int i = Integer.parseInt(s);
		//cf 반대로 하는 경우
		String s2 = String.valueOf(i);
		
		System.out.println(s + ":" + s2);
		
		int a = Character.getNumericValue('F');
		System.out.println(a);
		
		//2진수
		String s3 = Integer.toBinaryString(15);
		System.out.println(s3);
		
		//16진수
		String s4 = Integer.toHexString(256);
		System.out.println(s4);
	}

}
