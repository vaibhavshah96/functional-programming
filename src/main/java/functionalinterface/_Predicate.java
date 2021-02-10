package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
	public static void main(String[] args) {
		
		String[] pNumbers = {"07000", "09123", "071234"};
		
		for (String number : pNumbers) {
			System.out.println("Regular function:  " + isPhoneValid(number));
		}
		
		for (String number : pNumbers) {
			System.out.println("Predicate: " + isPhoneValidPredicate.test(number));
		}
		System.out.println("Predicate with 3: " + isPhoneValidPredicate.and(containsNumber3).test("07345"));
		
	}
	
	//Also BiPredicates  
	
	static Predicate<String> isPhoneValidPredicate = 
			phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length()==5 ;
			
	static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
	
	static boolean isPhoneValid(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() == 5;
	}
}
