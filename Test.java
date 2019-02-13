class Test
{
	void Display()
	{
		Show();
		System.out.println("insisde display function");
	}
	void Show()
	{
		System.out.println("show display function");
	}
	public static void main(String args[])
	{
		Test t1=new Test();
		t1.Display();	
	}
}

