
import java.util.Scanner;

class Displayunit {

   public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the number:");
      
      int n = sc.nextInt();

      if( n == 1){
         System.out.println("one");
      }
      else if(n == 10){
         System.out.println("ten");
      }
      else if(n == 100){
         System.out.println("hundred");
      }
      else if(n == 1000){
         System.out.println("Thousand");
      }
      else {
         System.out.println("Enter a valid number");
      }
    }
}