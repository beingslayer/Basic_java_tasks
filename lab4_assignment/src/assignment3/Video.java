package lab4.assignment3;

public class Video extends MediaItem{
     

	private String director;
	private String genre;
	private int year;
	
	public Video(String title, int copies, String id, int data,String director, String genre, int year ) {
		super(title, copies, id, data);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void print() {

		super.print();
		System.out.println("The director: "+director);
		System.out.println("The gener: "+genre);
		System.out.println("The Year of release: "+year);
	}
	@Override
	public boolean equals(Object obj) {

		boolean isSame = false;
		// code to compare e1 and e2
		
		if(obj instanceof Video)
		{
		  Video e = (Video)obj;	
		  
		  boolean a = this.director.equals(e.director);
		  boolean b = this.year == e.year;
		  boolean c = this.genre.equals(e.genre);
		  
		  return super.equals(obj) && a && b && c;
			
		}
		return isSame;
		
	}
	@Override
	public String toString() {

		return super.toString()+"Director: "+director+"Genre: "+genre+"Year: "+year;
	}
	
	
}
