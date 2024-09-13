package in.shubh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubh.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
