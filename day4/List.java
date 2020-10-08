// public abstract interface List extends Collections  
// ArrayList Class implements -------> List (interface) extends ----------> Collection
// Difference between Collection and COllections  ----> Collection is an interface (set,list,maps)-----> Collections is a Class (sort)
//1) public void addFirst(E e)
//2) public void addLast(E e)
import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
public class List
{
	public static void main(String [] args)
	{
		ArrayList <String> li = new ArrayList<>();
		
		li.add("a");
		li.add("e");
		li.add("b");
		li.add("c");
	
		//Iterating
		for(Iterator it = li.iterator(); it.hasNext();)
		{
			System.out.println(it.next());		
		}

		// printing a particular element
		System.out.println("ELement at index 1 : " + li.get(1));

		// Adding eleent to the specified position
		li.add(4,"d");
		// After Sorting the list
		Collections.sort(li);
		System.out.println(li);
		// After removing e from the list (index starts from 0)
		li.remove(4);
		li.remove("c");
		System.out.println(li);	
		// Contains in linked list
		if(li.contains("a"))
		{
			li.remove("a");		
		}
		System.out.println(li);		
		// Set the element
		li.set(1,"1");			// (arrayIndex,element)
		System.out.println(li);
		// Using get function to get the output
		for(int i=0;i<li.size();++i)
		{
			System.out.println(li.get(i));
		}
		for(String E:li)
		System.out.print(E + " ");
		// indexOf to get the index of elements
		System.out.println(li.indexOf("b"));	
		li.add("1");	
		System.out.println(li);	
		System.out.println(li.lastIndexOf("1"));
		
		Set<String>se = new HashSet<>(li);
		for (String s : se) 
            	System.out.println(s + ": " + Collections.frequency(li, s));	
		
		System.out.println(Collections.frequency(li,"1"));

		// Check whether two list are equal or not
		ArrayList <String> li3 = new ArrayList<>();
		
		li3.add("a");
		li3.add("e");
		li3.add("b");
		li3.add("c");

		ArrayList <String> li4 = new ArrayList<>();
		
		li4.add("a");
		li4.add("x");
		li4.add("b");
		li4.add("h");
			
		System.out.println(li4.equals(li3));
		// retainAll in JAVA
		li4.retainAll(li3);
		System.out.println("li3  " +li3);
		System.out.println("li4  " + li4);
		// LIST ITERATOR

		ArrayList <String> lis = new ArrayList<>();
		
		lis.add("ar");
		lis.add("es");
		lis.add("bs");
		lis.add("ca");
		lis.add("aw");
		lis.add("cb");
		lis.add("aqq");
		lis.add("aa");
		System.out.println("length : "+lis.size());
		ListIterator<String> l  = lis.listIterator(1);
		while(l.hasNext())
		{
			System.out.print(l.next()+" ");		
		}
		System.out.print("\n");
		//CONCEPT OF SUBLIST      lis.subLIst(from this Index,TO this Index);		
		System.out.println("Sublist : " + lis.subList(3,lis.size()-1));
		
		// Capacity of arrluist   trimTosize();
		
		ArrayList<Integer> Numbers = new ArrayList<Integer>(); 
  

		// USE OF NEW CONCEPT removeif this condition is true
		//Returns: This method returns True if predicate returns true and we are able to remove elements.

        // Add Number to list 
     		   Numbers.add(23); 
   		     Numbers.add(32); 
   		     Numbers.add(45); 
     		   Numbers.add(63); 
			
		   Numbers.removeIf(n -> (n%3==0));
		
			    for (int i : Numbers) 
            			System.out.println(i); 	

			    ArrayList<String> students = new ArrayList<String>(); 
  
        // Add Strings to list 
        // each string represents student name 
        students.add("Ram"); 
        students.add("Mohan"); 
        students.add("Sohan"); 
        students.add("Rabi"); 
        students.add("Shabbir"); 
  
        // apply removeIf() method 
        // we are going to remove names 
        // start with S 
        students.removeIf(n -> (n.charAt(0) == 'S')); 
	 for (String str : students)  
            System.out.println(str); 	


	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		LinkedList <String> ll = new LinkedList<String>();
		
		ll.add("first");
		ll.add("second");
		ll.add("third");
		ll.add("fourth");
		ll.add("fifth");
		ll.add("sixth");
		ll.add("seventh");

		System.out.println("First element in list : " + ll.peek());
		System.out.println("First element in list Return null if list is Empty  : " + ll.peekFirst());
		System.out.println("last element in list : " + ll.peekLast());















		}

}
