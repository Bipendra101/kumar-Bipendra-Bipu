package String;

public class ReverseString {

	public static void main(String[] args) {
		
		String s= "Bipendra Bipu";
		String rev="";
		
		int length=s.length();
		for (int i=length-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	

	}

}
