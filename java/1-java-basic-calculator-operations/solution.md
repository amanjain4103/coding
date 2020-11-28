### logic                                  
Since we need to perform different opertions in different cases of operators, so to write clean code we will take switch case loop but it can also be achieved by if-else ladder or by other methods.
So it can be easily solved by : 
* Method 1 : using switch case 
* Method 2 : using if else laddar 

### Sloution Code
```
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner kb = new Scanner(System.in);
    
    System.out.println("Enter two integers");
    int num1 = kb.nextInt();
    int num2 = kb.nextInt();
    System.out.println("Enter an Operator from (+ , - , * , /)");
    char operator = kb.next().charAt(0);
    int result;
    switch(operator) {
      case '+': result = num1 + num2;
                break;
      case '-': result = num1 - num2;
                break;
      case '*': result = num1 * num2;
                break;
      case '/': result = num1 / num2;
                break;
      default: System.out.println("You entered invalid operator"); return;
    }

    System.out.printf("%d %c %d = %d \n",num1,operator, num2, result);

  }
}
```