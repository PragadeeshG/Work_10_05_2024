package com.test1;

public class TransferOps {
	private long transferOpsCode;
	private String transferOpsName;
	private String transferOpsDesc;
	private String remarks;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public TransferOps() {

	}

	public TransferOps(long transferOpsCode, String transferOpsName, String transferOpsDesc, String remarks,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.transferOpsCode = transferOpsCode;
		this.transferOpsName = transferOpsName;
		this.transferOpsDesc = transferOpsDesc;
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

	public String getTransferOpsName() {
		return transferOpsName;
	}

	public void setTransferOpsName(String transferOpsName) {
		this.transferOpsName = transferOpsName;
	}

	public String getTransferOpsDesc() {
		return transferOpsDesc;
	}

	public void setTransferOpsDesc(String transferOpsDesc) {
		this.transferOpsDesc = transferOpsDesc;
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
