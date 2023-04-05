package Oops;
class Overload
{
    void show (int a)
    {
       System.out.println ("a: " + a);
    }
    void show (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double show(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }
}



public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload Obj = new Overload();
        double result;
        Obj .show(10);
        Obj .show(10, 20);
        result = Obj .show(5.5);
        System.out.println("Output : " + result);
    }
		
		
	}



