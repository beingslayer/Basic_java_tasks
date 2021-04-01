package lab1_assignment;

public class FibonnaciSeries{  
public static void main(String args[])  
{    
 int v1=0,v2=1,v3,i,count=10;    
 System.out.print(v1+" "+v2);
    
 for(i=2;i<count;++i)  
 {    
  v3 =v1 + v2;    
  System.out.print(" "+ v3);    
  v1 = v2;    
  v2 = v3;    
 }    
  
}}  