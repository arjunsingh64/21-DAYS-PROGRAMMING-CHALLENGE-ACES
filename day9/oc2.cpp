#include<bits/stdc++.h>
using namespace std;
int main()
{
	int tc;
	cin>>tc;
	while(tc--)
	{
		long long  int days,i;
		long long int max;
		cin>>days;
		cin>>max;
		long long int arr[days];
		for(int i=0; i<days; ++i)
		cin>>arr[i];
		long long int extraTime=0;
		long long int extraWork=0;
		
		int flag=0;
		long long int sum=0;
		
		long long int ans=0;	
		for(i=0;i<days;++i)
		{
			if((arr[i]-max)>=0)
			extraWork = extraWork + (arr[i]-max);
			
			if((arr[i]-max)<0)
			extraTime = extraTime + (arr[i]-max);

			if((extraWork + extraTime)<0)
			{
				flag=1;
				break;
			}
			ans = ans + arr[i];
		}
		if(flag==1)
		cout<<(i+1)<<"\n";
		else
		cout<<(ans/max)+1<<"\n";
	}
}
