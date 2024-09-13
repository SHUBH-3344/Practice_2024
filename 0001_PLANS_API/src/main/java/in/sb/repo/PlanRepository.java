package in.sb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sb.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer>{

}
