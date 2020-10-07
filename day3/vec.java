// Vector Concept Explained  vector <Integer>v = new vector<>();
// for each loop should be used in cased of nested loops
// Iterator concept is used when you want to change or modify the collections
// Double Brace Initalization
// LinkedHashSet is used to get the element in the insertion ordwe


import java.util.*;
//import java.util.Scanner;
import java.util.HashSet; 
import java.util.Set; 
public class vector
{
	public static void main(String [] args)
	{
		//Scanner sc = new Scanner(System.in);	
	/*	
		Vector <Integer> v = new Vector<Integer>();
		for(int i=0;i<5;++i)
		{
			v.add(sc.nextInt());
		}
	
		// Using for each loop
		for(int e:v)
		System.out.println(e);	
		// Using Iterators
		for(Iterator it = v.iterator();it.hasNext();)
		{
			System.out.println(it.next());
		}	
	*/

		
		Set<String>s = new LinkedHashSet<String>()
		{
			{
				add("arjun");
				add("singh");
				add("rajput");		
			}
		};

	// Using List to sort the set elements
		List<String> li = new ArrayList<String>(s);
		Collections.sort(li);
		for(String d:li)
		System.out.println(d);


/////////////////////////////   DOUBLE BRACE INITIALIZATION ////////////////////////////////////

	//	Iterator it = new iterator();
		for(Iterator it = s.iterator(); it.hasNext();)
		{
			System.out.println(it.next());
		}
	
		for(String e : s)
		System.out.println(e);
		//System.out.println(s);	
	}
}
