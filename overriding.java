package polymorphism;
class polymorphism{



	public void area(int a)
	{
		System.out.println("Area of square\n"+(a*a));
	}
	public void area(int l,int b)
	{
		System.out.println("Area of rectangle\n"+(l*b));
	}
	public void area(float b,int h)
	{
		System.out.println("Area of triangle\n"+(0.5*b*h));
	}
	public void area(float r)
	{
		System.out.println("Area of circle\n"+(3.141*r*r));
	}
	
}
	
	
	
	public class overriding extends polymorphism{
		
		public void area(int a)
		{
			System.out.println("Area of square\n"+(a*a));
		}
		public void area(int l,int b)
		{
			System.out.println("Area of rectangle\n"+(l*b));
		}
		public void area(float b,int h)
		{
			System.out.println("Area of triangle\n"+(0.5*b*h));
		}
		public void area(float r)
		{
			System.out.println("Area of circle\n"+(3.141*r*r));
		}
	

	public static void main(String[] args) {
		polymorphism obj=new polymorphism();
		polymorphism ob=new overriding();
		obj.area(6);
		obj.area(6,7);
		obj.area(8f,3);
		obj.area(3f);
		
		ob.area(5);
		ob.area(5,7);
		ob.area(6f,4);
		ob.area(4f);
	}

}
