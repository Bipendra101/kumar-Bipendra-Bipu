package String;

public class Program1 {

	public static void main(String[] args) {

		String s="welcome Bipz";
		char [] ch=s.toCharArray();
		String out="";
		for(int i=0; i<ch.length; i++ ){
			String word="";
			while(i<ch.length && ch[i]!=' '){
				word=ch[i]+word;
				i++;
			}
			out=out+word+" n";
		}
		System.out.println(out);
	}
}


