package String;

public class Program4 {

	public static void main(String[] args) {

		String s1="12125gahssggaa";
		char [] ar=s1.toCharArray();
		int n=ar.length;
		//two for loops for comparision
		for (int i=0;i<n-1;i++ )
		{
			for (int j=i+1;j<n ;j++ )
			{
				if(ar[i]==ar[j])//check for duplicate
				{
					//loop for shifting
					for (int k=j;k<n-1;k++ )
					{
						ar[k]=ar[k+1];
					}
					n--;//ignore the last shifted element
					j--;//next comparision should start from shifted character  
				}					
			}
		}
		char [] nar=new char[n];
		for (int i=0;i<n ;i++ )
		{
			nar[i]=ar[i];
		}

		String out=new String(nar);
		System.out.println("input==>"+s1);
		System.out.println("output==>"+out);

	}


}


