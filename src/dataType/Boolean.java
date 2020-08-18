package dataType;

public class Boolean {
	public static void main(String[] args) {
		// 부울 연산
		boolean isSuccess = true;
		boolean isTest = false;
		System.out.println(isSuccess);
		System.out.println(isTest);
		System.out.println(2>1);
		System.out.println(1==2);
		System.out.println(3%2==1);
		System.out.println("3".contentEquals("2"));
		
		// 조건문
		int base = 180;
		int height = 185;
		boolean isTall = height > base;
		
		if (isTall) {
			System.out.println("키가 큽니다!");
		
		int i = 3;
		boolean isOdd = i%2 ==1;
		System.out.println(isOdd);
		}		
	}
}
