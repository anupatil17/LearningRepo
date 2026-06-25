
public class StringDemo {
 public static void main(String[] args) {
	String s1="Hello";
	String s2=new String("Hello");
	String s3="Hello";
	
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	
	s1=s1+" world";
	
	System.out.println(s1);
	
	String name="Anuja";
	String nameRegex="[A-Z]{1}[a-z]{3}";
	System.out.println(name.matches(nameRegex));
	
	String phono="9960142742";
	String phonoRegex="[6-9]{1}[0-9]{9}";
	
	System.out.println(phono.matches(phonoRegex));
	
	String email="patilanuja127@gmail.com";
	String emailRegex="^[a-z0-9_]+@+[a-z]{2,}\\.+[a-z]{2,}$";
	System.out.println(email.matches(emailRegex));
}
}
