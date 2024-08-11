import java.util.*;
//user defined exception class for pay out of bounds Exception
class PayOutOfBoundsException extends Exception
 {
    //Constructor 
    public PayOutOfBoundsException(String s)
    {
       super(s); //calls Exception class Constructor
    }
}
//Main class for User defined Exception
public class Salary
{
    public static void main(String args[])
    {
    
    Scanner in =new Scanner(System.in);
    System.out.println("Enter Employee Salary: ");
    //Get Employee salary from User
    int esal=in.nextInt();
    try{
        //Check if employee salary not between 3000 and 10000 
        if(esal<3000 || esal>10000)
        {
	    // throw pay out of bounds exception with a message
            throw new PayOutOfBoundsException("Salary must be 3000 to 10000");
        }
         //print employee salary if given salary is within bounds
        System.out.println("The given salary of Employee is "+esal);
    }
   //catch block for payoutof bounds exception
    catch(PayOutOfBoundsException e)
    {
	//catch the exception and prints the error message
        System.out.println(e);
    }
}
}
