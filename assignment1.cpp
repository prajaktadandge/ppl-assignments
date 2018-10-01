//============================================================================
// Name        : assignment1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
class permutation
 {int n,r;
public:
	int fact(int num);
	void permut();
	void comb();
 };
int permutation::fact(int num){int f=1;
for(int i=1;i<=num;i++)
f=f*i;
return f;
}
void permutation::permut()
{
int npr;
cout<<"\n enter n & r"<<endl;
cin>>n>>r;
npr=fact(n)/fact(n-r);
cout<<"npr="<<npr;
}
void permutation::comb()
{
int ncr;
cout<<"\n enter n & r"<<endl;
cin>>n>>r;
ncr=fact(n)/(fact(r)*fact(n-r));
cout<<"ncr="<<ncr;
}
int ways()
{permutation p;
p.permut();
p.comb();
ways();
return 0;
}
int main()
{int no;
cout<<"\n number of people";
cin>>no;
for(int i=1;i<=no;i++)
{
	for(int x=i+1;x<=no;x++)
	{
		cout<<"\n"<<i<<"shakes hand with"<<x;
	}
}


}









