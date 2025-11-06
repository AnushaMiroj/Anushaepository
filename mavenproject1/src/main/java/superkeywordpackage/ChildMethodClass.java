package superkeywordpackage;

public class ChildMethodClass extends ParentMethodClass {

	public static void main(String[] args) {
		ChildMethodClass obj= new ChildMethodClass();
		obj.method1();

	}
public void method1()
{
	super.method1();
System.out.println("Hello");	
}

}
