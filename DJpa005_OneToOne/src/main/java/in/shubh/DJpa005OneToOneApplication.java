package in.shubh;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shubh.entity.Passport;
import in.shubh.entity.Person;
import in.shubh.repo.PassportRepo;
import in.shubh.repo.PersonRepo;

@SpringBootApplication
public class DJpa005OneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DJpa005OneToOneApplication.class, args);
	PersonRepo personRepo = context.getBean(PersonRepo.class);
	
	PassportRepo passportRepo = context.getBean(PassportRepo.class);
	
//	Person person = new Person();
//	person.setPersonGender("Male");
//	person.setPersonName("Shubam");
//	
//	Passport passport = new Passport();
//	passport.setIssuedDate(LocalDate.now());
//	passport.setExpiryDate(LocalDate.now().plusYears(10));
//	passport.setPassportNum("abc78nk");
//	
//	person.setPassport(passport);
//	
//	passport.setPerson(person);
//	
//	personRepo.save(person);
	
	personRepo.findById(1);
	
	}

}
