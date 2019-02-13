 class Animal 
{
    public static void testClassMethod() 
	{
        System.out.println("The static method in Animal");
    	}
    public void testInstanceMethod() 
    {
        System.out.println("The instance method in Animal");
    }
}

 class Cat extends Animal 
{
    public static void testClassMethod() 
    {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() 
    {
        System.out.println("The instance method in Cat");
    }
  }
 public class Ex
 {
    public static void main(String[] args) 
	{
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Cat.testClassMethod();
        myAnimal.testInstanceMethod();
    	}
}
