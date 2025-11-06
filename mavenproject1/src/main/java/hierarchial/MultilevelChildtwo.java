package hierarchial;

public class MultilevelChildtwo extends MultilevelChildone{

	public static void main(String[] args) {
		MultilevelChildtwo obj = new MultilevelChildtwo();
		obj.methodone();
		obj.methodtwo();
		obj.methodthree();
		

	}
public void methodthree()
{
	System.out.println("evening");
}
}
