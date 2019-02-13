import java.util.*;
class Player
{
String name;
String state;
void get()	
{
 Scanner obj=new Scanner(System.in);
System.out.println("enter the name");
 name=obj.next(); 
 System.out.println("enter the state");
 state=obj.next();
}
}
class Cricket extends Player
{
 int cricketid;
void details()
{
 Scanner obj=new Scanner(System.in);
 System.out.println("enter the details");
 get();
 System.out.println("enter the cricketid");    
 cricketid=obj.nextInt(); 
}
void show()
{
System.out.println("enter the name \t" +  name);
System.out.println("enter the state \t"  +  state);
System.out.println( "enter the cricketid \t" +  cricketid );
}
}
class Football extends Player
{
 int Footballid;
void details()
{
 Scanner obj=new Scanner(System.in);
 System.out.println("enter the details");
 get();
 System.out.println("enter the footballid");    
 Footballid=obj.nextInt(); 
}
void show()
{
System.out.println("enter the name \t" +  name);
System.out.println("enter the state \t"  +  state);
System.out.println( "enter the footballid \t" +  Footballid );
}
}


class Players
{
public static void main(String args[])
{
 Cricket obj=new Cricket();
Football obj1=new Football();
obj.details();
obj.show();
obj1.details();
obj1.show();
}
}