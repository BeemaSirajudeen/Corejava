
	interface Example
	{
		void method1();
		void method2();
		void method3();
		
	}
	class eginterface implements Example
	{
		public void method1()
		{
		System.out.println("Method1");
	}
	
		public void method2()
		{
		System.out.println("Method2");
	}
	
		public void method3()
		{
		System.out.println("Method3");
	}

	public static void main(String[] args) {
		Example e=new eginterface ();
		e.method1();
		e.method2();
		e.method3();

	}

}
