## Question

**Find kth minimum element in an array of elements**

### Exact Problem statement 
Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Expected Time Complexity: O(n)

Example:

```
Input:
2
6
7 10 4 3 20 15
3
5
7 10 4 20 15
4

Output:
7
15
```

Explanation:
Testcase 1: 3rd smallest element in the given array is 7.
Testcase 2: 4th smallest element in the given array is 15

### Problem Practice Link
https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1

## Solution

### Logic 
According to question we need to find kth smallest element(e.g. 3rd smallest element) so first thing that strikes that we need to sort our array to get something max or min. Now there are a plenty of sorting algorithms but as of question we need to do it in O(n), 

Algorithm | Worst case Complexity | 
Quick Sort | O(n*n) 
Merge Sort | O(n*logn)
Quick Select | O(n*n)
more... | more...

*But problem statement is demanding O(n) complexity which can be achieved by two ways:*
* *Quick select Algorithm is similar to quick sort but it gives best case complexity as O(n) so we can directly implement it (worst case complexity = O(n*n) ) OR*
* *Directly use Arrays.sort(arr) method in java.*

**Note: Arrays.sort() internal implementation**
Arrays.sort() method of java uses two sorting algorithm: quick sort and merge sort. Since experienced java developers implemented it, thus it have more efficiency. It uses quicksort for primitive data types and merge sort for refernces/objects. 

### Code

```
public static int kthSmallest(int [] arr, int l,int r, int k)  
    { 
        // Sort the given array 
        Arrays.sort(arr); 
  
        // Return k'th element in  
        // the sorted array 
        return arr[k-1]; 
    }  
```
