package complex;

import java.util.Scanner;

class complex
{
int real,imag;
void complex() //default constructor
{ real=imag=0;
}


	void accept()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter real no.");
		real=Sc.nextInt();
		System.out.println("enter imaginary no.");
		imag=Sc.nextInt();
	}

void display()
{
 System.out.println("complex no. is"+real+"+"+imag+"i");
}
void add(complex c1,complex c2)
{
	real=c1.real+c2.real;
	imag=c1.imag+c2.imag;
	System.out.println("addition of two complex no. is " +real+ "+i" +imag);
}
void sub(complex c1,complex c2)
{
	real=c1.real-c2.real;
	imag=c1.imag-c2.imag;
	System.out.println("Subtraction of two complex nos is" +real+ "+i" +(imag));
}
void mul(complex c1,complex c2)
{
real=c1.real*c2.real;
imag=c1.imag*c2.imag;
System.out.println("multiplication of two complex no. is"+real+"i"+imag);
}
void div(complex c1,complex c2)
{ real=c1.real/c2.imag;
//imag=c1.imag/c2.imag;
System.out.println("division of two complex no. is"+real+"i"+imag);
}
}
public class complex1
{
public static void main(String[] args)
{
	int ch;
	
	Scanner Sc=new Scanner(System.in);
	complex c1=new complex();
	complex c2=new complex();
	complex c3=new complex();
	complex c4=new complex();
	complex c5=new complex();
	complex c6=new complex();
	c1.accept();
	c2.accept();
	c1.display();
	c2.display();
	c3.add(c1,c2);
	c4.sub(c1,c2);
	c5.mul(c1,c2);
	c6.div(c1,c2);
	System.out.println("enter your choice");
	System.out.println("1.add 2.sub 3.mul 4.div");
	ch=Sc.nextInt();
	switch(ch)
	{
	case 1:System.out.println("addition");
	c1.accept();
	c2.accept();
	c1.display();
	c2.display();
	c3.add(c1,c2);
	break;
	case 2 : System.out.println("sutraction");
	c1.accept();
	c1.display();
	c2.accept();
	c2.display();
	c3.sub(c1,c2);
	case 3 :System.out.println("multiplication");
	c1.accept();
	c2.accept();
	c1.display();
	c2.display();
	c3.mul(c1,c2);
	break;
	case 4 :System.out.println("division");
	c1.accept();
	c2.accept();
	c1.display();
	c2.display();
	c3.div(c1,c2);
	break;
	}
}
}



