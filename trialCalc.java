import java.util.Scanner;

 
    

public class trialCalc {
    public static void main (String[] args){
    Scanner scanner=new Scanner(System.in);
    int x;
    int y;
    System.out.println("Input value of x");
    x=scanner.nextInt();
    System.out.println("Input value of y");
    y=scanner.nextInt();
    System.out.println(x+y);
    scanner.close();
    }

}