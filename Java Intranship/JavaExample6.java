import java.util.*;
 
class JavaExample6
{
 public static void main(String args[])
 { 
 int i,j,n;
 Scanner sc = new Scanner(System.in);
     System.out.println("Enter value of n");
     n = sc.nextInt();
    
 for(i=1;i<=n;i++)
     {
         for(j=i;j<n;j++)
         {
             System.out.print(" ");
         }
         for(j=1;j<=(2*i-1);j++)
         {
             System.out.print("*");
         }
         System.out.println("");
     } 
 for(i=n;i>=1;i--)
     {
         for(j=i;j<=n;j++)
         {
             System.out.print(" ");
         }
         for(j=2;j<(2*i-1);j++)
         {
             System.out.print("*");
         }
         System.out.println("");
     } 
 }
}