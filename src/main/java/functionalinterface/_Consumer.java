package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
	
	public static void main(String[] args) {
		Customer customer1 = new Customer("Vaibhav", "9999");
		greetCustomer(customer1);
		
		greetCustomerConsumer.accept(customer1);
		greetCustomerConsumerV2.accept(customer1, false);
		
		
	}
	
	static void greetCustomer(Customer customer) {
		System.out.println(customer.toString());
	}
	
	static Consumer<Customer> greetCustomerConsumer = customer ->  System.out.println(customer.toString());
	
	static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = 
			(customer, showPhoneNumber) ->  System.out.println("BiConsumer: Hello " + customer.customerName + " phone number "
					+ (showPhoneNumber ? customer.customerPhoneNumber : "****"));

	
	static class Customer {
		private final String customerName;
		private final String customerPhoneNumber;
		
		Customer(String customerName, String customerPhoneNumber){
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
			
		}

		@Override
		public String toString() {
			return ("Hello " + customerName + ", thanks for registering phone number " + customerPhoneNumber);
		}
		
		
		
	} 

}
