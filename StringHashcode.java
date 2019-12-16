
public class StringHashcode {
	public static void main(String[] args) 
	{
			String s1,s2;
			s1=new 	String("Shreyas");
			s2=new String("Shreyas");//new keyword use so memory allocation different so it is false
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s1==s2);
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			s2=s1+s2;
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			
	}

}
