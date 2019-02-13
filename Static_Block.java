public class Static_Block
 {
  private static int x=10;
int y=5;
static
 {
   System.out.println(x);

 }
Static_Block()
{
	System.out.println(y);
}
public static void main(String args[])
{
 new Static_Block();
new Static_Block();

 }
}