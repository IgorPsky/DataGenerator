package ua.kiev.podolsky.DataGenerator.Data;

import java.time.LocalDate;
import java.util.Random;

import ua.kiev.podolsky.DataGenerator.Randomizer.DataRandomizer;
import ua.kiev.podolsky.DataGenerator.Randomizer.RandomName;

public class Person {
  public final String name;
  public final String surname;
  public final Gender gender;
  public final LocalDate birthdate;
  private Person(String name, String surname, Gender gender, LocalDate birthDate) {
	  this.name = name;
	  this.surname = surname;
	  this.gender = gender;
	  this.birthdate = birthDate;
  }
  
  @Override
  public String toString() {
	  return name + " " + surname + ", " + gender.toString() + ", " + birthdate.toString();
  }
  
 
  private static Random RAND = null;
  private static Random random() {
	  if (RAND == null) RAND = new Random(System.currentTimeMillis());
	  return RAND;
  }
  
  public static LocalDate getRandomBirthdate() {
	  return LocalDate.now().minusDays(random().nextInt(99*365));
  }
  
  public static Person randomMale() {
	  return new Person(RandomName.maleName().getNext(), RandomName.surname().getNext(), Gender.MALE, getRandomBirthdate());
  }

  public static Person randomFemale() {
	  return new Person(RandomName.femaleName().getNext(), RandomName.surname().getNext(), Gender.FEMALE, getRandomBirthdate());
  }
  
  public static Person randomPerson() {
	  if (random().nextBoolean()) return randomMale();
	  else return randomFemale();
  }
  
  public static class RandomizerPerson implements DataRandomizer<Person> {

	@Override
	public Person getNext() {
		return randomPerson();
	}
	  
  }
  
  public static void main(String[] args) {
	  for(int i=0; i<50; i++) {
		  System.out.println(randomPerson());
	  }
  }
  
}
