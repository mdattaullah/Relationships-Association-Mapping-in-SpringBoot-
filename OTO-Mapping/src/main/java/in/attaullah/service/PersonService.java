package in.attaullah.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.attaullah.entities.Passport;
import in.attaullah.entities.Man;
import in.attaullah.repo.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;
	public void saveData() {

		Man man = new Man();
		man.setPersonName("Attaullah Khan ");
		man.setPersonGender("Male");

		Passport passport = new Passport();
		passport.setPassPortNum("PA24325F");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));

		man.setPassport(passport);
		passport.setPerson(man);
		personRepo.save(man);

	}

	public void delete() {
		personRepo.deleteById(1);
	}

}
