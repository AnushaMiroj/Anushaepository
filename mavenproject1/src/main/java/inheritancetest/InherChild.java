package inheritancetest;

public class InherChild extends InherParent{
public void test2()
{
System.out.println("test");	
}
	public static void main(String[] args) {
		
InherChild obj = new InherChild();
obj.test1();
obj.test2();

	}

}
