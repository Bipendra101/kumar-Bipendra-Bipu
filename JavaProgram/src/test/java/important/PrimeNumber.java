package important;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=30;

		boolean prime=true;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				prime=false;
				break;

			}
		}
		if(prime) {
			System.out.println("no.is prime");
		}
		else {
			System.out.println("no. is nt prime");
		}
	}

}
