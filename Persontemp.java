import java.util.List;
import java.util.ArrayList;
import java.time.chrono.IsoChronology;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class Person {
	
	public Person() {
	
	public Person(String name, Sex gender, String emailAddress, LocalDate date) {
		// this.setAge(date);
		// this.setEmail(emailAddress);
		// this.setGender(gender);
		// this.setName(name);
		name = nameArg;
		birthday = birthdayArg;
		gender = genderArg;
		emailAddress = emailArg;
	}
	
	public enum Sex {
		MALE, FEMALE
	}

	static String name;
	static LocalDate birthday;
	static Sex gender;
	static String emailAddress;
	
	public void setAge(LocalDate date)  {
		this.birthday = date;
	}
	
	public void setEmail(String emailAddress) { 
		this.emailAddress = emailAddress;
	}
	
	public void setGender(Sex MALE) {
		this.gender = MALE;	
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public static LocalDate getAge(Person p) {
		return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}
	
	public static LocalDate getAge() {
		return birthday;
	}
	
	public static String getEmail() {
		return emailAddress;
	}

	public static String getName() {
		return name;
	}
	
}
