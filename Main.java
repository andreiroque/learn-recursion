
public class Main{

  public static void main(String[] args){

    //Recursion Exercise:

    // 1.) Factorial
    int num = 10;
    int factor = factorial(num);

    System.out.println("Factor of " + num + ": "+ factor);

  }

  public static int factorial(int num){

    if(num <= 1) return 1;

    num = num * factorial(num - 1);

    return num;
  } 

}