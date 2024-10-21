import java.util.Scanner;

public class p3 {
int a,b;
Scanner s1=new Scanner(System.in);
p3()
{
	System.out.println("enter any 2 integer");
	a=s1.nextInt();
	b=s1.nextInt();
}
void display()
{
	System.out.println("Addition="+(a+b));
	System.out.println("Substraction="+(a-b));
	System.out.println("Multiplication="+(a*b));
	System.out.println("Division="+(a/b));
}
p3(float a1,float b1)
{
	System.out.println("Addition="+(a1+b1));
	System.out.println("Substraction="+(a1-b1));
	System.out.println("Multiplication="+(a1*b1));
	System.out.println("Division="+(a1/b1));
	
}
void display(int x)
{
	System.out.println("square of "+x+" is "+(x*x));
	
}
}
     class Main{
    public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println(" * Arithimatic operations on integer");
	p3 a=new p3();
	a.display();
	System.out.println("\n * arithimatic operations on float");
	System.out.println("enter any 2 float numbers");
	float a1=s1.nextFloat();
	float a2=s1.nextFloat();
	p3 arth1=new p3(a1,a2);
	System.out.println("\n * enter number to find square");
	int x=s1.nextInt();
	a.display(x);
}
}
