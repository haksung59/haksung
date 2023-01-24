package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            Team team = new Team();
//            team.setName("TeamA");
//            em.persist(team);
//
//            Member member = new Member();
//            member.setUsername("member1");
//            member.changeTeam(team);
//            em.persist(member);
//
//            em.flush();
//            em.clear();
//            System.out.println("------------");
//
//            Member findMember = em.find(Member.class, member.getId());
//            List<Member> members = findMember.getTeam().getMembers();
//
//            for(Member m : members){
//                System.out.println("m : " + m.getUsername());
//            }

            Album album = new Album();
            album.setName("hi");
            album.setArtist("hihihi");
            album.setPrice(3000);

            em.persist(album);

            em.flush();
            em.clear();

            Album findAlbum = em.find(Album.class, album.getId());
            System.out.println(findAlbum.getArtist());

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