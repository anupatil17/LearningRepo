class Alfa{
	public Alfa() {
		System.out.println("This is Alfa constructor");
	}
	public void demo() {
		System.out.println("This is Alfa demo");
	}
}
class Beta extends Alfa{
	public Beta() {
		System.out.println("This is Beta constructor");
	}
	public void demo() {
		System.out.println("This is Beta demo");
	}
}
public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//parent class
		Alfa a=new Alfa();
		a.demo();
		
		//child class
		Beta b=new Beta();
		b.demo();
		
		// Up casting 
		Alfa ab=b;
		ab.demo();
		
		// Down casting
		Beta bt= (Beta) ab;
		bt.demo();
		
	}

}
