package Array;

public class DeleteDuplicateArray {

	public static void main(String[] args) {

		int [] arr= {5,7,8,9,9};
		int n=arr.length;


		for(int i=0; i<arr.length;i++)
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

		int [] nar=new int[n];
		for(int i=0; i<n; i++)
		{
			nar[i]=arr[i];
		}
		for(int i=0; i<nar.length; i++)
		{
			System.out.println(nar[i]);
		}
	}

}


