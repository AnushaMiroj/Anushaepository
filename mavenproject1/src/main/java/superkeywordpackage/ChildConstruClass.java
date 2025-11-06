package superkeywordpackage;

public class ChildConstruClass extends ParentConstruClass{

	public static void main(String[] args) {
		ChildConstruClass obj = new ChildConstruClass();
		

	}

	public ChildConstruClass()
	{
		super();    //parent constructor has parameter, give value inside the ()
		System.out.println("to UK");
	}
}
