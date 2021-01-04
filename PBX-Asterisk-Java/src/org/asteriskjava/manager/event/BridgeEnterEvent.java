
package org.asteriskjava.manager.event;

/**
 
 BridgeEnter<br>
Synopsis<br>
Raised when a channel enters a bridge.<br>
Description<br>
Syntax<br>
Event: BridgeEnter<br>
BridgeUniqueid: <value><br>
BridgeType: <value><br>
BridgeTechnology: <value><br>
BridgeCreator: <value><br>
BridgeName: <value><br>
BridgeNumChannels: <value><br>
BridgeVideoSourceMode: <value><br>
BridgeVideoSource: <value><br>
Channel: <value><br>
ChannelState: <value><br>
ChannelStateDesc: <value><br>
CallerIDNum: <value><br>
CallerIDName: <value><br>
ConnectedLineNum: <value><br>
ConnectedLineName: <value><br>
AccountCode: <value><br>
Context: <value><br>
Exten: <value><br>
Priority: <value><br>
Uniqueid: <value><br>
Linkedid: <value><br>
SwapUniqueid: <value><br>
Arguments<br>
BridgeUniqueid<br>
BridgeType - The type of bridge<br>
BridgeTechnology - Technology in use by the bridge<br>
BridgeCreator - Entity that created the bridge if applicable<br>
BridgeName - Name used to refer to the bridge by its BridgeCreator if applicable<br>
BridgeNumChannels - Number of channels in the bridge<br>
BridgeVideoSourceMode - ** none<br>
talker<br>
single<br>
The video source mode for the bridge.<br>
BridgeVideoSource - If there is a video source for the bridge, the unique ID of the channel that is the video source.<br>
Channel<br>
ChannelState - A numeric code for the channel's current state, related to ChannelStateDesc<br>
ChannelStateDesc<br>
Down<br>
Rsrvd<br>
OffHook<br>
Dialing<br>
Ring<br>
Ringing<br>
Up<br>
Busy<br>
Dialing Offhook<br>
Pre-ring<br>
Unknown<br>
CallerIDNum<br>
CallerIDName<br>
ConnectedLineNum<br>
ConnectedLineName<br>
AccountCode<br>
Context<br>
Exten<br>
Priority<br>
Uniqueid<br>
Linkedid - Uniqueid of the oldest channel associated with this channel.<br>
SwapUniqueid - The uniqueid of the channel being swapped out of the bridge<br>
 */
public class BridgeEnterEvent extends BridgeEvent {
	/**
	 * Serializable version identifier.
	 */
	private static final long serialVersionUID = 0L;

	public BridgeEnterEvent(Object source) {
		super(source);
	}
	//Event: BridgeEnter
	private String bridgeUniqueid;
	private String bridgeType;
	private String bridgeTechnology;
	private String bridgeCreator;
	private String bridgeName;
	private String bridgeNumChannels;
	private String bridgeVideoSourceMode;
	private String bridgeVideoSource;
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
	private String swapUniqueid;

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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getBridgeUniqueid() {
		return bridgeUniqueid;
	}
	public String getBridgeType() {
		return bridgeType;
	}
	public String getBridgeTechnology() {
		return bridgeTechnology;
	}
	public String getBridgeCreator() {
		return bridgeCreator;
	}
	public String getBridgeName() {
		return bridgeName;
	}
	public String getBridgeNumChannels() {
		return bridgeNumChannels;
	}
	public String getBridgeVideoSourceMode() {
		return bridgeVideoSourceMode;
	}
	public String getBridgeVideoSource() {
		return bridgeVideoSource;
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
	  
	public String getSwapUniqueid() {
		return swapUniqueid;
	}
	public void setBridgeUniqueid(String bridgeUniqueid) {
		this.bridgeUniqueid = bridgeUniqueid;
	}
	public void setBridgeType(String bridgeType) {
		this.bridgeType = bridgeType;
	}
	public void setBridgeTechnology(String bridgeTechnology) {
		this.bridgeTechnology = bridgeTechnology;
	}
	public void setBridgeCreator(String bridgeCreator) {
		this.bridgeCreator = bridgeCreator;
	}
	public void setBridgeName(String bridgeName) {
		this.bridgeName = bridgeName;
	}
	public void setBridgeNumChannels(String bridgeNumChannels) {
		this.bridgeNumChannels = bridgeNumChannels;
	}
	public void setBridgeVideoSourceMode(String bridgeVideoSourceMode) {
		this.bridgeVideoSourceMode = bridgeVideoSourceMode;
	}
	public void setBridgeVideoSource(String bridgeVideoSource) {
		this.bridgeVideoSource = bridgeVideoSource;
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
	 
	public void setSwapUniqueid(String swapUniqueid) {
		this.swapUniqueid = swapUniqueid;
	}
    
}
