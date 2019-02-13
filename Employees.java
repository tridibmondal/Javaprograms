import java.util.*;
class Employee
{
 	String name;
	int empid;
	double salary;
Employee()
{
	name=null;
	empid=0;
	salary=0;
}
Employee(String n,int e,double s)
{
	name=n;
	empid=e;
	salary=s;
}

double dsal()
{
	return salary;
}
String dname()
{
	return name;
}
}
class Manager extends Employee
{
 int dept;
Manager(String n,int e,double s)
{
	name=n;
	empid=e;
	salary=s;
}
 void input()
{
 	Scanner sc=new Scanner(System.in);
	System.out.println("enter the department");
	dept= sc.nextInt();
	
}
void increase(double p)
{
	double p1=p/100.0;
	salary=salary+(salary*p1);
	System.out.println(salary);
}
void show()
{
	System.out.println("department \t" + dept);
        System.out.println("name \t" + dname());
	//System.out.println("salary \t"+ dsal());	
}
}
class Employees
{
public static void main(String args[])
{	
	String name;
	int empid,salary,p;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the name,salary,empid ");
	name=sc.next();
	empid=sc.nextInt();
	salary=sc.nextInt();
	Employee obj=new Employee(name,empid,salary);
	Manager obj1=new Manager(name,empid,salary);
        System.out.println("enter the percentage to be increased in salary \t");
	p=sc.nextInt();
	obj1.increase(p);
	obj1.input();
	obj1.show();
}
 
}




