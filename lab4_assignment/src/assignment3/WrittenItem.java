package lab4.assignment3;

public abstract class WrittenItem extends Item{
	
	private String authorName;
	
	public WrittenItem() {
		super();
	}
	
     public WrittenItem(String id, String title, int copies, String authorName) {
    	 super(title, copies, id);
    	 this.authorName = authorName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public boolean equals(Object obj) {
		boolean isSame = false;
		
		if(obj instanceof Item)
		{
		  WrittenItem written = (WrittenItem)obj;	
		  boolean a = this.authorName.equals(written.authorName);
		  
		  return super.equals(obj) && a;
			
		}
		return isSame;
	}
	
	public String toString() {
		
		return super.toString()+"Author Name: "+authorName;
	}
	
	@Override
	public void print() {

		super.print();
		System.out.println("The Book Author's is: "+authorName);
	}

}
