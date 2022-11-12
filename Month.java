import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month's number: ");
        int monthNumber;
        monthNumber = in.nextInt();/*from   ww w .j a v a2 s .com*/
        switch (monthNumber) {
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May");
            break;
            default:
            System.out.println("Invalid month.");
            break;
        }
    }
}   

