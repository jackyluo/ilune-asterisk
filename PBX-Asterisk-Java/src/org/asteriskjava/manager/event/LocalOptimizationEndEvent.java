package org.asteriskjava.manager.event;

public class LocalOptimizationEndEvent extends ManagerEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LocalOptimizationEndEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	private String localOneChannel;
	private String localOneChannelState;
	private String localOneChannelStateDesc;
	private String localOneCallerIDNum;
	private String localOneCallerIDName;
	private String localOneConnectedLineNum;
	private String localOneConnectedLineName;
	private String localOneAccountCode;
	private String localOneContext;
	private String localOneExten;
	private String localOnePriority;
	private String localOneUniqueid;
	private String localOneLinkedid;
	private String localTwoChannel;
	private String localTwoChannelState;
	private String localTwoChannelStateDesc;
	private String localTwoCallerIDNum;
	private String localTwoCallerIDName;
	private String localTwoConnectedLineNum;
	private String localTwoConnectedLineName;
	private String localTwoAccountCode;
	private String localTwoContext;
	private String localTwoExten;
	private String localTwoPriority;
	private String localTwoUniqueid;
	private String localTwoLinkedid;
	private String success;
	private String id;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getLocalOneChannel() {
		return localOneChannel;
	}
	public String getLocalOneChannelState() {
		return localOneChannelState;
	}
	public String getLocalOneChannelStateDesc() {
		return localOneChannelStateDesc;
	}
	public String getLocalOneCallerIDNum() {
		return localOneCallerIDNum;
	}
	public String getLocalOneCallerIDName() {
		return localOneCallerIDName;
	}
	public String getLocalOneConnectedLineNum() {
		return localOneConnectedLineNum;
	}
	public String getLocalOneConnectedLineName() {
		return localOneConnectedLineName;
	}
	public String getLocalOneAccountCode() {
		return localOneAccountCode;
	}
	public String getLocalOneContext() {
		return localOneContext;
	}
	public String getLocalOneExten() {
		return localOneExten;
	}
	public String getLocalOnePriority() {
		return localOnePriority;
	}
	public String getLocalOneUniqueid() {
		return localOneUniqueid;
	}
	public String getLocalOneLinkedid() {
		return localOneLinkedid;
	}
	public String getLocalTwoChannel() {
		return localTwoChannel;
	}
	public String getLocalTwoChannelState() {
		return localTwoChannelState;
	}
	public String getLocalTwoChannelStateDesc() {
		return localTwoChannelStateDesc;
	}
	public String getLocalTwoCallerIDNum() {
		return localTwoCallerIDNum;
	}
	public String getLocalTwoCallerIDName() {
		return localTwoCallerIDName;
	}
	public String getLocalTwoConnectedLineNum() {
		return localTwoConnectedLineNum;
	}
	public String getLocalTwoConnectedLineName() {
		return localTwoConnectedLineName;
	}
	public String getLocalTwoAccountCode() {
		return localTwoAccountCode;
	}
	public String getLocalTwoContext() {
		return localTwoContext;
	}
	public String getLocalTwoExten() {
		return localTwoExten;
	}
	public String getLocalTwoPriority() {
		return localTwoPriority;
	}
	public String getLocalTwoUniqueid() {
		return localTwoUniqueid;
	}
	public String getLocalTwoLinkedid() {
		return localTwoLinkedid;
	}
	public String getSuccess() {
		return success;
	}
	public String getId() {
		return id;
	}
	public void setLocalOneChannel(String localOneChannel) {
		this.localOneChannel = localOneChannel;
	}
	public void setLocalOneChannelState(String localOneChannelState) {
		this.localOneChannelState = localOneChannelState;
	}
	public void setLocalOneChannelStateDesc(String localOneChannelStateDesc) {
		this.localOneChannelStateDesc = localOneChannelStateDesc;
	}
	public void setLocalOneCallerIDNum(String localOneCallerIDNum) {
		this.localOneCallerIDNum = localOneCallerIDNum;
	}
	public void setLocalOneCallerIDName(String localOneCallerIDName) {
		this.localOneCallerIDName = localOneCallerIDName;
	}
	public void setLocalOneConnectedLineNum(String localOneConnectedLineNum) {
		this.localOneConnectedLineNum = localOneConnectedLineNum;
	}
	public void setLocalOneConnectedLineName(String localOneConnectedLineName) {
		this.localOneConnectedLineName = localOneConnectedLineName;
	}
	public void setLocalOneAccountCode(String localOneAccountCode) {
		this.localOneAccountCode = localOneAccountCode;
	}
	public void setLocalOneContext(String localOneContext) {
		this.localOneContext = localOneContext;
	}
	public void setLocalOneExten(String localOneExten) {
		this.localOneExten = localOneExten;
	}
	public void setLocalOnePriority(String localOnePriority) {
		this.localOnePriority = localOnePriority;
	}
	public void setLocalOneUniqueid(String localOneUniqueid) {
		this.localOneUniqueid = localOneUniqueid;
	}
	public void setLocalOneLinkedid(String localOneLinkedid) {
		this.localOneLinkedid = localOneLinkedid;
	}
	public void setLocalTwoChannel(String localTwoChannel) {
		this.localTwoChannel = localTwoChannel;
	}
	public void setLocalTwoChannelState(String localTwoChannelState) {
		this.localTwoChannelState = localTwoChannelState;
	}
	public void setLocalTwoChannelStateDesc(String localTwoChannelStateDesc) {
		this.localTwoChannelStateDesc = localTwoChannelStateDesc;
	}
	public void setLocalTwoCallerIDNum(String localTwoCallerIDNum) {
		this.localTwoCallerIDNum = localTwoCallerIDNum;
	}
	public void setLocalTwoCallerIDName(String localTwoCallerIDName) {
		this.localTwoCallerIDName = localTwoCallerIDName;
	}
	public void setLocalTwoConnectedLineNum(String localTwoConnectedLineNum) {
		this.localTwoConnectedLineNum = localTwoConnectedLineNum;
	}
	public void setLocalTwoConnectedLineName(String localTwoConnectedLineName) {
		this.localTwoConnectedLineName = localTwoConnectedLineName;
	}
	public void setLocalTwoAccountCode(String localTwoAccountCode) {
		this.localTwoAccountCode = localTwoAccountCode;
	}
	public void setLocalTwoContext(String localTwoContext) {
		this.localTwoContext = localTwoContext;
	}
	public void setLocalTwoExten(String localTwoExten) {
		this.localTwoExten = localTwoExten;
	}
	public void setLocalTwoPriority(String localTwoPriority) {
		this.localTwoPriority = localTwoPriority;
	}
	public void setLocalTwoUniqueid(String localTwoUniqueid) {
		this.localTwoUniqueid = localTwoUniqueid;
	}
	public void setLocalTwoLinkedid(String localTwoLinkedid) {
		this.localTwoLinkedid = localTwoLinkedid;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
