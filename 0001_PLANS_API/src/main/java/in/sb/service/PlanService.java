package in.sb.service;

import java.util.List;
import java.util.Map;

import in.sb.entity.Plan;

public interface PlanService {
	public List<Plan> getAllPlans();

	public Map<Integer, String> getPlanCategory();

	public boolean savePlan(Plan plan);

	public boolean updatePlan(Plan plan);

	public Plan getPlanById(Integer planId);

	public boolean deletPlanById(Integer planId);

	public boolean planStatuschange(Integer planId, String status);

}
