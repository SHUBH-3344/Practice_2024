package in.shubh.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.shubh.entity.Cricketers;

@Repository
public interface CricketersRepository extends JpaRepository<Cricketers, Integer> {
	
	@Query (value = "call getCricketers()", nativeQuery = true)
	public List <Cricketers> getAllCricketers();

}
