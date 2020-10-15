#include<bits/stdc++.h>
using namespace std;
int main()
{
	int tc;
	cin>>tc;
	int city,jump,virus,prsnt;
	while(tc--)
	{
		cin>>city>>jump>>virus>>prsnt;
		int trck = virus;		
		int chng,flag=0;
		do
		{
			chng = (jump+virus)%city;
			if(chng==prsnt)
			{
				flag=1;			
			}
			virus = chng;
		}while(trck!=chng);
		
		if(flag==1)
		cout<<"YES\n";
		else
		cout<<"NO\n";
	}
}
