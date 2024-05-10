package com.test1;

public class AdminTransferOps {
	private long transferOpsCode;
	private String routinetransferOps;
	private String remarks;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AdminTransferOps() {

	}

	public AdminTransferOps(long transferOpsCode, String routinetransferOps, String remarks, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.transferOpsCode = transferOpsCode;
		this.routinetransferOps = routinetransferOps;
		this.remarks = remarks;
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

	public String getRoutinetransferOps() {
		return routinetransferOps;
	}

	public void setRoutinetransferOps(String routinetransferOps) {
		this.routinetransferOps = routinetransferOps;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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