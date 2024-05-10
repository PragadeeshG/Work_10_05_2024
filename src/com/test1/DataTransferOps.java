package com.test1;

public class DataTransferOps {
	private long transferOpsCode;
	private String modularData;
	private String dataReqion;
	private String transferOpsTeam;
	private String contact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataTransferOps() {

	}

	public DataTransferOps(long transferOpsCode, String modularData, String dataReqion, String transferOpsTeam,
			String contact, String creationDate, String modifiedDate, String entityState) {
		super();
		this.transferOpsCode = transferOpsCode;
		this.modularData = modularData;
		this.dataReqion = dataReqion;
		this.transferOpsTeam = transferOpsTeam;
		this.contact = contact;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getTransferOpsCode() {
		return transferOpsCode;
	}

	public void setTransferOpsCode(long transferOpsCode) {
		this.transferOpsCode = transferOpsCode;
	}

	public String getModularData() {
		return modularData;
	}

	public void setModularData(String modularData) {
		this.modularData = modularData;
	}

	public String getDataReqion() {
		return dataReqion;
	}

	public void setDataReqion(String dataReqion) {
		this.dataReqion = dataReqion;
	}

	public String getTransferOpsTeam() {
		return transferOpsTeam;
	}

	public void setTransferOpsTeam(String transferOpsTeam) {
		this.transferOpsTeam = transferOpsTeam;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
