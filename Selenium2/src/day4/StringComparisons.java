package day4;

public class StringComparisons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a="Selenium";
		String b="Selenium";
		if(a.equals(b))
		{
			System.out.println("Strings are same");
		}
		else
		{
			System.out.println("Strings are different");
		}
		System.out.println("#############################");
		String c="SELENIUM";
		String d="selenium";
		if(c.equalsIgnoreCase(d))
		{
			System.out.println("Strings are same");
		}
		else
		{
			System.out.println("Strings are different");
		}

	}

}
