package dataType;

public class TestStingBuffer {
	public static void main(String[] args) {
		
		// append1
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		System.out.println(sb.toString());
		
		// append2
		String temp = "";
		temp += "hello";
		temp += " ";
		temp += "jump to java";
		System.out.println(temp);
		
		// insert
		StringBuffer sb1 = new StringBuffer();
		sb1.append("jump to java");
		sb1.insert(0, "hello ");
		System.out.println(sb1.toString());
		
		// substring
		StringBuffer sb2 = new StringBuffer();
		sb2.append("Hello jump to java");
		System.out.println(sb2.substring(0,4));
		
	}

}
