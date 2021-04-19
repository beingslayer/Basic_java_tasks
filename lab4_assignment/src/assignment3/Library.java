package lab4.assignment3;

import java.util.Scanner;

public class Library {
     public static void main(String[] args) {
    	 @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
    	 while(true) {
    		 System.out.println("choose:");
    		 System.out.println("1)To enter a book into library");
    		 System.out.println("2)To enter a journal");
    		 System.out.println("3)To enter the details of a video");
    		 System.out.println("4)To enter the details of a Cd");
    		 System.out.println("5) exit");
    		 switch(s.nextInt()) {
    		 case 1: System.out.println("Enter the details of book in the order");
    		         System.out.println("id, title, copies, authorName");
    		         new Book(s.next(),s.next(),s.nextInt(), s.next()).print();
    		         break;
    		         
    		 case 2: System.out.println("Enter the details of journal in the order");
	                 System.out.println("id, title, copies, authorName, published year");
	                 new JournalPaper(s.next(),s.next(),s.nextInt(), s.next(), s.nextInt()).print();
	                 break;
	                 
    		 case 3: System.out.println("Enter the details of a  video in the order");
                     System.out.println("title, copies,id,runtime, director Name, genre, published year");
                     new Video(s.next(),s.nextInt(),s.next(), s.nextInt(), s.next(), s.next(), s.nextInt()).print();
                     break;
    		 case 4: System.out.println("Enter the details of a  cd in the order");
                     System.out.println("title, copies,id,runtime, director Name, genre");
                     new Cd(s.next(),s.nextInt(),s.next(), s.nextInt(), s.next(), s.next()).print();
                     break;    
    		      
    		 case 5: System.exit(0);
    		         
    		 }
    	 }
	}
}