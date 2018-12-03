package telran.person.domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class Employyee extends Person {
	String company;
	int salary;
	public Employyee(int id, String name, LocalDate birthDate, Address address, String company, int salary) {
		super(id, name, birthDate, address);
		this.company = company;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employyee [company=" + company + ", salary=" + salary + ", id=" + id + ", name=" + name + ", birthDate="
				+ birthDate + ", address=" + address + "]";
	}
	
	
}
