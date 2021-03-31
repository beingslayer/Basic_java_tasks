package day2;
public class ArrayDemo1 {

	public static void main(String[] args) {
		
		ArrayDemo1 app = new ArrayDemo1();
		
		int arr[] = new int[5];
		int i = 0;
		arr = app.insertIntoArray(arr, 7, i++);
		arr = app.insertIntoArray(arr, 7, i++);
		arr = app.insertIntoArray(arr, 49, i++);
		arr = app.insertIntoArray(arr, 177, i++);
		arr = app.insertIntoArray(arr, 17, i++);
		
		app.printArray(arr);
		int data = app.getInformation(arr, 0);
		System.out.println("\n Information "+data);
		
		data = app.getInformation(arr, 4545);
		if(data<0) System.out.println(" Wrong Index");
		
		int search_value=app.searchElement(arr,1777);
		System.out.println("The searched value is in "+search_value+" position");
		
		int minmax[]=app.getMinMax(arr);
		System.out.println("MIN AND MAX VALUE ARE ");
		app.printArray(minmax);
		
		int multiples[]= app.getMultiplesOf(arr, 7);
		System.out.println("\nMULTIPLES of 7 ARE ");
		app.printArray(multiples);
	}
	
	public void printUsingEnhanceForLoop(int arr[])
	{
		// from java 1.5 onwards
		for (int myElement : arr) {
			myElement = myElement/2; //business operation , 100 lines of code 
			System.out.println(myElement);
		}
	}
	
	
	public int[] insertIntoArray(int arr[],int information,int position)
	{
		
		arr[position] = information;
		return arr;
		
	}
	
	public void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]+" ");
		}
	}
	public int getInformation(int arr[],int position)
	{
		if(position>arr.length)
		{
			return -1;
		}
		return arr[position];
	}
	
	// This method accept an array and the element to be searched and return the index value if element found
	// otherwise return -1;
	// as well as return -2 if array is empty
	public int searchElement(int arr[],int n)
	{
		if(arr.length==0)
		return -2;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==n)
				return i+1;
			
		}
		return -1;	
	}
	
	/*
	 * this method returns an array of size 2, containing min and max number of the given array, 
	  and below method cannot invoke any other method
	 * Note:- display the returned array using printArray() method 
	 *  */
	public int[] getMinMax(int arr[])
	{	int max = 0,min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
			{
				max=arr[i];
			}	
		}
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]<min)
			{
				min=arr[j];
			}	
		}
		int temp[]= {min,max};
		return temp;
	}
	
	/*
	 * this method returns an array which contains the multiples of x, 
	  and below method cannot invoke any other method
	 * Note:- display the returned array using printArray() method 
	 *  */
	public int[] getMultiplesOf(int arr[],int x)
	{
		int temp[] = new int[5],j=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]%x==0)
			{
				temp[j]=arr[i];
				j++;
			}
			
			
		}
		
		return temp;
	}
	
	
	
}//end class
