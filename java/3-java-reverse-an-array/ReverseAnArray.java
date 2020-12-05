// class ReverseAnArray {
//     public static void main(String []args) {

//     }
// }


//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;


class Reverse
{

    public static String reverseWord(String str)
    {
        // reversing the given string by using char arrays, time complexity => O(N)
        char []strArr = str.toCharArray();
        char []reverseArr = new char[strArr.length];
        
        for(int i=1; i<= strArr.length; i++) {
            reverseArr[i-1] = strArr[strArr.length-i];
        }
        
        return (new String(reverseArr));
    }
}

// { Driver Code Starts
class ReverseAnArray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends
