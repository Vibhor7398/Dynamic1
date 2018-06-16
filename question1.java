import java.io.*;

public class question1 {

	public static void main(String[] args) throws IOException {

		String str = "W:/Super30/New folder/src/demo.txt";
		String str2 = "W:/Super30/New folder/src/demo2.txt";
		File f = new File("W:/Super30/New folder/src/abc.txt");
		f.createNewFile();
		
		FileWriter fw = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(str);
		pw.println(str2);
		
		pw.close();

		FileReader fr = new FileReader(f);
		int ch = fr.read();
		while (ch != -1) {
			System.out.print((char) ch + "");
			ch = fr.read();
		}

	}

}
