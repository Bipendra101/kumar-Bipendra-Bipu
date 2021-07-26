package String;

public class SegregateCharacter {

	public static void main(String[] args) {
String s="hftes#@$2879gters";
		
		String alpha="";
		String num="";
		String spcl="";
		
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='z')
			{
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else {
				spcl=spcl+s.charAt(i);
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spcl);
		
		

	}


	}


