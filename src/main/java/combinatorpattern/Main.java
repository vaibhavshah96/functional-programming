package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(
				"Vaibhav", "vaib@gmail.com", "+02676849477", LocalDate.of(2020, 9, 05)
				);
		
//		System.out.println(new CustomerValidatorService().isValid(customer));
		
		ValidationResult result = isEmailValid()
		.and(isPhoneNoValid())
		.and(isAdult()).apply(customer);
		
		System.out.println(result);
		
		if (result != ValidationResult.SUCCESS) {
			throw new IllegalStateException(result.name());
		}
		
	}

}
