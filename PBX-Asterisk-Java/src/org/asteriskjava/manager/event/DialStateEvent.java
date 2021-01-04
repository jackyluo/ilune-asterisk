package org.asteriskjava.manager.event;

public class DialStateEvent extends ManagerEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -211106147062394841L;

	public DialStateEvent(Object source) {
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
	private String destChannel;
	private String destChannelState;
	private String destChannelStateDesc;
	private String destCallerIDNum;
	private String destCallerIDName;
	private String destConnectedLineNum;
	private String destConnectedLineName;
	private String destAccountCode;
	private String destContext;
	private String destExten;
	private String destPriority;
	private String destUniqueid;
	private String destLinkedid;
	private String dialStatus;
	private String forward;

	private String destLanguage;
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
	public String getUniqueId() {
		return uniqueId;
	}
	public String getLinkedId() {
		return linkedId;
	}
	public String getDestChannel() {
		return destChannel;
	}
	public String getDestChannelState() {
		return destChannelState;
	}
	public String getDestChannelStateDesc() {
		return destChannelStateDesc;
	}
	public String getDestCallerIDNum() {
		return destCallerIDNum;
	}
	public String getDestCallerIDName() {
		return destCallerIDName;
	}
	public String getDestConnectedLineNum() {
		return destConnectedLineNum;
	}
	public String getDestConnectedLineName() {
		return destConnectedLineName;
	}
	public String getDestAccountCode() {
		return destAccountCode;
	}
	public String getDestContext() {
		return destContext;
	}
	public String getDestExten() {
		return destExten;
	}
	public String getDestPriority() {
		return destPriority;
	}
	public String getDestUniqueid() {
		return destUniqueid;
	}
	public String getDestLinkedid() {
		return destLinkedid;
	}
	public String getDialStatus() {
		return dialStatus;
	}
	public String getForward() {
		return forward;
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
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public void setLinkedId(String linkedId) {
		this.linkedId = linkedId;
	}
	public void setDestChannel(String destChannel) {
		this.destChannel = destChannel;
	}
	public void setDestChannelState(String destChannelState) {
		this.destChannelState = destChannelState;
	}
	public void setDestChannelStateDesc(String destChannelStateDesc) {
		this.destChannelStateDesc = destChannelStateDesc;
	}
	public void setDestCallerIDNum(String destCallerIDNum) {
		this.destCallerIDNum = destCallerIDNum;
	}
	public void setDestCallerIDName(String destCallerIDName) {
		this.destCallerIDName = destCallerIDName;
	}
	public void setDestConnectedLineNum(String destConnectedLineNum) {
		this.destConnectedLineNum = destConnectedLineNum;
	}
	public void setDestConnectedLineName(String destConnectedLineName) {
		this.destConnectedLineName = destConnectedLineName;
	}
	public void setDestAccountCode(String destAccountCode) {
		this.destAccountCode = destAccountCode;
	}
	public void setDestContext(String destContext) {
		this.destContext = destContext;
	}
	public void setDestExten(String destExten) {
		this.destExten = destExten;
	}
	public void setDestPriority(String destPriority) {
		this.destPriority = destPriority;
	}
	public void setDestUniqueid(String destUniqueid) {
		this.destUniqueid = destUniqueid;
	}
	public void setDestLinkedid(String destLinkedid) {
		this.destLinkedid = destLinkedid;
	}
	public void setDialStatus(String dialStatus) {
		this.dialStatus = dialStatus;
	}
	public void setForward(String forward) {
		this.forward = forward;
	}
	public String getDestLanguage() {
		return destLanguage;
	}
	public void setDestLanguage(String destLanguage) {
		this.destLanguage = destLanguage;
	}

}
