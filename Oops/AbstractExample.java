package Oops;

import Oops.MyClass;
import Oops.Square;
import Oops.SquareRoot;

abstract class MyClass
{
	
  abstract void calculate(double x);

}
class Square extends MyClass
{
  void calculate(double x)
  {
	  System.out.println("square: "+(x*x));
  }

}
class SquareRoot extends MyClass
{
  void calculate(double x)
  {
	  System.out.println("squareroot is : "+Math.sqrt(x));
  }

}

public class AbstractExample {

	public static void main(String args[]) {
		
		Square obj1=new Square();
		obj1.calculate(5);
		SquareRoot obj2=new SquareRoot();
		obj2.calculate(16);
		MyClass reference;
		reference=obj1;
		obj1.calculate(6);
		
		
	}
	
	
}
