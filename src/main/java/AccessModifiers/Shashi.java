package AccessModifiers;

public class Shashi {
	public static int uni(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	
	}

	private static String slice(String name) {
		System.out.println(name);
		return name;
		
		
	}
		protected static void oneplus() {
			String s="apple";
			System.out.println(s);
		}
		static void mani()
		{
			int a=10;
			System.out.println(a);
		}
	public static void main(String[] args) {
//       Shashi s1=new Shashi();
       uni(10, 20);
       slice("shashi");
       oneplus();
  
	}

}
