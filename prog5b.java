class outer
{
	private int x=10;
	protected int z =30;
	
	class inner 
	{
		private int x= 20;
		protected int z = 85; 
	}
	public static void main(String[] args)
	{
		outer obj1 = new outer();
		inner obj2 = new outer ().new inner();
		System.out.println("Through outer class,x="+obj1.x);
		System.out.println("Through inner class,x="+obj2.x);
	}
}

class prog5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 outer ob1 = new outer();
 outer.inner ob2 =new outer().new inner();
 
 System.out.println("Through Different class outer protected z ="+ob1.z);
 System.out.println("Through Different class inner protected z ="+ob2.z);
 
	}

}
