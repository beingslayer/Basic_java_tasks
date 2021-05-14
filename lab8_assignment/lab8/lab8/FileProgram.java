package lab8;
import java.io.*;

public class FileProgram {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("f1");
		
		f.createNewFile();
		System.out.println("gccdjjd");
		FileWriter fw = new FileWriter(f);
		fw.write("Hi! Have a nice day. See you soon.");
		fw.close();
		File f2 = new File("File2");
		
		 CopyDataThread obj = new CopyDataThread(f,f2);
		 
		
		
	}

}
