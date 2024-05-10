package com.test1;

public class NonAdminTransferOps {
	private long transferOpsCode;
	private String transferOpsRegion;
	private String transferOpsLevel;
	private String remarks;
	private String contact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public NonAdminTransferOps() {

	}

	public NonAdminTransferOps(long transferOpsCode, String transferOpsRegion, String transferOpsLevel, String remarks,
			String contact, String creationDate, String modifiedDate, String entityState) {
		super();
		this.transferOpsCode = transferOpsCode;
		this.transferOpsRegion = transferOpsRegion;
		this.transferOpsLevel = transferOpsLevel;
		this.remarks = remarks;
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

	public String getTransferOpsRegion() {
		return transferOpsRegion;
	}

	public void setTransferOpsRegion(String transferOpsRegion) {
		this.transferOpsRegion = transferOpsRegion;
	}

	public String getTransferOpsLevel() {
		return transferOpsLevel;
	}

	public void setTransferOpsLevel(String transferOpsLevel) {
		this.transferOpsLevel = transferOpsLevel;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
