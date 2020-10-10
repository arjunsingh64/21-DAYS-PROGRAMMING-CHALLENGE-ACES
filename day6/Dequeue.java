// Deque is used to perform both LIFO and LILO


// Add element insert elements
/*


	dq.add(1)
	dq.add(2)
	dq.add(3)

	1   2   3

	dq.push(4)
	dq.push(5)

	5   4   1   2   3				

*/

import java.util.Collections;
import java.util.*;
public class Dequeue
{
	public static void main(String [] args)
	{
		Deque<String>dq = new LinkedList<>();
		dq.add("arjun");
		dq.add("bopi");
		dq.add("chatu");
		dq.add("dog");
		dq.add("elephant");
		
		for(Iterator it = dq.iterator();it.hasNext();)
		System.out.print(it.next() + " ");
		
		dq.addFirst("kalu");
			
		System.out.println();	
			
		for(Iterator it1 = dq.iterator();it1.hasNext();)
		System.out.print(it1.next() + " ");	
	
		dq.push("asdf");	

		System.out.println();			

		for(Iterator it2 = dq.iterator();it2.hasNext();)
		System.out.print(it2.next() + " ");

		dq.pop();
		System.out.println();	
		
		for(Iterator it2 = dq.iterator();it2.hasNext();)
		System.out.print(it2.next() + " ");
	
		System.out.println();

		System.out.println(dq.peek());

	}
}
