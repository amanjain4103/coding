// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class KthSmallest {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    
		    System.out.println(kthSmallest(arr, 0, n-1, k));
        }
        
        sc.close();
	}
	

    
 // } Driver Code Ends


//User function Template for Java
    public static int kthSmallest(int [] arr, int l,int r, int k)  
    { 
        // Sort the given array 
        Arrays.sort(arr); 
  
        // Return k'th element in  
        // the sorted array 
        return arr[k-1]; 
    }  


// { Driver Code Starts.


}
  // } Driver Code Ends