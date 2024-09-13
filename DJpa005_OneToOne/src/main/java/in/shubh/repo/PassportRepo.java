package in.shubh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubh.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer>{

}
