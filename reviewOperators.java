import java.util.Scanner;
public class reviewOperators {
  //addition
  int a;
  int b;
  String operator;
//use method
  public int getSum(int a, int b){
    return a+b;
  }
  //multiplication
  public int getTimes(int a, int b){
    return a*b;
  }
  //division
  public int getDiv(int a, int b){
    if(b == 0) {
        System.out.println("Error: Division by zero is undefined.");
        return 0; // or handle it another way, such as returning a special value.
    }
    return a/b;
}
  public int modulous(int a, int b){
    return a%b;
  }
  public int getSub(int a, int b){
    return a-b;
  }
  public static void main(String[]args){
   
    reviewOperators trial=new reviewOperators();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Input the first integer");
    trial.a=scanner.nextInt();
    System.out.println("Input the last integer");
    trial.b=scanner.nextInt();
    System.out.println("Enter a valid operator.(/,*,+,-,%)");
    trial.operator=scanner.next();
    switch(trial.operator){
      case "/":
      System.out.println(trial.getDiv(trial.a,trial.b));
      break;
      case "+":
      System.out.println(trial.getSum(trial.a,trial.b));
      break;
      case "*":
      System.out.println(trial.getTimes(trial.a,trial.b));
      break;
      case "%":
      System.out.println(trial.modulous(trial.a,trial.b));
      break;
      case "-":
      System.out.println(trial.getSub(trial.a,trial.b));
      break;
      default:
      System.out.println("Enter a valid operator");
    }
scanner.close();
  }
}
