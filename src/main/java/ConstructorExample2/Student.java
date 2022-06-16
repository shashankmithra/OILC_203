package ConstructorExample2;

public class Student {
    public int studentId;
    public String name;
    public String courseName;
	public int marks;
    //public String mail;
    
    //default constructor
	public Student() {
		System.out.println("default constructor");
	}
	//parameterized constructor
    public  Student(int studentId, String name, String courseName,int marks) {
    	//this(s2,"a");
    	this.studentId=studentId;
    	this.name=name;
    	this.courseName=courseName;
    	this.marks=marks;
    }
    public Student(Student s1,String grade) {
    	//this.mail=s1.mail;    ??????????????
    	//this.studentId=s1.studentId;
    	
    }
    public String grade() {
    		String result =" ";
    		if(marks>=90) {
    			result="A Grade";
    		}
    		else {
    			result="B Grade";
    		}
    		return result;
    	}
   
	public static void main(String[] args) {
		Student s1=new Student(22080,"shashank","full stack java",45);
		//Student s2=new Student();
		//s2.studentId=67;
		//s2.name="ss";
		
		System.out.println("student_id   :"+s1.studentId);
		System.out.println("student Name :"+s1.name);
		System.out.println("Course Name  :"+s1.courseName);
		System.out.println("grade        :"+s1.grade());
	}

}
