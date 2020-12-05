### Logic 
Since we need to reverse an string, first thing to note is String object is immutable so it won't change at all. The simplest solution is to covert String to character array and traverse from its back and store in other array using a single for loop.

### Solution

```
public static String reverseWord(String str)
    {
        char []strArr = str.toCharArray();
        char []reverseArr = new char[strArr.length];
        
        for(int i=1; i<= strArr.length; i++) {
            reverseArr[i-1] = strArr[strArr.length-i];
        }
        
        return (new String(reverseArr));
    }
```