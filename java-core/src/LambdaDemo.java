@FunctionalInterface
interface Hello{
	String greet();
	//this method called with instance
	default void demo() {
		System.out.println("Hello Demo" + temp());
	}
	
	//this method is called with class reference
	static void test() {
		System.out.println("Hello Test");
	}
	
	//this method is called within another method
	private String temp() {
		return "Hello Temp";
	}
}

@FunctionalInterface
interface printer{
	public void print(String name);
}


public class LambdaDemo {
	public static void main(String[] args) {
		Hello h1=()-> "Hello Lambda";
		System.out.println(h1.greet());
		
		Hello h2=()->{
			String msg="Bonjour Lambda";
			return msg;
		};
		System.out.println(h2.greet());
		
		// so basically whatever print method will get it will pass to the println known as delcation
		printer p1=(name)->System.out.println(name);
		p1.print("Anuja");
		
		
		//here we have created like whatever will get print then it will pass println 
		// because system said that whatever will come pass to this function using :: operator
		printer p2=System.out::println; //:: this operator is know as method reference
		p2.print("Patil");
		
		h1.demo();
		Hello.test();
	}
}
