package String;

public class NumberOfWord {
	public static void main(String[] args) {


		String str = "My name is Bipendra Bipu";

		int count = 1;

		for (int i = 0; i < str.length() - 1; i++)
		{
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
			{
				count++;
			}
		}
		System.out.println("Number of words in a string : " + count);
	}
}


