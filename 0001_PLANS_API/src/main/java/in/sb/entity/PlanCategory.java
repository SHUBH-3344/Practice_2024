package in.sb.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import lombok.Data;


@Entity
@Data
@Table(name = "PLAN_CATEGORY")
public class PlanCategory {
	
	@Id
	@GeneratedValue
	@Column(name ="PLAN_CATEGORY_ID")
	private Integer planCategoryId;
	
	@Column (name = "PLAN_CATEGORY_NAME")
	private String planCategoryName;
	
	@Column(name ="ACTIVE_SW")
	private String activeSwitch;
	
	@Column(name ="CREATED_BY")
	private String createdBy;
	
	@Column(name ="UPDATED_BY")
	private String updatedBy;
	
	@CreationTimestamp
	@Column(name ="CREATED_DATE", updatable = false)
	private LocalDate CreateDate;
	
	@UpdateTimestamp
	@Column(name ="UPDATED_DATE", insertable = false)
	private LocalDate UpdatedDate;
	

}
