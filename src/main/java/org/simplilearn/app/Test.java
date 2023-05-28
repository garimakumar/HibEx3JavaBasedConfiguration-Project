package org.simplilearn.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplilearn.app.config.HibConfig;
import org.simplilearn.app.entities.Emp;

public class Test {

	public static void main(String[] args) {

		SessionFactory sessionFactory=HibConfig.getSessionFactory();
		Session session=sessionFactory.openSession();
		/*
		 * Transaction tx=session.beginTransaction(); try { Emp e=new Emp();
		 * e.setName("Priya"); e.setAddress("Mumbai"); session.save(e); tx.commit(); }
		 * catch (Exception e) { tx.rollback(); } session.close();
		 */
		Emp e=session.load(Emp.class,1);
	    System.out.println(e.getEno()+"\t"+e.getName()+"\t"+e.getAddress());
		session.close();
	}

}
