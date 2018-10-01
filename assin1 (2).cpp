//============================================================================
// Name        : assin1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
class guests
{
	int n;
public:
	void accept();
	void display();
	void combination();
};
void guests::accept()
{
	cout<<"enter the number of guest:";
	cin>>n;
}
void guests::display()
{
 int i,j,f1=1,f2=1;
 cout<<"the total number of handshakes are:";
 for(i=n;i<=n&&;i!=0;i--)
 {
	 f1=f1*i
}
 for(j=n-2;j<=2&&j!=0;j--)
 {
	 f2=f2*j;

 }
 cout<<""<<(f1/(2*f2));
}
void guests::combination()
{
	int i,j;
	char a='A',b='B';
	cout<<"\n combination are:";
	for(i=n-1;i>=1;i++)
	{
		cout<<endl<<a<<"with"<<b;
		b++;
	}
	a++;
	b=a+1;

}
}
void main()
{
	guests g;
	g.accept();
	g.display();
	g.combination();
}


}



