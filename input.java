import java.util.Scanner;
public class input{

    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in); 
    int x;
    int y;
    
    System.out.println("Input a value");
     x= scanner.nextInt();
    System.out.println("Input other value");
    y=scanner.nextInt();
     System.out.println(x+y);
    }
}