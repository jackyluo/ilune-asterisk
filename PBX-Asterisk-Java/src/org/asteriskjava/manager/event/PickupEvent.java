
package org.asteriskjava.manager.event;

/**
 * 摘机通话事件（模拟电话中没有这个事件）
 * @author Jacky Luo
 *
 */
public class PickupEvent extends ManagerEvent {
	/**
	 * Serializable version identifier
	 */
	static final long serialVersionUID = -42118640412394856L;

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
	private String targetChannel;
	private String targetChannelState;
	private String targetChannelStateDesc;
	private String targetCallerIDNum;
	private String targetCallerIDName;
	private String targetConnectedLineNum;
	private String targetConnectedLineName;
	private String targetAccountCode;
	private String targetContext;
	private String targetExten;
	private String targetPriority;
	private String targetUniqueId;
	private String targetLinkedId;

	/**
	 * @param source
	 */
	public PickupEvent(Object source) {
		super(source);
	}

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

	public String getTargetChannel() {
		return targetChannel;
	}

	public String getTargetChannelState() {
		return targetChannelState;
	}

	public String getTargetChannelStateDesc() {
		return targetChannelStateDesc;
	}

	public String getTargetCallerIDNum() {
		return targetCallerIDNum;
	}

	public String getTargetCallerIDName() {
		return targetCallerIDName;
	}

	public String getTargetConnectedLineNum() {
		return targetConnectedLineNum;
	}

	public String getTargetConnectedLineName() {
		return targetConnectedLineName;
	}

	public String getTargetAccountCode() {
		return targetAccountCode;
	}

	public String getTargetContext() {
		return targetContext;
	}

	public String getTargetExten() {
		return targetExten;
	}

	public String getTargetPriority() {
		return targetPriority;
	}

	public String getTargetUniqueId() {
		return targetUniqueId;
	}

	public String getTargetLinkedId() {
		return targetLinkedId;
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

	public void setTargetChannel(String targetChannel) {
		this.targetChannel = targetChannel;
	}

	public void setTargetChannelState(String targetChannelState) {
		this.targetChannelState = targetChannelState;
	}

	public void setTargetChannelStateDesc(String targetChannelStateDesc) {
		this.targetChannelStateDesc = targetChannelStateDesc;
	}

	public void setTargetCallerIDNum(String targetCallerIDNum) {
		this.targetCallerIDNum = targetCallerIDNum;
	}

	public void setTargetCallerIDName(String targetCallerIDName) {
		this.targetCallerIDName = targetCallerIDName;
	}

	public void setTargetConnectedLineNum(String targetConnectedLineNum) {
		this.targetConnectedLineNum = targetConnectedLineNum;
	}

	public void setTargetConnectedLineName(String targetConnectedLineName) {
		this.targetConnectedLineName = targetConnectedLineName;
	}

	public void setTargetAccountCode(String targetAccountCode) {
		this.targetAccountCode = targetAccountCode;
	}

	public void setTargetContext(String targetContext) {
		this.targetContext = targetContext;
	}

	public void setTargetExten(String targetExten) {
		this.targetExten = targetExten;
	}

	public void setTargetPriority(String targetPriority) {
		this.targetPriority = targetPriority;
	}

	public void setTargetUniqueId(String targetUniqueId) {
		this.targetUniqueId = targetUniqueId;
	}

	public void setTargetLinkedId(String targetLinkedId) {
		this.targetLinkedId = targetLinkedId;
	}
   
}
