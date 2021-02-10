package imperative;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Person> people = List.of(new Person("Vaib", MALE), new Person("Vai", FEMALE), new Person("Vib", FEMALE),
				new Person("Vaibhav", MALE));

		// Imperative Approach
		System.out.println("Imperative Approach");
		List<Person> females = new ArrayList<>();
		for (Person person : people) {
			if (FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}

		for (Person person : females) {
			System.out.println(person);
		}

		System.out.println("Declarative Approach");
		// Declarative Approach -> Streams and colections
		
		//	Without storing it in a variable
		// people.stream().filter(person -> FEMALE.equals(person.gender)).forEach(System.out::println);
				
		
		// To store it in a variable
		/* List<Person> females2 = people.stream().filter(person -> FEMALE.equals(person.gender))
	 	.collect(Collectors.toList());
		females2.forEach(System.out::println); 
		*/
		
		Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
		List<Person> females2 = people.stream().filter(personPredicate)
			 	.collect(Collectors.toList());
				females2.forEach(System.out::println); 
		

	}

	static class Person {
		private final String name;
		private final Gender gender;

		Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	enum Gender {
		MALE, FEMALE
	}

}
