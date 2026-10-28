package HibernatePractical3_Mapping.HibernatePractical3_Mapping.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Doctor_info")
public class Doctor {
	@Id
	@Column(name="doctor_id")
	private String did;
	@Column(name="doctor_name")
	private String dname;
	@Column(name="doctor_email")
	private String demail;
	@Column(name="doctor_education")
	private String dedu;
	
	@OneToOne
	private Patient p;

	@Override
	public String toString() {
	    return "Doctor [did=" + did
	            + ", dname=" + dname
	            + ", demail=" + demail
	            + ", dedu=" + dedu + "]";
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDemail() {
		return demail;
	}

	public void setDemail(String demail) {
		this.demail = demail;
	}

	public String getDedu() {
		return dedu;
	}

	public void setDedu(String dedu) {
		this.dedu = dedu;
	}

	public Patient getP() {
		return p;
	}

	public void setP(Patient p) {
		this.p = p;
	}

}
