import java.util.Scanner;

public class prog2 {
	public static void main(String []args) {
		StringBuffer s=new StringBuffer();
		String str2;
		Scanner input=new Scanner(System.in);
		s.append("java programming ");
		System.out.println("the current capacity of StringBuffer"+s.capacity());
		System.out.println("Initial String without append: "+s);
		System.out.println("enter a String to append: ");
		str2 = input.nextLine();
		s.append(""+str2);
		System.out.println("Initial String after append: "+s);
		s.reverse();
		System.out.println("Initial String after reversing: "+s);
		int i=0;
		do {
			s.replace(i,i+1,s.substring(i,i+1).toUpperCase());
			i=i+1;
		}
		while(i>0 && i<s.length());
		System.out.println("After Reversing: "+s);
	}
}
