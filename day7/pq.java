

import java.util.*;
public class pq
{
	public static void main(String [] args)
	{

		Comparator<String> sorting = new Comparator<String>()
		{
			public int compare(String s1,String s2)
			{
				return s1.length() - s2.length();
			}
		};

		PriorityQueue<String>pq = new PriorityQueue<>(sorting);
		pq.add("Lisa");
        	pq.add("Robert");
       		pq.add("John");
        	pq.add("Chris");
        	pq.add("Angelina");
        	pq.add("Joe");
	//	pq.add("arjun");


		  while (!pq.isEmpty()) 
		{
		            System.out.println(pq.remove());
	        }
			
	}
}

