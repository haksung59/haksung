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
            member.setUsername("member1");
            member.setHomeAddress(new Address("city1", "street", "zipCode"));

            member.getAddressHistory().add(new Address("old1", "street", "zipCdoe"));
            member.getAddressHistory().add(new Address("old2", "street", "zipCdoe"));

            em.persist(member);

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