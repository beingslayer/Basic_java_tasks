package lab4.assignment3;

public abstract class Item {
	
    private String id;
    private String title;
    private int copies;
    
    public Item() {
		// TODO Auto-generated constructor stub
	}
    
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return title;
	}
	public void setName(String title) {
		this.title = title;
	}
	
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public Item(String title, int copies, String id) {
		super();
       this.copies = copies;
       this.id = id;
       this.title = title;
	}
     
	public  boolean equals(Object obj) {
		
				boolean isSame = false;
			
				if(obj instanceof Item)
				{
				  Item item = (Item)obj;	
				  
				  boolean a = this.id.equals(item.id);
				  boolean b = (this.copies == item.copies);
				  boolean c = this.title.equals(item.title);
				  
				  return a&&b&&c;
					
				}
				return isSame;
	}
	public  void print() {
		System.out.println("Id number:"+id);
		System.out.println("Name of the title:"+title);
		System.out.println("Number of copies:"+copies);
		
		
	}
	public  String toString() {
		 return "Id: "+id+" - "+"Title: "+title+"Number of Copies"+copies;
	}
	
	public int checkIn(int copies) {
		this.copies += copies;
		return copies;
	}
	
	public int checkOut(int copies) {
		this.copies -= copies;
		return copies;
	}
	
	public  void addItem() {
		System.out.println("Item is added");
	}
	
	
	
	
}
