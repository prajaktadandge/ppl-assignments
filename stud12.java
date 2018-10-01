package student12;
import java.util.Scanner;
class result
{
	int rollno;
	String name;
	String emailid;
	int m1,m2,m3,total,percentage;
	String grade;
	result(){
		rollno=0;
		name="";
		emailid="";
		m1=0;
		m2=0;
		m3=0;
		percentage=0;
		grade="";
		
	}
	result(int rno,String nm,String eid,int marks1,int marks2,int marks3)
	{
		rollno=rno;
		name=nm;
		emailid=eid;
		m1=marks1;
		m2=marks2;
		m3=marks3;
	
	}
	void display()
	{
		
	System.out.println("rollno="+rollno);
	System.out.println("name="+name);
	System.out.println("emailid="+emailid);
	System.out.println("marks1="+m1);
	System.out.println("marks2="+m2);
	System.out.println("marks3="+m3);
	System.out.println("total="+total);
	System.out.println("per="+percentage);
	
	}
	void calculate() {
		total=m1+m2+m3;
		percentage=total/3;
	}
	void grade() {
		if(percentage>=90)
		{
			System.out.println("grade is A");
		}
		else if(percentage<=89&&percentage>=59)
		{
			System.out.println("grade is B");
		}
		else if(percentage<=58&&percentage>=48)
		{
			System.out.println("grade is c");
			
		}
		else {
			System.out.println("grade is fail");
		}
		
	}
	
		
	
	
}

public class stud12{
	public static void main(String[] args) {
		int a,j;
	Scanner SC=new Scanner(System.in);
	System.out.println("enter no of students");
	int n=SC.nextInt();
	result r[]=new result[n];
	for(int i=0;i<n;i++)
	{
		
				System.out.println("enter roll no");
		int rollno=SC.nextInt();
		System.out.println("enter string");
		String name=SC.next();
		System.out.println("enter emailid");
		String emailid=SC.next();
		System.out.println("enter marks of 3 subjects");
		int marks1=SC.nextInt();
		int marks2=SC.nextInt();
		int marks3=SC.nextInt();
		r[i]=new result(rollno,name,emailid,marks1,marks2,marks3);
		r[i].calculate();
		r[i].display();
		r[i].grade();
		
		
					
	}
	
	for(int i=0;i<n+1;i++)
	{
		if(r[i].percentage>r[i+1].percentage)
		{
			a=r[i].percentage;
			j=i;
		}
		else {
			a=r[i+1].percentage;
			j=i+1;
		}
		System.out.println("top student is"+(j+1));
		r[j].display();
		
	}
	
	
	
	
	
	
	
	
	

		// TODO Auto-generated method stub

	}

}