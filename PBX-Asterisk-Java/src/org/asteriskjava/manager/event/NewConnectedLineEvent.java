package org.asteriskjava.manager.event;

public class NewConnectedLineEvent extends ManagerEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6224217674020887736L;

	public NewConnectedLineEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	private String channel;
	private String channelState;
	private String channelStateDesc;
	private String callerIDNum;
	private String callerIDName;
	private String connectedLineNum;
	private String connectedLineName;
	private String accountCode;
	private String context;
	private String exten;
	private String priority;
	private String uniqueId;
	private String linkedId;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getChannel() {
		return channel;
	}
	public String getChannelState() {
		return channelState;
	}
	public String getChannelStateDesc() {
		return channelStateDesc;
	}
	public String getCallerIDNum() {
		return callerIDNum;
	}
	public String getCallerIDName() {
		return callerIDName;
	}
	public String getConnectedLineNum() {
		return connectedLineNum;
	}
	public String getConnectedLineName() {
		return connectedLineName;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public String getContext() {
		return context;
	}
	public String getExten() {
		return exten;
	}
	public String getPriority() {
		return priority;
	}
	 
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public void setChannelState(String channelState) {
		this.channelState = channelState;
	}
	public void setChannelStateDesc(String channelStateDesc) {
		this.channelStateDesc = channelStateDesc;
	}
	public void setCallerIDNum(String callerIDNum) {
		this.callerIDNum = callerIDNum;
	}
	public void setCallerIDName(String callerIDName) {
		this.callerIDName = callerIDName;
	}
	public void setConnectedLineNum(String connectedLineNum) {
		this.connectedLineNum = connectedLineNum;
	}
	public void setConnectedLineName(String connectedLineName) {
		this.connectedLineName = connectedLineName;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public void setExten(String exten) {
		this.exten = exten;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public String getLinkedId() {
		return linkedId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public void setLinkedId(String linkedId) {
		this.linkedId = linkedId;
	}
	 
	
}
