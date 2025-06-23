package week3.day1;

public class Amazon extends CanaraBank{

	@Override
	public void cashonDelivery() {
		System.out.println("Mode of Payment : CashOnDelivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("Mode of Payments: UPI");

		
	}

	@Override
	public void cardPayments() {
		System.out.println("Mode of Payments: Card");

		
	}

	@Override
	public void internetBanking() {
		System.out.println("Mode of Payments: InternetBanking");

		
	}
	public static void main(String[] args) {
		Amazon amz=new Amazon();
		amz.cashonDelivery();
		amz.cardPayments();
		amz.upiPayments();
		amz.internetBanking();
		amz.recordPaymentDetails();
		
	}

}
