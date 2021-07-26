package Array;

public class RemoveVowel {

	public static void main(String[] args) {
		String s="Bipendra";
		char [] ch=s.toCharArray();
		String out="";
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i] !='a' && ch[i] !='e' && ch[i] !='i' && ch[i] !='o' && ch[i] !='u')
			{
				out=out+ch[i];
			}
		}
		System.out.println(out);
	}

	}


