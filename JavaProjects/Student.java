import java.util.Scanner;
//Student Detail
interface Detail
{
	final String academic_year="2023-2024";
    public void getDetail();
	
}

//Student Marks 
interface Marks
{
	public void getMarks();
    public void print();
}

//multiple inheritance using inteface
class Student implements Detail,Marks
{   
	String rollno,name,degree,sem;
    int m1,m2,m3,total;
    float percent;
	public void getDetail()
	{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student Roll Number : ");
        rollno = in.nextLine();
        System.out.print("Enter Student Name : ");
        name = in.nextLine();
        System.out.print("Enter degree : ");
        degree = in.nextLine();
        System.out.print("Enter year : ");
        sem = in.nextLine();
	}
    
    public void getMarks()
    {
        Scanner in = new Scanner(System.in);
    	
        System.out.print("Enter Mark1 : ");
        m1 = in.nextInt();
		System.out.print("Enter Mark2 : ");
        m2 = in.nextInt();
        System.out.print("Enter Mark3 : ");
        m3 = in.nextInt();
        total=m1+m2+m3;
        percent=(total*100)/300;

    }
   
    public void print()
    {
        System.out.println("\nAcademic Year:  "+academic_year);
    	System.out.println("Student Roll Number:  "+rollno);
        System.out.println("Student Name:  "+name);
        System.out.println("Degree:  "+degree);
        System.out.println("Semester:  "+sem);
        System.out.println("Total Marks:  "+total);
        System.out.println("Percentage:  "+percent);
    }
    public static void main (String args[])
    {
    	Student s = new Student();
    	s.getDetail();
        s.getMarks();
    	s.print();
    }
}
