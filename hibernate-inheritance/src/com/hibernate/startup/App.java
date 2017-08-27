package com.hibernate.startup;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Address addr1 = new Address();
		addr1.setCity("NewYork");
		addr1.setState("NY");

		OfficeAddress officeAddress = new OfficeAddress();
		officeAddress.setStreet("Lexington Ave");
		officeAddress.setZipCode("10023");
		officeAddress.setAddressType("OFFICE");

		HomeAddress homeAddress = new HomeAddress();
		homeAddress.setStreet("Madison Ave");
		homeAddress.setZipCode("10029");
		homeAddress.setAddressType("HOME");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(addr1);
		// session.save(addr2);
		session.save(officeAddress);
		session.save(homeAddress);
		// session.save(student2);
		session.getTransaction().commit();
		session.close();
	}
}
