package Array;

public class OccuranceOfArray {

	public static void main(String[] args) {

		int [] arr= {1,1,2,1,2,1,3,3,6,5,5};
		int n=arr.length;

		for(int i=0; i<n; i++)
		{
			int count=1;
			for(int j=i+1; j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					for(int k=j; k<n-1;k++)
					{
						arr[k]=arr[k+1];
					}
					n--;
					j--;
				}
			}
			System.out.println(arr[i]+" is occurance "+count+"times");
		}

	}


}


