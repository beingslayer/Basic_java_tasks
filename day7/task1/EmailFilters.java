package day7.task1;

public class EmailFilters {
	
static String emails[] = {"ramesh@gmail.com","rakesh@outlook.com","lokesh@linkedin.com","mahesh@gmail.com",
				"ganesh@gmail.com","rajesh@outlook.com"};
public void countClass() {
	
	int gmail=0,outlook=0,link=0;
	for(int i=0;i<emails.length;i++) {
		
		if(emails[i].endsWith("gmail.com")) {
			gmail++;
		}
		
		else if(emails[i].endsWith("outlook.com")) {
			outlook++;
		}
		
		else if(emails[i].endsWith("linkedin.com")) {
			link++;
		}

			
	}
	System.out.println("Gmail has "+gmail+" users\nOutlook has "+outlook+" users\n"
			+ "Linkedin has "+link+" users" );
}


public static void main(String[] args) {
/*
* Write the code to count the number of users in particular
domain
* for example
* gmail has 3 users
* outlook has 2 users
* linkedin has 1 user
*
* HINT : use endsWith() of String class
* */
	EmailFilters emailfilters=new EmailFilters();
	emailfilters.countClass();
}
}