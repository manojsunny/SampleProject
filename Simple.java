import java.util.*;

public class Simple {


	public static void main(String[] args) {
	
		generateMessage();

		add(45,5412);
	
	}


	public static void generateMessage() {	

		Date date = new Date();

		System.out.println(date);
	}

	public static void add(int a, int b) {	

		System.out.println("Addition : "+((a+b)));

		System.out.println(a+b);
	}
}