
public class Car {
	private String model;
	private String[] features;
	//var-agrs: these are the arguments at the last 
	public Car(String model, String...features) {
		super();
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Model Name: "+ model);
		
		for(String fr:features) {
			System.out.println(fr);
		}
	}
	public static void main(String[] args) {
		
		Car c=new Car("BMW","Blue","Green");
		
		c.specs();
		
	}
}
