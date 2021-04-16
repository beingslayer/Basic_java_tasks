package lab3;

import java.util.Scanner;

public class MirrorString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		StringBuffer str=new StringBuffer(sc.nextLine());
		MirrorString m=new MirrorString();
		m.getImage(str);
	}

	public void getImage(StringBuffer strbuff) {
		System.out.println(strbuff+"|"+strbuff.reverse());
		
	}
}
