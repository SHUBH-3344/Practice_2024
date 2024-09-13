package in.sb.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sb.entity.Plan;
import in.sb.entity.PlanCategory;
import in.sb.repo.PlanCategoryRepository;
import in.sb.repo.PlanRepository;
@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanRepository planRepo;

	@Autowired
	private PlanCategoryRepository planCategoryRepo;

	@Override
	public List<Plan> getAllPlans() {
		return planRepo.findAll();

	}

	@Override
	public boolean savePlan(Plan plan) {
		Plan saved = planRepo.save(plan);

		// return saved.getPlanId()!= null;
		return saved.getPlanId() != null ? true : false;
	}

	@Override
	public boolean updatePlan(Plan plan) {
		planRepo.save(plan);
		return plan.getPlanId() != null;
	}

	@Override
	public Plan getPlanById(Integer planId) {
		Optional<Plan> findById = planRepo.findById(planId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean deletPlanById(Integer planId) {
		boolean status = false;
		try {
			planRepo.deleteById(planId);
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean planStatuschange(Integer planId, String status) {
		Optional<Plan> findById = planRepo.findById(planId);
		if (findById.isPresent()) {
			Plan plan = findById.get();
			plan.setActiveSwitch(status);
			planRepo.save(plan);
			return true;
		}
		return false;
	}

	@Override
	public Map<Integer, String> getPlanCategory() {
		List<PlanCategory> categories = planCategoryRepo.findAll();

		Map<Integer, String> categoryMap = new HashMap<>();
		categories.forEach(category -> {
			categoryMap.put(category.getPlanCategoryId(), category.getPlanCategoryName());
		});

		return categoryMap;
	}

}
