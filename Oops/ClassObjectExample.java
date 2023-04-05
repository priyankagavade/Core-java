package Oops;

class StudentInfo
{
   int s_rollno;
   String s_name;
   double s_marks;
   StudentInfo()
   {
	   s_rollno=4;
	   s_name="priya";
	   s_marks=89.7;
   }
   void show()
   {
	   System.out.println("roll no:"+s_rollno);
	   System.out.println("name:"+s_name);
	   System.out.println("marks:"+s_marks);
	   
   }

}



public class ClassObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StudentInfo s=new StudentInfo();
       s.show();
		
		
	}

}
