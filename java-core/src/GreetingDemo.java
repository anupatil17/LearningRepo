interface greeting{
	public void sayHello();
}
public class GreetingDemo {
	//class inside a class
	class GreetingInnerImpl implements greeting{

		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			System.out.println("Say Hello: Greeting inner impl");
		}
		
	}
	//class inside a method
	public void anotherDemo() {
		class GreetingNestedImpl implements greeting{

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Greeting inside nested impl");
			}
		};
		new GreetingNestedImpl().sayHello();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetingDemo demo=new GreetingDemo();
		greeting g1=demo.new GreetingInnerImpl();
		g1.sayHello();
		demo.anotherDemo();
		
		
		//inner anonymous class
		greeting g=new greeting() {

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Greeting from anonymous inner class");
			}};
			g.sayHello();
			
			//this is lambda expression it does not generate any class file
			greeting greet=()->System.out.println("Greeting from lambda");
			
			greet.sayHello();
	}

}
