package JPA;

import Entity.Lieu;
import Entity.Niveaux;
import Entity.Personne;
import Entity.Sport;
import JPA.EntityManagerHelper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaTest {
	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			test.createTables();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();


		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		factory.close();
	}

	public void createTables(){
		Personne p1 = new Personne("Jean","Michel","jean.michel@gmail.com");
		Personne p2 = new Personne("Jackie","Chan","jackie.chan@gmail.com");
		Personne p3 = new Personne("Michel","Sardou","Michel.Sardou@hotmail.fr");
		manager.persist(p1);
		manager.persist(p2);
		manager.persist(p3);

		Lieu l1 = new Lieu("Rennes",35000);
		Lieu l2 = new Lieu("Saint-Brieuc",22000);
		Lieu l3 = new Lieu("Brest",29000);
		manager.persist(l1);
		manager.persist(l2);
		manager.persist(l3);

		Sport s1 = new Sport("Football", Niveaux.PRO);
		Sport s2 = new Sport("Ping-Pong", Niveaux.ADVANCED);
		Sport s3 = new Sport("Golf", Niveaux.BEGINNER);
		manager.persist(s1);
		manager.persist(s2);
		manager.persist(s3);
		s1.addLieu(l1);
		s1.addLieu(l3);

		s2.addLieu(l2);

		s3.addLieu(l1);
		s3.addLieu(l2);
		s3.addLieu(l3);
	}



}
