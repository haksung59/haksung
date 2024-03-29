package org.example.jpql;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

                Team teamA = new Team();
                teamA.setName("teamA");


                Member member = new Member();
                member.setUsername("ghldnjs1");
                member.setAge(10);
                member.setType(MemberType.ADMIN);

                em.persist(member);

                em.flush();
                em.clear();

//            em.createQuery("select o.address from Order o")
////                            .getResultList();
////                            .setParameter("username", "member1")
//                            .getSingleResult();
//
//            em.flush();
//            em.clear();
//
            String query = "select m.username, 'HELLO', true from Member m " +
                    "where m.type = :userType";

            List<Object[]> result = em.createQuery(query)
                            .setParameter("userType", MemberType.ADMIN)
                                    .getResultList();

            for(Object[] objects : result){
                System.out.println("objects = " + objects[0]);
                System.out.println("objects = " + objects[1]);
                System.out.println("objects = " + objects[2]);
            }

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