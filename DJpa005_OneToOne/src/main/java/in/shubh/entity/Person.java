package in.shubh.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Person {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer personId;
	private String personName;
	private String personGender;
	
 @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Passport passport;

}
 	