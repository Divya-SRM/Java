package com.srm.training.day6;

import java.util.Stack;

public class GenericClass {
	static void stack_push(Stack<Integer> stack)
    {
		System.out.println("Push Operation");
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
            
        }
        System.out.println(stack);
    }
      
   
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");
  
        for(int i = 0; i < 3; i++)
        {
            Integer y = (Integer) stack.pop();
            
        }
        System.out.println(stack);
    }
  
   
    
  
  
    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack);
        
    }

}
