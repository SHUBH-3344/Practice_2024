package in.shubh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.shubh.entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>  {

}
