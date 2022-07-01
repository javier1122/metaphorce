package com.metaphorce.mx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idemployee;

	@Temporal(TemporalType.DATE)
	private Date birthDate;

	private String cellPhone;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;

	private String email;

	private byte isActive;

	private String lastName;

	private String taxIdNumber;

	//bi-directional many-to-one association to Contract
	@OneToMany(mappedBy="employee")
	private List<Contract> contracts;

	public Employee() {
	}

	public int getIdemployee() {
		return this.idemployee;
	}

	public void setIdemployee(int idemployee) {
		this.idemployee = idemployee;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTaxIdNumber() {
		return this.taxIdNumber;
	}

	public void setTaxIdNumber(String taxIdNumber) {
		this.taxIdNumber = taxIdNumber;
	}

	public List<Contract> getContracts() {
		return this.contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

	public Contract addContract(Contract contract) {
		getContracts().add(contract);
		contract.setEmployee(this);

		return contract;
	}

	public Contract removeContract(Contract contract) {
		getContracts().remove(contract);
		contract.setEmployee(null);

		return contract;
	}

	@Override
	public String toString() {
		return "Employee [idemployee=" + idemployee + ", birthDate=" + birthDate + ", cellPhone=" + cellPhone
				+ ", dateCreated=" + dateCreated + ", email=" + email + ", isActive=" + isActive + ", lastName="
				+ lastName + ", taxIdNumber=" + taxIdNumber + ", contracts=" + contracts + "]";
	}

	
	
	
}