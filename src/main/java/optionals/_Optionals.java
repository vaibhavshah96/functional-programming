package optionals;

import java.util.Optional;

public class _Optionals {
	public static void main(String[] args) {
//		Object value = Optional.ofNullable("Hello").orElseGet(() -> "default value");
//		Object value = Optional.ofNullable(null).orElseGet(() -> "default value");
		
//		Object value = Optional.ofNullable(null).orElseThrow(() -> new IllegalStateException("Optional threw an exception"));

		
//		Optional.ofNullable("vaibhavshah96@gmail.com").ifPresent(email -> System.out.println("Sending email to" + email));
		
		
//		Optional.ofNullable("vaibhavshah96@gmail.com")
//		.ifPresentOrElse(email -> System.out.println("Sending email to: " + email),
//				() -> {
//					System.out.println("cannot send email");
//				});
		
		Optional.ofNullable(null)
		.ifPresentOrElse(email -> System.out.println("Sending email to: " + email),
				() -> {
					System.out.println("cannot send email");
				});

//		System.out.println(value);
	}
}
