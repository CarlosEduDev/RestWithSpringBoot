package br.com.erudio.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service
public class PersonService {
	
	private final AtomicLong counter = new AtomicLong();
	
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	 
	public void delete(String id) {
		
	}
	
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Carlos");
		person.setLastName("Eduardo");
		person.setAddress("BA");
		person.setGender("Male");
		return person;
	}
	
	public List<Person> findAll() {
		List<Person> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(mockPerson(i));
		}
		return list;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person firstname" + i);
		person.setLastName("person lastname"+i);
		person.setAddress("BA"+i);
		person.setGender("Male");
		return person;
	}
	


}
