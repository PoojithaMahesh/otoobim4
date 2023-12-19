package onetoonebim4.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.border.EtchedBorder;

import onetoonebim4.dto.Person;

public class PersonDao {
	
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	
public void savePerson(Person person) {
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(person);
	entityTransaction.commit();
}

public void updatePerson(int id,Person person) {
	EntityManager entityManager=getEntityManager();
	Person dbPerson=entityManager.find(Person.class, id);
	
	if(dbPerson!=null) {
//		id is present  so i can update the data
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		person.setId(id);
		person.setAadharCard(dbPerson.getAadharCard());
		
		entityManager.merge(person);
		entityTransaction.commit();
		
	}else {
		System.out.println("Sorry id is not present");
	}
}


public void findPerson(int id) {
	EntityManager entityManager=getEntityManager();
	Person dbPerson=entityManager.find(Person.class, id);
	
	if(dbPerson!=null) {
//		id is present  
		System.out.println(dbPerson);
	}else {
		System.out.println("Sorry id is not present");
	}
}

public void deletePerson(int id) {
	EntityManager entityManager=getEntityManager();
	Person dbPerson=entityManager.find(Person.class, id);
	
	if(dbPerson!=null) {
//		id is present  
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(dbPerson);
		entityTransaction.commit();
	}else {
		System.out.println("Sorry id is not present");
	}
}
















}
