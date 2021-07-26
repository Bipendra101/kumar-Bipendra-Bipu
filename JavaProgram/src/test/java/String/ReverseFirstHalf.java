package String;

public class ReverseFirstHalf {
	
	 public static void swapTwoHalves(String a,
             String b)
{
int la = a.length();
int lb = b.length();


String c = a.substring(0,la/2) + 
b.substring(lb/2,lb);
String d = b.substring(0,lb/2) + 
a.substring(la/2,la);

System.out.println(c + "\n" + d);
}
public static void main (String args[])
{

String a = "Bipendra";
String b = "Bipu";


swapTwoHalves(b, a);
}
}


