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