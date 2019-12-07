
public class OuterClass {
	private int a=30;
	class InnerClass
	{
		public void fun()
		{
			System.out.println(a);
			
		}
	}

	public static void main(String[] args) {
		OuterClass obj=new OuterClass();
		OuterClass.InnerClass ob=obj.new InnerClass();
		ob.fun();

	}

}

	

	
