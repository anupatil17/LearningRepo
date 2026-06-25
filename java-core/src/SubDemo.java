class SubDemo<T,P> extends Demo<T>{
	private P temp;
	
	public SubDemo(T data,P temp) {
		super(data);
		this.temp=temp;
	}
	public P getTemp() {
		return temp;
	}
	public void setTemp(P temp) {
		this.temp = temp;
	}
	public static void main(String[] args) {
		SubDemo<String,Integer> sd=new SubDemo<String,Integer>("Ana",45);
		System.out.println(sd.getData()+"\t"+sd.getTemp());
		
		SubDemo<Integer, Person>s2=new SubDemo<Integer, Person>(99,new Person("Tina",34));
		System.out.println(s2.getData()+"\t"+s2.getTemp());
	}	
}
