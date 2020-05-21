package DateAPI;

import java.time.LocalDate;

public class Person {

	private String name;
	private LocalDate dateofBirth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public Person()
	{
		
	}
	public Person(String name, LocalDate dateofBirth) {
		super();
		this.name = name;
		this.dateofBirth = dateofBirth;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dateofBirth=" + dateofBirth + "]";
	}
	
	
}
