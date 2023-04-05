package Oops;

class Student
{
	int roll_no;
	String name;
	int x;
	String y;
	
	//default constructor
	/*Student()
	{
		roll_no=10;
		name="priya";
		
	}*/
	//Parameterized constructor
	Student(int x,String y)
	{
		roll_no=x;
		name=y;
	}
	//copy Constructor
	void show()
	{
		System.out.println(roll_no);
		System.out.println(name);
	}


}
public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student(100,"priya");
		s.show();
		
		
		
	}

}
