package com.jpa.lab1.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.lab1.entity.Author;

public class AuthorById 
{
	public static void main(String[] args) 
	{
		int authorId = 3;
		
		EntityManagerFactory  emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		Author author = em.find(Author.class,authorId);
		
		if(author != null)
		{
			System.out.println("Author Id: "+author.getAuthorId());
			System.out.println("Author First Name: "+author.getFirstName());
			System.out.println("Author Middle Name: "+author.getMiddleName());
			System.out.println("Author Last Name: "+author.getLastName());
			System.out.println("Author Phone No: "+author.getPhoneNo());
		}
		else 
		{
			System.out.println("Product not exist with id :"+authorId);
		}
		em.clear();
		emf.close();
	}
}
