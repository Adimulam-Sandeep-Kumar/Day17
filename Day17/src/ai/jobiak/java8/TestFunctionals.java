package ai.jobiak.java8;

import java.util.function.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class TestFunctionals {

	public static void main(String[] args) {
		
		Function<String,Integer>lengthFunction = (String str)->{return str.length();};
		Function<String,Integer>lengthFunction2 = (String str)->{return str.length()/2;};
		
		int result = lengthFunction.apply("Jobiak.com");
		System.out.println(result);
		
		//ArrayList
		ArrayList<String>fruits = new ArrayList<>();
		fruits.add("Mango ");fruits.add("Gauva");fruits.add("Orange");fruits.add("Grapes");fruits.add("Pineapple");
		
		List<Integer>lengthList = methodHalfLength(fruits,lengthFunction2);
		System.out.println(lengthList);
		

		//Predicate
		Predicate<Boolean> predicate = (Boolean)->{return 10>45;};
		System.out.println(predicate.test(true));
		
		//Consumer
		Consumer<String> consumer = (String str)->{System.out.println(str);};
		consumer.accept("ai.jobiak");
		
		//Supplier
		Supplier<Double>supplier = ()->Math.random();
		System.out.println(supplier.get());
		
		Supplier<Integer>supplier2 = ()->3*4*5;
		System.out.println(supplier2.get());
		
		//UnaryOperator
		UnaryOperator<String> unaryOperator  = (String str)->{return str +".txt";};
		String newText = unaryOperator.apply("Sandeep");
		System.out.println(newText);
		
	}
	
	static List<Integer> methodHalfLength(ArrayList<String>list,Function<String,Integer>functionParam){
		
		ArrayList<Integer>intList=new ArrayList<>();
		for(String str : list) {
			
			int length = functionParam.apply(str);
			intList.add(length);
		}
		return intList;
		
	} 

}

  
//Functions we apply()

//for predicate we have test()
//for consumer we have accept()
// for supplier we have get()
