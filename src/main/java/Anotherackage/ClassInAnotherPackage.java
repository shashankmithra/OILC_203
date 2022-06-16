package Anotherackage;

import AccessModifiers.*;

public class ClassInAnotherPackage extends Shashi {

	public static void main(String[] args) {
		ClassInAnotherPackage s3=new ClassInAnotherPackage();
	       s3.uni(10, 20);
	       
	      // s3.slice("shashi"); // private method is not accessible in another class or in another package
	       
	       s3.oneplus(); //protected method is accessible in another package only if there is relationship(Inheritance)
	       
	      // s3.mani(); // default method is accessible with in the package
	       

	}

}
