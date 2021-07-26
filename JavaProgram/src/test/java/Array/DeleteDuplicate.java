package Array;

public class DeleteDuplicate {

	public static void main(String[] args) {

		int [] arr= {3,3,5,6,9,9,9};
		System.out.println("---------INPUT ARRAY-----------");

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		int n=arr.length;

		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]==arr[j]) 
				{
					for(int k=j; k<n-1; k++)
					{
						arr[k]=arr[k+1];
					}
					n--;
					j--;
				}

			}


		}
		int [] nwarr=new int[n];
		for(int i=0;i<n; i++)
		{
			nwarr[i]=arr[i];
		}
		System.out.println("-----------OUT PUT ARRAY-----------");

		for(int i=0; i<nwarr.length; i++) {
			System.out.println(nwarr[i]);
		}

	}
}


