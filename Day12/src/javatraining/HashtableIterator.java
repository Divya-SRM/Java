package javatraining;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashtableIterator {
	public static void main(String[] args) {
		 
	    String str;
	    Hashtable<String, String> hashtable = new Hashtable<String, String>();
	    hashtable.put("1:", "Tamil");
	    hashtable.put("2:", "English");
	    hashtable.put("3:", "Maths");
	    hashtable.put("4:", "Science");
	    hashtable.put("5:", "Social"); 
	    System.out.println("Hashtable contains:");
	    Set<String> keys = hashtable.keySet();
	    Iterator<String> itr = keys.iterator();
	    while (itr.hasNext()) { 
	       str = itr.next();
	       System.out.println("Key: "+str+" & Value: "+hashtable.get(str));
	    } 
	 }

}
