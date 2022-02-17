import java.util.Scanner;

public class JavaExample3
{
   public static void main(String[] args)
   {
      int fact=1;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      int num = s.nextInt();
      
      for(int i=num; i>=1; i--)
         fact = fact*i;
      
      System.out.println("\nFactorial of " +num+ " is " +fact);
   }
}