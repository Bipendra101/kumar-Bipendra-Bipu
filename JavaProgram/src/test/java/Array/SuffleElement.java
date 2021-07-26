package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SuffleElement {

	public static void main(String[] args) {
		
ArrayList<String> al = new ArrayList<String>();
  
        
        al.add("Mohan");
        al.add("Sohan");
        al.add("Raman");
        al.add("Gagan");
        al.add("pavan");
        al.add("hiren");
  
        System.out.println("Before shuffling Arraylist:");
  
       
        Iterator itr = al.iterator();
  
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
  
        System.out.println("");
  
        Collections.shuffle(al);
  
        System.out.println("After shuffling Arraylist:");
  
        itr = al.iterator();
  
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}





