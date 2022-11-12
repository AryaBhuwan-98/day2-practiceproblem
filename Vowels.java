import java.util.Scanner;

public class Vowels {
    public static void main(String[]args)
{
    Scanner inp=new Scanner(System.in);
System.out.print("\n Enter Character: ");
char c=((inp.nextLine()).charAt(0));


switch(c) //Checking Vowel Character using Switch Case
{
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
case 'a':
case 'e':
case 'i':
case 'o':
case 'u': 
System.out.println(c+" is a Vowel.");
break;

default: System.out.println(c+" is a Non-Vowel Character.");
}
inp.close();
}
}

