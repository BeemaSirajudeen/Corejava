
public class ConcatExampleMain2
{

	public static void main(String[] args) 
	{
		String str1="Hello";
		String str2="Face@2.0";
		String str3="Reader";
		//concatenation one string
		String str4=str1.concat(str2);
		System.out.println(str4);
		//concatenation multiple strings
		String str5=str1.concat(str2).concat(str3);
		System.out.println(str5);
		

	}

}
