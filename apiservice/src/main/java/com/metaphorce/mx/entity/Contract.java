package com.metaphorce.mx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the contract database table.
 * 
 */
@Entity
@NamedQuery(name="Contract.findAll", query="SELECT c FROM Contract c")
public class Contract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFrom;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTo;

	private int idcontract;

	private byte isActive;

	private BigDecimal salaryPerDay;

	//bi-directional many-to-one association to Contractype
	@ManyToOne
	@JoinColumn(name="idContractType")
	private Contractype contractype;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="idEmployee")
	private Employee employee;

	public Contract() {
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateFrom() {
		return this.dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return this.dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public int getIdcontract() {
		return this.idcontract;
	}

	public void setIdcontract(int idcontract) {
		this.idcontract = idcontract;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public BigDecimal getSalaryPerDay() {
		return this.salaryPerDay;
	}

	public void setSalaryPerDay(BigDecimal salaryPerDay) {
		this.salaryPerDay = salaryPerDay;
	}

	public Contractype getContractype() {
		return this.contractype;
	}

	public void setContractype(Contractype contractype) {
		this.contractype = contractype;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}