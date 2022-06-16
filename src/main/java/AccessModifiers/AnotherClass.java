package AccessModifiers;

public class AnotherClass {

	public static void main(String[] args) {
		 Shashi s2=new Shashi();
	       s2.uni(10, 20);
	      // s2.slice("shashi"); // private method is not accessible in another class or in another package
	       s2.oneplus();
	       s2.mani();

	}

}
