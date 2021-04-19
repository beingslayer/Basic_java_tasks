package lab4.assignment3;

public abstract class MediaItem extends Item{
	
	private int runTime;
	
      public MediaItem(String title, int copies, String id, int runTime) {
		super(title, copies, id);
		this.runTime = runTime;
		
	}

	

	public int getData() {
		return runTime;
	}

	public void setData(int runTime) {
		this.runTime = runTime;
	}
	
	public void print() {
	    super.print();
	    System.out.println("runtime:"+runTime);
        }


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean issame = false;
		if(obj instanceof MediaItem) {
			MediaItem mi = (MediaItem)obj;
			boolean a = this.runTime == mi.runTime;
		 return a;
		}
		return issame;
	}


	@Override
	public String toString() {
		
		return "Runtime: "+runTime;
	}
	
	
	
}
