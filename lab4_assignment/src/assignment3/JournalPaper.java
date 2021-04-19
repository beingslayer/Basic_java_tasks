package lab4.assignment3;

public class JournalPaper extends WrittenItem{
   
	private int publishedYear;
	
	public JournalPaper(String id, String title, int copies, String authorName, int  publishedYear) {
		super(id, title, copies, authorName);
		this.publishedYear = publishedYear;
	}

	

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	
	public void print() {
		super.print();
		System.out.println("Published year:"+publishedYear);
	}
	
	

}
