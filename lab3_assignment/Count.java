package lab3;

import java.util.Scanner;

public class Count {
	
	public static void main(String[] args) {
		int chars=0,words=0,lines=0;
		System.out.println("Enter text : ");
		
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		char[] ch;
	
		
		 ch = text.toCharArray();
		 for(int i=0;i<ch.length;i++) {
				chars++;
				if(ch[i]==' ')
					words++;
				if(ch[i]=='\n')
					lines++;
			}
		
		
		
		
		System.out.println("Characters : "+chars+"\nWords : "+words+"\nLines : "+lines);
	sc.close();	
	}

}
