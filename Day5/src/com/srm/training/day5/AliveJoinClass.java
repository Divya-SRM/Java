package com.srm.training.day5;

public class AliveJoinClass extends Thread {
    public void run()
    {
        System.out.println(Thread.currentThread()+": Java ");
        try {
            Thread.sleep(300);
            
        }
        catch (InterruptedException ie) {
        }
        System.out.println(Thread.currentThread()+" : Training ");
    }
    public static void main(String[] args)
    {
    	Thread c1 = new AliveJoinClass();
    	Thread c2 = new AliveJoinClass();
    	c1.setName("C1");
    	c2.setName("C2");
    	c1.start();    	
    	System.out.println("C1 Alive:"+c1.isAlive());
        System.out.println("C2 Alive: "+c2.isAlive());
    	  
        try {
            c1.join(); // Waiting for c1 to finish
        }
        catch (InterruptedException ie) {
        }
        c2.start();
        System.out.println("C1 Alive: "+c1.isAlive());
        System.out.println("C2 Alive: "+c2.isAlive());
    }
}
 