package lab2_assignment;

import java.util.Arrays;

public class RemoveDuplicateArray {
	
	 
		public static int removeDuplicates(int arr[], int l){  
		        
		        int[] t = new int[l];  
		        int j = 0;  
		        for (int i=0; i<l-1; i++)
		        {  
		        	
		            if (arr[i] != arr[i+1])
		            {  
		                t[j++] = arr[i];  
		            }  
		         }  
		         t[j++] = arr[l-1];     
		           
		        for (int i=0; i<j; i++){  
		            arr[i] = t[i];  
		        }  
		        return j;  
		    }  
		       
		    public static void main (String[] args) {  
		        int a[] = {10,20,20,30,30,40,50,50,20,40};  
		        Arrays.sort(a);
		        int length = a.length;  
		        length = removeDuplicates(a, length);  
		        for (int i=0; i<length; i++)  
		           System.out.print(a[i]+" ");  
		    }  
		}