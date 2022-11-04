package test;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TestRepository extends CrudRepository<Member,String> {

    @Override
    Optional<Member> findById(String id);
}