package in.ashokit;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Officedetalis 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer oId;
	private String oName;
	private String oLoc;
	
	public Integer getoId() {
		return oId;
	}
	public void setoId(Integer oId) {
		this.oId = oId;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public String getoLoc() {
		return oLoc;
	}
	public void setoLoc(String oLoc) {
		this.oLoc = oLoc;
	}
	
	

}
