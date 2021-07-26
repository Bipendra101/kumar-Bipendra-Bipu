package String;

public class BlankSpace {

	public static void main(String[] args) {
	

        String str = "      I am a Disco Dancer       ";
       
        // Used replaceAll() method
        str = str.replaceAll("\\d", "");
       
        System.out.println(str);

	}

}
