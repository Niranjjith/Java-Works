import java.util.Scanner;

public class PrintString
{ 
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = in.nextLine();
        int len = s.length();
        System.out.print("Enter index of starting character  : ");
        int n = in.nextInt();
       
        if(n < 0 || n >= len)
        {
            System.out.println("Invalid index");
            System.exit(1);
        }
       
        System.out.print("Enter number of characters to extract from String :\n ");
        int m = in.nextInt();
       
        int substrend = n + m;
        if( m <= 0 || substrend > len)
        {
            System.out.println("Invalid number of characters");
            System.exit(1);
        }      

        String extstr = s.substring(n, substrend);
        System.out.println("Extracted String = " + extstr);
    }
}
