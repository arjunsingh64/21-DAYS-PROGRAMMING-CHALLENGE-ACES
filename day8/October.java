import java.util.*;
import java.util.Scanner;
import java.util.Collections;
public class October
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0)
		{
			Vector<Integer> v = new Vector<Integer>();
			int N,X,P,K;
			N = sc.nextInt();
			X = sc.nextInt();
			P = sc.nextInt();
			K = sc.nextInt();
		
			for(int i=0;i<N;++i)
			{
				int elem = sc.nextInt();
				v.add(elem);				
			}
			Collections.sort(v);
			int flag=0;
			int oper=0;
	
			int kth = K-1;	
			int XPos = v.indexOf(X);
			if(XPos == -1)
			{
				v.setElementAt(X,kth);
				++oper;
			}
			Collections.sort(v);	 
			int a;

			if(K>P)
			{
				if(X<v.get(P-1))
				{
					a = v.lastIndexOf(X)+1;
					oper = oper + Math.abs(a-P);
					System.out.println(oper);
				}else if(X==v.get(P-1))
				{
					System.out.println(0+oper);
				}else if(X>v.get(P-1))
				{
					System.out.println(-1);
				}
			}else if(P>K)
			{
				if(X<v.get(P-1))
				{
					System.out.println(-1);
				}else if(X==v.get(P-1))
				{
					System.out.println(0+oper);
				}else if(X>v.get(P-1))
				{
				        a = v.indexOf(X)+1;
					oper = oper + Math.abs(a-P);
					System.out.println(oper);
				}
			}else if(P==K)
			{
				if(X<v.get(P-1) || X>v.get(P-1))
				{
					a = v.lastIndexOf(X)+1;
					oper = oper + Math.abs(a-P);
					System.out.println(oper);
				}else if(X==v.get(P-1))
				{
					System.out.println(0+oper);
				}
			}

 		}
	}
}
	
