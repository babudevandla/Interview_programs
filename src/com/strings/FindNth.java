package com.strings;

public class FindNth {

	static int printNthElement(int n) 
    { 
        // create an array of size (n+1) 
        int arr[] = new int[n+1]; 
        arr[1] = 4; 
        arr[2] = 7; 
       
        for (int i=3; i<=n; i++) 
        { 
            // If i is odd 
            if (i%2 != 0) 
                arr[i] = arr[i/2]*10 + 4; 
            else
                arr[i] = arr[(i/2)-1]*10 + 7; 
        } 
        return arr[n]; 
    }     
	static void find(int n) 
    { 
        // An array of strings to store first n numbers. arr[i] stores i'th number 
        String[] arr = new String[n+1]; 
          
        // arr[0] stores the empty string (String with 0 digits) 
        arr[0] = "";  
  
        // size indicates number of current elements in arr[], m indicates 
        // number of elements added to arr[] in previous iteration 
        int size = 1, m = 1; 
  
        // Every iteration of following loop generates and adds 2*m numbers to 
        // arr[] using the m numbers generated in previous iteration 
        while (size <= n) 
        { 
            // Consider all numbers added in previous iteration, add a prefix 
            // "3" to them and add new numbers to arr[] 
            for (int i=0; i<m && (size+i)<=n; i++) 
                arr[size + i] = "3" + arr[size - m + i]; 
  
            // Add prefix "4" to numbers of previous iteration and add new 
            // numbers to arr[] 
            for (int i=0; i<m && (size + m + i)<=n; i++) 
                arr[size + m + i] = "4" + arr[size - m + i]; 
  
            // Update no. of elements added in previous iteration 
            m = m << 1; // Or m = m*2; 
  
            // Update size 
            size = size + m; 
        } 
        System.out.println(arr[n]); 
    } 
	
	// main function 
    public static void main (String[] args)  
    { 
        int n = 5; 
        find(n); 
    } 

}
