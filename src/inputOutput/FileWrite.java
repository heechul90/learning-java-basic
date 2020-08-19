package inputOutput;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//public class FileWrite {
//	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("D:/workspace/jump2java/out.txt");
//		for (int i=1; i<11; i++) {
//			String data = i+" 번째 줄입니다!\r\n";
//			fw.write(data);
//		}
//		fw.close();
//		
//		FileWriter fw2 = new FileWriter("D:/workspace/jump2java/out.txt", true);
//		for (int i=11; i<21; i++) {
//			String data = i+" 번째 줄입니다?\r\n";
//			fw2.write(data);
//		}
//		fw2.close();
//	}
//}

public class FileWrite {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("D:/workspace/jump2java/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();


        PrintWriter pw2 = new PrintWriter(new FileWriter("D:/workspace/jump2java/out.txt", true));
        for(int i=11; i<21; i++) {
            String data = i+" 번째 줄입니다.";
            pw2.println(data);
        }
        pw2.close();
    }
}