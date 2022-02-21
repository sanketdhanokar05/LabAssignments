package com.jpa.lab1.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpa.lab1.entity.Author;

public class DeleteAuthor 
{
	public static void main(String[] args) 
	{
		int authorId = 2;
		
		EntityManagerFactory  emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		Author author = em.find(Author.class,authorId);
		
		if(author != null)
		{
			EntityTransaction txn = em.getTransaction();
			txn.begin();
			em.remove(author);
			txn.commit();
			System.out.println("Author Deleted");
		}
		else 
		{
			System.out.println("Author not exist with id :"+authorId);
		}
		em.clear();
		emf.close();
	}
}
