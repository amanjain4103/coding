## Question

**Find maximum and minimum numbers in an array.**
**Extended: find middle element in three numbers.**

### Problem Practice Link
https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
https://practice.geeksforgeeks.org/problems/middle-of-three2926/1

## Solution

### Logic 
* For finding maximum in three: Use ternary operator => O(1)
* For finding minimum in three: Use ternary oprator => O(1)
* For finding max/min in a array of elements : 
initialize int ```max=arr[0];``` and then loop through array => compare each element with max if other element is greater than max then just replace max with this element, for e.g. ```max=arr[i]```  => O(n)

* For Finding middle element in three: find max(A,B,C) and min(A,B,C) first, then *middle = (A+B+C) - (max + min)* 

### Code
Easy to implement;