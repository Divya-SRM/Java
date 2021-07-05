package javatraining;

import java.util.TreeSet;

public class TreesetDuplicate {
	public static void main(String a[]){
        String[] strArr = {"java","sql","java","angular","react"};
        TreeSet<String> unique = new TreeSet<String>();
        for(String str:strArr){
            if(!unique.add(str)){
                System.out.println("Duplicate Entry is: "+str);
            }
        }
    }

}
