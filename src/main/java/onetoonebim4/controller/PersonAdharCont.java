package onetoonebim4.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebim4.dao.AadharCardDao;
import onetoonebim4.dao.PersonDao;
import onetoonebim4.dto.AadharCard;
import onetoonebim4.dto.Person;

public class PersonAdharCont {
public static void main(String[] args) {
//	Person person=new Person();
//	person.setId(2);
//	person.setName("Poojitha");
//	person.setAdress("Bangalore");
//
//	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(200);
//	aadharCard.setName("PoojithaJM");
//	aadharCard.setAge(18);
	
	PersonDao personDao=new PersonDao();
//	personDao.savePerson(person);
	
	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.saveAadharCard(2, aadharCard);
	
	Person person=new Person();
	person.setName("pooji");
	person.setAdress("Bangalore");

	
	AadharCard aadharCard=new AadharCard();
	aadharCard.setName("Poojitha");
	aadharCard.setAge(18);
	
	personDao.updatePerson(2, person);
	aadharCardDao.updateAadharCard(200, aadharCard);
}
}
