abstract class person
	{
		abstract void learn();
		
	}
abstract class AnonymousClass {
	
	

	public static void main(String[] args) {
	person obj=new person()
			{
		public void learn()
		{
				System.out.print("Hai");
				
		}
		
	
	};
obj.learn();
}
}