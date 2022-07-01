package com.metaphorce.mx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the contractype database table.
 * 
 */
@Entity
@NamedQuery(name="Contractype.findAll", query="SELECT c FROM Contractype c")
public class Contractype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idContracType;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;

	private String description;

	private byte isActive;

	private String name;

	//bi-directional many-to-one association to Contract
	@OneToMany(mappedBy="contractype")
	private List<Contract> contracts;

	public Contractype() {
	}

	public int getIdContracType() {
		return this.idContracType;
	}

	public void setIdContracType(int idContracType) {
		this.idContracType = idContracType;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contract> getContracts() {
		return this.contracts;
	}

	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

	public Contract addContract(Contract contract) {
		getContracts().add(contract);
		contract.setContractype(this);

		return contract;
	}

	public Contract removeContract(Contract contract) {
		getContracts().remove(contract);
		contract.setContractype(null);

		return contract;
	}

}