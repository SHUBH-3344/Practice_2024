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
@Table(name = "PLAN_MASTER")
public class Plan {
	@Id
	@GeneratedValue
	@Column(name ="PLAN_ID")
	private Integer planId;
	
	
	@Column(name ="PLAN_NAME")
	private String planName;
	
	@Column(name ="PLAN_START_DATE")
	private LocalDate startDate;
	
	@Column(name ="PLAN_END_DATE")
	private LocalDate endDate;
	
	@Column(name ="PLAN_CATEGOTY_ID")
	private Integer planCategoryId;
	
	@Column(name ="PLAN_ACTIVE_SW")
	private String activeSwitch;
	
	@Column(name ="PLAN_CREATED_BY")
	private String createdBy;
	
	@Column(name ="PLAN_UPDATED_BY")
	private String updatedBy;
	
	@CreationTimestamp
	@Column(name ="CREATED_DATE", updatable = false)
	private LocalDate CreateDate;
	
	@UpdateTimestamp
	@Column(name ="UPDATED_DATE", insertable = false)
	private LocalDate UpdatedDate;
	
}
