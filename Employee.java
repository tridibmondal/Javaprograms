class Employee
{
 	String name;
	int empid;
	int salary;
Employee()
{
	name=null;
	empid=0;
	salary=0;
}
Employee(String n,int e,int s)
{
	name=n;
	empid=e;
	salary=s;
}
void increase(int p)
{
	salary=salary+salary*(p/100);
}
void display()
{
	System.out.println("the salary is \t" + salary);
}
}
class Manager extends Employee
{
 int dept;
void input()
{
 	Scanner sc=new Scanner(System.in);
	dept=nextInt();
	System.out.println("enter the department")
}
void show()
{
	System.out.println("department \t" + dept);	
}
}
class Employees
{
public static void main(String args[])
{
	Employee obj=new Employee(System.in);
	Manager obj1=new Manager(System.in);
	obj.increase();
	obj.display();
	obj1.input();
	obj1.show();
}
 
}




