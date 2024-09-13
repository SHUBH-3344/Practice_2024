package in.shubh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "CricketersList")
public class Cricketers {
	@Id
	@Column (name = "Cricketer_Id")
	private Integer id;
	
	@Column(name = "Jersy_No")
	private Integer jersyNo;
	
	@Column(name = "Cricketers_Category")
	private String role;
	
	@Column (name =" Cricketers_Name")
	private String name;
	
	@Column (name = "Member_Of_IPLTeam")
    private String iplTeamMember;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getJersyNo() {
		return jersyNo;
	}

	public void setJersyNo(Integer jersyNo) {
		this.jersyNo = jersyNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIplTeamMember() {
		return iplTeamMember;
	}

	public void setIplTeamMember(String iplTeamMember) {
		this.iplTeamMember = iplTeamMember;
	}
	
	public Cricketers() {
		
	}

	public Cricketers(Integer id, Integer jersyNo, String role, String name, String iplTeamMember) {
		super();
		this.id = id;
		this.jersyNo = jersyNo;
		this.role = role;
		this.name = name;
		this.iplTeamMember = iplTeamMember;
	}

	@Override
	public String toString() {
		return "Cricketers [id=" + id + ", jersyNo=" + jersyNo + ", role=" + role + ", name=" + name
				+ ", iplTeamMember=" + iplTeamMember + "]";
	}

}
