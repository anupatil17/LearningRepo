import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;



public class FunctionalDemo {
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		
		System.out.println("       Consumer:");
		Consumer<String>c =(s)->System.out.println(s);
		
		c.accept("Adios");
		
		Consumer<String>c1=System.out::println;
		c1.accept("Heloo");
		c1.accept("Hola");
		c1.accept("Bonjour");
		
		Consumer<String> c2= FunctionalDemo::print;
		c2.accept("Aloha");
		
		System.out.println("       Supplier:");
		Supplier<String>s1=()->"Anuja";
		System.out.println(s1.get());
		print(s1.get());
		
		Supplier<Double> random=()->Math.random();
		System.out.println(random.get());
		
		System.out.println("       Predicate:");
		Predicate<Integer> nonNegative=(x)->x>=0;
		System.out.println(nonNegative.test(3));
		System.out.println(nonNegative.test(-2));
		
		Predicate<Integer> isEven=(x)->x%2==0;
		System.out.println(isEven.test(29));
		
		System.out.println("       BiPredicate:");
		BiPredicate<String,String>contains = (str,con)->str.contains(con);
		System.out.println(contains.test("Mumbai", "U"));
		
		System.out.println("       Function:");
		Function<Integer,Integer>square =(x)-> x*x;
		System.out.println(square.apply(29));
		
		System.out.println("       BiFunction:");
		BiFunction<Integer,Integer,Integer>greater=(a,b)->a>b?a:b;
		System.out.println(greater.apply(10, 20));
	}

}
