package javatraining;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackArray {
	public static void main(String args[])
	{
	ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
	System.out.println("Enter number of elements");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
    	stack.push(sc.nextInt());
    }
    System.out.println("Current element at the top of the stack: " + stack.peek());
    System.out.println("Element popped from the stack: " + stack.pop());
    System.out.print("Current elements in the stack: ");
    while(!stack.isEmpty()) 
    {
        System.out.print(stack.pop() + " ");
    }

}
}
