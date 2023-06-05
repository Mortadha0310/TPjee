package tn.essat.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import tn.essat.model.Livre;

public class GestionImp implements IGestion {
	Session session;

	public GestionImp() {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata =  new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();	
		session=sessionFactory.openSession();
	}
	@Override
	public List<Livre> getAllLivres() {
		Query<Livre> query = session.createQuery("select e from Livre e");
		return query.getResultList();
	}

	@Override
	public void addLivre(Livre lv) {
		session.getTransaction().begin();
		session.save(lv);
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteLivre(int id) {
		session.getTransaction().begin();
		session.delete(getLivreById(id));
		session.getTransaction().commit();
		
		
	}
	@Override
	public Livre getLivreById(int id) {
		Query req=session.createQuery("select e from Livre e where e.id=:x");
		req.setParameter("x", id);
		
		Livre lv =(Livre) req.getSingleResult();
		return lv;
	}
	

}