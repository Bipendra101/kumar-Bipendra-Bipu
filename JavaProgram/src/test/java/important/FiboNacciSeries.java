package important;

public class FiboNacciSeries {

	public static void main(String[] args) {
	
		int n=9;
		int f=0;
		int s=1;
		for(int i=0;i<=n;i++) {
			int t=f+s;
			System.out.println(f+" ");
			f=s;
			s=t;
		}

	}

}
