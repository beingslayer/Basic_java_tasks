package lab3;

import java.util.Scanner;

import java.util.*;

public class AlterString {

	
	public static void main(String[] args) {
		System.out.println("Enter String : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words=s.split("\\s");
		for(int i=0;i<words.length;i++) {
			
			StringTokenizer letters = new StringTokenizer(words[i].replaceAll(""," ")," ");
			while (letters.hasMoreTokens()) {
				 String chars = letters.nextToken().toString(); 	
				 char c = chars.charAt(0);
				 if(!isVowel(c)) {
					 int ascii = (int)c;
					 ascii++;
					System.out.print((char)ascii); 
					
				 }
				 else {
					 int ascii = (int)c;
					 System.out.print((char)ascii);
				 }
				 
			     } 
			System.out.print(" ");
		}
		
		 
	}
	public static boolean isVowel(char c) {
		  return "AEIOUaeiou".indexOf(c) != -1;
		}

}