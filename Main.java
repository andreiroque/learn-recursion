
public class Main{

  public static void main(String[] args){

    //Recursion Exercise:

    // 1.) Factorial
    int num = 10;
    int factor = factorial(num);

    System.out.println("Factor of " + num + ": "+ factor);

    // 2.) Simple Countdown
    countdown(num);

    // 3.) Sum of Numbers
    int sum = sumOfNumbers(num);
    System.out.println("\nSum of All Numbers: " + sum);

    // 4.) Fibonacci
    int fibonacci = fibonacci(num);
    System.out.println("Fibonacci: " + fibonacci);
    
    // 5.) Power
    int pow = 5;
    System.out.println("Power: " + power(num, pow));

    // 6.) Digit Counter
    System.out.println("Digits Count: " + digitCounter(num));

    // 7.) Reverse String
    String text = "hello";
    System.out.println("Reversed text: " + reverseString(text));
  }

  public static int factorial(int num){

    if(num <= 1) return 1;

    num = num * factorial(num - 1);

    return num;
  }

  public static void countdown(int num){

    if(num >= 1){
      System.out.print(num + " ");
      countdown(num - 1);
    }
  }

  public static int sumOfNumbers(int num){

    if(num <= 1) return num;

    num = num + sumOfNumbers(num - 1);

    return num;
  }

  public static int fibonacci(int num){

    if (num == 0) return 0;
    if (num == 1) return 1;
    
    num = fibonacci(num - 1) + fibonacci(num - 2);

    return num;
  }

  public static int power(int num, int pow){

    if(pow == 0) return 1;

    return num * power(num, pow - 1);
  }

  public static int digitCounter(int num){

    if(num <= 1) return 1;

    return digitCounter(num / 10) + 1;
  }

  public static String reverseString(String text){

    if(text.length() <= 1) return text;

    char lastChar = text.charAt(text.length() - 1);

    text = text.substring(0, text.length() - 1);
    
    return lastChar + reverseString(text);
  }

}