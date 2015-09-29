/*
 * queueTester.java
 * Alex Olson
 * Data Structures: CS 201
 * 23 April 2015
 * 
 * This is a tester class that tests the methods
 * of the RQueue class
 *
 */

public class queueTester
{
    public static void main(String[] args)
    {
	RQueue<String> list = new RQueue<String>();
	
	list.offer("bob");
	list.offer("mary");
	list.offer("soren");
	list.offer("alex");

	System.out.println("The people in your queue are:");
	list.display();
	
	list.offer("lewis");
	list.offer("zoe");
	list.offer("kate");
	list.offer("billy");
	list.remove();
	list.remove();
	list.remove();

	System.out.println("bob, mary and soren were removed.");
	System.out.print("The person on top of the queue is now: ");
	System.out.println(list.peek());

	System.out.println("The people in your queue are:");
	list.display();

    }
}
