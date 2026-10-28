package HibernatePractical3_Mapping.HibernatePractical3_Mapping.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Patient_info")
public class Patient {
	@Id
	@Column(name="patient_id")
	private String pid;
	@Column(name="patient_name")
	private String pname;
	@Column(name="patient_disease")
	private String pdis;
	@Column(name="patient_email")
	private String pemail;
	
	@Override
	public String toString() {
	    return "Patient [pid=" + pid
	            + ", pname=" + pname
	            + ", pdis=" + pdis
	            + ", pemail=" + pemail + "]";
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdis() {
		return pdis;
	}

	public void setPdis(String pdis) {
		this.pdis = pdis;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public Doctor getD() {
		return d;
	}

	public void setD(Doctor d) {
		this.d = d;
	}

	@OneToOne
	private Doctor d;
}
