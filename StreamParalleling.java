import java.util.*;
import java.lang.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class StreamParalleling extends Person {

	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("20131206", DateTimeFormatter.BASIC_ISO_DATE);
		
		ArrayList<Person> roster = new ArrayList<Person>();

		roster.add(new Person("GordonBarthalamule", Sex.MALE, "barthalamule@email.com", date)); 
		for (Person person : roster) {
			person.stream().forEach(e -> System.out.println(e.getName()));
		}

		Person p = new Person("Gordon Barthalamule", Sex.MALE, "gbarthalamule3456@email.com" , date);
		double average = roster.parallelStream()
		.filter(p -> p.getGender() == Person.Sex.MALE)
		.mapToInt(Person::getAge)
		.average()
		.getAsDouble();
		System.out.println("Average " + average);
	}

}
