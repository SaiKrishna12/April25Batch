package day5;

public class WhileLoopExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=1;
		while(i<=10)
		{
			int j=1;
			while(j<=10)
			{
				System.out.println(i+"*"+j+"="+j*i);
				j++;
		    }
		    i++;
		}
		

	}

}
