package day32;

public class BOA  implements Bank{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BOA b=new BOA();
		b.credit();
		b.debit();
		b.moneyTransfer();

	}

	@Override
	public void debit() {
		System.out.println("abc");
		
	}

	@Override
	public void credit() {
		System.out.println("XYZ");
	}

	@Override
	public void moneyTransfer() {
		System.out.println("DEF");
		
	}

}
