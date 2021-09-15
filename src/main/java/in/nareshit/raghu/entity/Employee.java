package in.nareshit.raghu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emptab")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="eid")
	private Integer id;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private Double empSal;
	@Column(name="edept")
	private String empDept;
	@Column(name="eaddr")
	private String empAddr;
	
	public Employee(Integer id, String empName, Double empSal, String empDept, String empAddr) {
		super();
		this.id = id;
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
		this.empAddr = empAddr;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empSal=" + empSal + ", empDept=" + empDept
				+ ", empAddr=" + empAddr + "]";
	}

}
