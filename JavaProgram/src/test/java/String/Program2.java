package String;

public class Program2 {

	public static void main(String[] args) {

		int [] arr= {2,5,5,2,5,6,6,8,10};
		int n=arr.length;
		//loop for comparision
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1;j<n;j++) 
			{
				if(arr[i]==arr[j]) // checking duplicate
				{ 
					for(int k=j; k<n-1;k++) //shifting
					{
						arr[k]=arr[k+1];
					}
					n--; //Ignore last shifted element
					j--;//next compare should start from last shifted element
				}
			}
		}
		int [] narr=new int[n];
		for(int i=0;i<n; i++)
		{
			narr[i]=arr[i];
		}
		System.out.println("*****OUT PUT ARRAY*****");
		for(int i=0;i<narr.length;i++)
		{
			System.out.println(narr[i]);
		}

	}
}






