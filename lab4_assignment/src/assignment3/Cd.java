package lab4.assignment3;

public class Cd extends MediaItem{
      
	private String artist;
	private String genre;
	
	
	
	public Cd(String title, int copies, String id, int data,String artist, String genre) {
		super(title, copies, id, data);
		this.artist = artist;
		this.genre = genre;
	}

	
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void print() {
		super.print();
		System.out.println("The director: "+artist);
		System.out.println("The gener: "+genre);
		
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean isSame = false;
		// code to compare e1 and e2
		
		if(obj instanceof Cd)
		{
		  Cd e = (Cd)obj;	
		  
		  boolean a = this.artist.equals(e.artist);
		 
		  boolean b = this.genre.equals(e.genre);
		  
		  return super.equals(obj) && a && b;
			
		}
		return isSame;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Director: "+artist+"Genre: "+genre;
	}
	
}
