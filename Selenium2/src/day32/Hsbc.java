package day32;

public class Hsbc    implements Bank{
	public static void main(String[] args)
	{
		Hsbc h=new Hsbc();
		h.debit();
		h.credit();
		h.moneyTransfer();
	}
	
	
	public void debit() {
		System.out.println("This is debit operation");
		
	}

	
	public void credit() {
		System.out.println("Credit procedure");
		
	}

	
	public void moneyTransfer() {
		System.out.println("Money transfer policy");
		
	}
	

}
