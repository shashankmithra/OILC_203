package ConstructorExample2;

class Parent {

	Parent() {

		System.out.println("parent default constructor");
	}

	Parent(int i) {
		this();
		System.out.println("parent parameterized constructor");
	}
}

class Child extends Parent {
	Child() {
		this(10);
		System.out.println("child deafault consructor");
	}

	Child(int j) {
		super(20);
		System.out.println("child parameterized constructor");
	}
}

public class ThisAndSuperSample {

	public static void main(String[] args) {
		Child c = new Child();

	}

}
