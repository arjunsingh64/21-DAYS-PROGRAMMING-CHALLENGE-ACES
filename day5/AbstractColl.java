// Concept clear of all methods present in AbstractCollection
// 1) add it insert the element in the collection
// 2) addAll() if you want to insert the whole collection
// 3) contains() check whether the given element is present in the collection or not
// 4) isEmpty() returns true if the collection has zero elements
// 5) hasNext() returns true if elements present in collection
// 6) next() returns the elements
// 7) Iterator it = ab.iterator() iterator retuens the object through which you can iterate
// 8) size() to check the size of the collection
// 9) toArray() make an new array 
// 10) toString() Used to print the array

import java.util.*;
import java.util.AbstractCollection;
public class AbstractColl
{
	public static void main(String [] args)
	{
		AbstractCollection<Object> abs = new ArrayList<Object>();
		abs.add("Welcome");
		abs.add("in");
		abs.add("learning");
		abs.add("collection");
		abs.add("frameworks");
		System.out.println(abs);	

		AbstractCollection<Object> abs2 = new TreeSet<Object>();
		abs2.addAll(abs);
		System.out.println("AbstractCollection 2: "
                           + abs2); 

		abs.clear();
		System.out.println("AbstractCollection 1: "
                           + abs); 

		if(abs2.contains("bhal"))
		{
			System.out.println("Elements Present In Collections");
		}else
		{
			System.out.println("Not Present");
		}

		AbstractCollection<Object> abs3 = new ArrayList<Object>();
		abs3.add("Welcome");
		abs3.add("in");
		abs3.add("learning");
		System.out.println(abs3.containsAll(abs2));		// as abs3 didnt contain all elements therefore it false
		
		if(abs.isEmpty())
		{
			System.out.println("Abs is Empty");
		}

		Iterator it = abs3.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		abs3.remove("learning");
		System.out.println("AbstractCollection 3: "
                           + abs3); 

		System.out.println("Size: "
                           + abs3.size()); 
		
		int siz = abs3.size();		

		String [] arry = new String[siz];
		arry = abs3.toArray(arry);
		
		for (int j = 0; j < arry.length; j++) 
            	System.out.println(arry[j]); 

		System.out.println(abs2.toString()); 
	}
}
