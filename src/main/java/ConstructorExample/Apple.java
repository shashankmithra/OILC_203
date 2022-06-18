package ConstructorExample;

public class Apple {
     // instance variables
	public int student_id;
	public int age;
	public String name;
	public String grade;
	//default constructor
	public Apple() {
		System.out.println("default constructor");
		
	}
	//parameterized constructor
	public Apple(int student_id,int age,String name) {
		this.student_id=student_id;
		this.age=age;
		this.name=name;
		
	}
	public Apple(Apple a,String grade) {
	    this.student_id=a.student_id;
		this.age=a.age;
		this.name=a.name;
		grade="a";
		System.out.println(a.age+" ");
		
	}

	public static void main(String[] args) {
		Apple a =new Apple(22082,25,"shashank");
		System.out.println("Studentid :"+a.student_id);
		System.out.println("Age       :"+a.age);
		System.out.println("Name      :"+a.name);
	}

}
