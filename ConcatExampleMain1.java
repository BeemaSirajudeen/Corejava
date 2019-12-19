
public class ConcatExampleMain1 
{

	public static void main(String[] args) 
	{
		String s1="java string";
		s1.concat("is immutable");
		System.out.println(s1); // it gives only s1 value
		s1=s1.concat( " is immutable so assign it explicity"); 
		// here  the after concatination value is assigned to 1st string so value of s1 changes
		System.out.println(s1);
		
	}

}
