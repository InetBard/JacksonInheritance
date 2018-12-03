package telran.person.domain;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of= {"id"})
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public abstract class Person {
	
	int id;
	String name;
	@JsonFormat(pattern = "yyyy-MM-dd")
	LocalDate birthDate;
	Address address;
}
