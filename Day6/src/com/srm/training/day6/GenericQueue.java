package com.srm.training.day6;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue {
	static void addQueue(Queue<Integer> q)
	{
		for (int i = 0; i < 5; i++)
            q.add(i);
		System.out.println("Elements of queue "+ q);
		
		
	}
	static void removeQueue(Queue<Integer> q)
	{
		int removedele = q.remove();
        System.out.println("removed element :"+ removedele);
  
        System.out.println(q);
	}
	static void peekQueue(Queue<Integer> q)
	{
		int head = q.peek();
        System.out.println("head of queue :"+ head);
	}
	
	public static void main(String[] args)
    {
        Queue<Integer> q= new LinkedList<>();
        addQueue(q);        
        removeQueue(q);
        peekQueue(q);
        
  
      
       
    }

}
