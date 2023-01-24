package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = new Member();
            member.setUsername("A");

            Member member2 = new Member();
            member2.setUsername("haksung");

            Member member3 = new Member();
            member3.setUsername("chanik");

            em.persist(member);
            em.persist(member2);
            em.persist(member3);

            tx.commit();
        }catch(Exception e){
            System.out.println("rollback");
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close();
    }
}