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
                Team team = new Team();
                team.setName("teamA");
                em.persist(team);


                Member member = new Member();
                member.setUsername("member1");
                member.setAge(10);
                member.setType(MemberType.ADMIN);

                member.changeTeam(team);

                em.persist(member);

//            em.createQuery("select o.address from Order o")
//                            .getResultList();
//                            .setParameter("username", "member1")
//                            .getSingleResult();

            em.flush();
            em.clear();

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