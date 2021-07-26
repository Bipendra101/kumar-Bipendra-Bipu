package important;

public class SecondMaximumArray {

	public static void main(String[] args) {

		int a[]= {450,20,5,89,20,54,30};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.print(a[a.length-1]);

	}

}


