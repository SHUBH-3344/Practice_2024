package in.sb.rest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sb.entity.Plan;
import in.sb.service.PlanService;

@RestController
public class PlanRestController {

	@Autowired
	private PlanService planService;
	

	@GetMapping("/plan/{planId}")
	public ResponseEntity<Plan> editPlan(@PathVariable Integer planId) {
		Plan plan = planService.getPlanById(planId);
		return new ResponseEntity<>(plan, HttpStatus.OK);
	}

	@GetMapping("/plans")
	public ResponseEntity<List<Plan>> plans() {
		List<Plan> allPlans = planService.getAllPlans();
		return new ResponseEntity<>(allPlans, HttpStatus.OK);
	}

	@GetMapping("/categories")
	public ResponseEntity<Map<Integer, String>> planCategories() {
		Map<Integer, String> planCategory = planService.getPlanCategory();
		return new ResponseEntity<>(planCategory, HttpStatus.OK);

	}

	@PostMapping("/plan")
	public ResponseEntity<String> savePlan(@RequestBody Plan plan) {
		String responsemsg = "";
		boolean isSaved = planService.savePlan(plan);
		if (isSaved) {
			responsemsg = "Plan Saved";
		} else {
			responsemsg = "Plan not saved";
		}
		return new ResponseEntity<>(responsemsg, HttpStatus.CREATED);
	}

	@PutMapping("/plan")
	public ResponseEntity<String> updatePlan(@RequestBody Plan plan) {
		String msg = "Plan updated";
		boolean isUpdated = planService.updatePlan(plan);
		if (isUpdated) {
			msg = "Plan Updated";
		} else {
			msg = "Plan ot Updated";
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);

	}
	
	@PutMapping("/status-change/{planId}/{status}")
	public ResponseEntity<String>statuschange (@PathVariable Integer planId, @PathVariable String status){
		String msg = "";
		boolean IsStatuschanged = planService.planStatuschange(planId, status);
		
		if (IsStatuschanged) {
			msg = "Status Changed";
		}
		else {
			msg = "Status Not Changed";
		}
		return new ResponseEntity<> (msg, HttpStatus.OK);
		
	}
	
	

	@DeleteMapping("/plan/{planId}")
	public ResponseEntity<String> deletePlan(@PathVariable Integer planId) {
		String msg = "";

		boolean isDeleted = planService.deletPlanById(planId);

		if (isDeleted) {
			msg = "Plan Deleted";
		} else {
			msg = "Plan Not Deleted";
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}