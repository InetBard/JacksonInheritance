package telran.person.controller;

import java.io.IOException;
import java.time.LocalDate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import telran.person.domain.Address;
import telran.person.domain.Child;
import telran.person.domain.Employyee;
import telran.person.domain.Person;

public class PersonAppl {
	static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
		mapper.findAndRegisterModules();
	}

	public static void main(String[] args) throws IOException {
		Person[] persons = {
				new Child(123, "Mosche", LocalDate.of(2014, 5, 12), 
				new Address("Lod", "Sokolov", 12), "Tapuz"),
				
				new Employyee(124, "George", LocalDate.of(1970, 12, 21), 
				new Address("KfarSaba", "Hertzl", 12), "Motorolla",12400) 
				};
		//Serialize 
		String json = mapper.writeValueAsString(persons);
		System.out.println(json);
		//Deserialize
		Iterable<Person> personsRestore = mapper.readValue(json, 
				new TypeReference<Iterable<Person>>() {
		});
		for (Person person : personsRestore) {
			System.out.println(person);
		}
	}

}
