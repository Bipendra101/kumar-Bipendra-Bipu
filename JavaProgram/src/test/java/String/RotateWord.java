package String;

public class RotateWord {
	
	 static String leftrotate(String str, int d)
	    {
	            String ans = str.substring(d) + str.substring(0, d);
	            return ans;
	    }
	 
	    // function that rotates B towards right by u
	    static String rightrotate(String str, int u)
	    {
	            return leftrotate(str, str.length() - u);
	    }
	 
	    // Driver code
	    public static void main(String args[])
	    {
	            String str1 = "KumarBipendraBipu";
	            System.out.println(leftrotate(str1, 2));
	 
	            String str2 = "KumarBipendraBipu";
	            System.out.println(rightrotate(str2, 2));
	    }
	}



