package streams;



import static streams._Streams.Gender.FEMALE;
import static streams._Streams.Gender.MALE;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class _Streams {

	public static void main(String[] args) {
		List<Person> people = List.of(
				new Person("Vaib", MALE), 
				new Person("Vai", FEMALE), 
				new Person("Vib", FEMALE),
				new Person("Vaibhav", MALE),
				new Person("Vaibhav Shah", MALE)
				);
		
//		people.stream()
//		.map(person -> person.gender)
//		.collect(Collectors.toSet())
//		.forEach(gender -> System.out.println(gender));
//		
//		people.stream()
//		.map(person -> person.name)
//		.mapToInt(name -> name.length())
//		.forEach(name -> System.out.println(name)); 
		
		Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
		boolean containsOnlyFemales = people.stream()
			.anyMatch(personPredicate);
		
		System.out.println(containsOnlyFemales);
 
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

