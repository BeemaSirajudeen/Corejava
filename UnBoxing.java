
public class UnBoxing {

	public static void main(String[] args) {
		//Converting integer to int
		@SuppressWarnings("deprecation")
		Integer a=new Integer(10);
		int i=a.intValue(); // converting Integer to int
		int j=i; // unboxing,now compiler will write a.intValue() internally
		System.out.println(a+" "+i+" "+j);
	}

}
