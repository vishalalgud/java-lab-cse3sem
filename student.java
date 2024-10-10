import java.util.Scanner;

public class student {

	public String vtuno;
	public String fullname;
	public int sem;
	public String branchcode;
	public String address;
	
	public student()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("vtuno:");
		vtuno=scanner.nextLine();
		System.out.println("fullname:");
		fullname=scanner.nextLine();
		System.out.println("Address:");;
		address=scanner.nextLine();
		System.out.println("branch:");
		branchcode=scanner.nextLine();
		System.out.println("Semester:");
		sem=scanner.nextInt();
	}
	public void show()
	{

		System.out.println("Entered Data");
		System.out.println("VTUNO:"+vtuno);
		System.out.println("FullName:"+fullname);
		System.out.println("Sem:"+sem);
		System.out.println("Branch:"+branchcode);
		System.out.println("Address:"+address);
	}
	public static void main (String[] args)
	{
		 student std=new student ();
		 std.show();
	}
	}
