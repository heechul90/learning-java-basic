package inputOutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D:/workspace/jump2java/out.txt"));
		while(true) {
			String line = br.readLine();
			if (line==null) break;
			System.out.println(line);
		}
		br.close();
	}
}
