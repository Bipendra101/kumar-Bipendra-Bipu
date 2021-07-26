package String;

public class LengthOfString {

	public static void main(String[] args) {
		String BipedraBipu="This is Bipendra Bipu";
		  System.out.println("length of BipedraBipu string :"+getLengthOfStringWithCharArray(BipedraBipu));
		  }
		 
		public static int getLengthOfStringWithCharArray(String str)
		 {
		  int length=0;
		  char[] strCharArray=str.toCharArray();
		  for(char c:strCharArray)
		  {
		   length++;
		  }
		  return length;
		 }

	}



