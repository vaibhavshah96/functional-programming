package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	public static void main(String[] args) {
		
		int increment = incrementByOne(0);
		System.out.println("Regular function: " + increment);
		
		int increment2 = incrementBy1.apply(2);
		System.out.println(increment2);
		
		int multiply = multiplyBy10.apply(increment2);
		System.out.println(multiply);
		
		 Function<Integer, Integer> incrementThenMultiply = incrementBy1.andThen(multiplyBy10);
		 System.out.println("andThen: " + incrementThenMultiply.apply(4));
		 
		 int resultBiFunction = incrementThenMultBiFunction.apply(2,10);
		 System.out.println("BiFunction: " + resultBiFunction);
	}
	
	static Function<Integer, Integer> incrementBy1 = number -> ++number;
	
	static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
	
	static int incrementByOne(int number) {
		return number + 1;
	}
	
	static BiFunction<Integer, Integer, Integer> incrementThenMultBiFunction = 
			(numberToIncrement, numToMultiply) -> (++numberToIncrement) * numToMultiply;
			
	static int incrementThenMultiply(int number, int numToMultiply) {
		return (number + 1) * numToMultiply;
	}
	
	
}
