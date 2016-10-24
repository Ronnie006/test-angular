package test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import test.model.Person;

@SpringBootApplication
@RestController
public class TestAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAngularApplication.class, args);
	}
	
	
	@RequestMapping(value="/persons",method=RequestMethod.GET)
	public List<Person> getPeople(){
		List<Person> persons = new ArrayList<Person>();
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.setName("Ronnie");
		person1.setAge(23);
		
		person2.setName("Jinri");
		person2.setAge(25);
		
		persons.add(person1);
		persons.add(person2);
		
		return persons;
		
	}
}
