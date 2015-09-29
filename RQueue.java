/*
 * RQueue<E> class
 * Alex Olson
 * Data Structures: CS 201
 * 23 April 2015
 * 
 * This class implements the QueueInt<E> interface. 
 * Has methods to add(item), peak, display and remove
 * This is a recursive implementation of a queue.
 *
 */


public class RQueue<E> implements QueueInt<E>
{
    private E front;
    private E back;
    private RQueue<E> inside;

    // Constructor of empty RQueue
    public RQueue()
    {
	front = null;
	inside = null;
	back = null;	
    }

    // Add item to the queue
    public void offer(E item)
    {
	// if queue empty
	if (front == null)
	    {
		front = item;
	    }

	// if queue has one item
	else if (back == null)
	    {
		back = item;
	    }

	// if queue has two items, make inside refer to new queue
	// place item in correct spot
	else
	    {
		E oldBack = back;
		back = item;
		if (inside == null)
		    {
			inside = new RQueue<E>();
		    }
		inside.offer(oldBack);
	    }
    }

    // Return next item to come out of queue, without changing it.
    // If the queue is empty, return null
    public E peek()
    {
	if (front != null)
	    {
		return front;
	    }
	else
	    {
		return null;
	    }
    }

    
    // Prints the contents of the queue to the screen
    public void display()
    {
	// print null if queue is empty
	if (front == null)
	    {
		System.out.println("null");
	    }

	// if queue contains one item, print front
	else if (back == null)
	    {
		System.out.println(front);
	    }


	// if nothing inside queue, print front and back
	else if (inside == null)
	    {
		System.out.println(front);
		System.out.println(back);

	    }

	// recursively print queue
	else
	    {
		System.out.println(front);     // print front item
		inside.display();              // print inside queue
		System.out.println(back);      // print back of queue after inside prints
	    }
    }

    
    // Remove the next item from the queue. Return true unless the
    // queue is empty; if it is empty when you try to remove(), return false
    public boolean remove()
    {
	
        // condition if queue is empty
	if (front == null)
	    {
		System.out.println("The list is already empty");
		return false;
	    }

	// if queue contains an inside, shift second to front to front
	else if (inside != null)
	    {
		front = inside.front;


		// recursively call remove if inside has more than three values
		if (inside.inside != null)
		    {
			inside.remove();
		    }


		// if inside's inside is null
		else if (inside.inside == null)
		    {
			// make inside null since nothing should be left inside
			if (inside.back == null)
			    {
				inside = null;
			    }

			// shift values in innermost queue if it had two items previously
			else
			    {
				inside.front = inside.back;
				inside.back = null;
			    }
		    }
	    }

	else
	    {
		// empty queue if there is one item remaining
		if (back == null)
		    {
			front = null;
		    }

		// if two items in queue, remove first, and shift second to first
		else
		    {
			front = back;
			back  = null;
		    }
	    }

	// returns true if an item was successfully removed
	return true;
    }

}
