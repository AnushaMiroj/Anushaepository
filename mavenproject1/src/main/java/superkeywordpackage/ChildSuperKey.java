package superkeywordpackage;

public class ChildSuperKey extends ParentSuperKey
{
int x=50;

	public static void main(String[] args) {
		ChildSuperKey obj = new ChildSuperKey();
		obj.methodone();
				

	}
public void methodone()
{
System.out.println(x);
System.out.println(super.x);
}
	
	
}
