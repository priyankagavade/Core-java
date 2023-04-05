package Oops;
class FatherInfo
{
  String mb_no;
  String name;
  int age;
  public FatherInfo() 
  {
	mb_no="9134566789";
	name="Virendra";
	age=60;
   
  }
  void show()
  {
	  System.out.println("Mobile no:" +mb_no );
	  System.out.println("Name:" +name );
	  System.out.println("Age:" +age);
  }

}
class SonInfo extends FatherInfo
{
	String mb_no;
	  String name;
	  int age;
	  public SonInfo() 
	  {
		mb_no="9134566790";
		name="Ajay";
		age=30;
	   
	  }
	  void show()
	  {
		  super.show();// This will direct to parent class show method
		  System.out.println("Mobile no:" +mb_no );
		  System.out.println("Name:" +name );
		  System.out.println("Age:" +age);
	  }
}
public class SuperExample {

	public static void main(String[] args) {
		
		SonInfo s=new SonInfo();
		s.show();//This will go to child class show method
		

	}

}
