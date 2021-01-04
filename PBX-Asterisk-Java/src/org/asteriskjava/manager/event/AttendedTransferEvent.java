package org.asteriskjava.manager.event;

/**
 * Synopsis<br>
 * <p>
 * Raised when an attended transfer is complete.
 * </p>
 * Description<br>
 * <p>
 * The headers in this event attempt to describe all the major details of the
 * attended transfer. The two transferer channels and the two bridges are
 * determined based on their chronological establishment. So consider that Alice
 * calls Bob, and then Alice transfers the call to Voicemail. The transferer and
 * bridge headers would be arranged as follows:<br>
 * OrigTransfererChannel: Alice's channel in the bridge with Bob.<br>
 * OrigBridgeUniqueid: The bridge between Alice and Bob.<br>
 * SecondTransfererChannel: Alice's channel that called Voicemail.<br>
 * SecondBridgeUniqueid: Not present, since a call to Voicemail has no
 * bridge.<br>
 * Now consider if the order were reversed; instead of having Alice call Bob and
 * transfer him to Voicemail, Alice instead calls her Voicemail and transfers
 * that to Bob. The transferer and bridge headers would be arranged as
 * follows:<br>
 * OrigTransfererChannel: Alice's channel that called Voicemail.<br>
 * OrigBridgeUniqueid: Not present, since a call to Voicemail has no bridge.<br>
 * SecondTransfererChannel: Alice's channel in the bridge with Bob.<br>
 * SecondBridgeUniqueid: The bridge between Alice and Bob.<br>
 * </p>
 * Syntax<br>
 * Event: AttendedTransfer<br>
 * Result: <value><br>
 * OrigTransfererChannel: <value><br>
 * OrigTransfererChannelState: <value><br>
 * OrigTransfererChannelStateDesc: <value><br>
 * OrigTransfererCallerIDNum: <value><br>
 * OrigTransfererCallerIDName: <value><br>
 * OrigTransfererConnectedLineNum: <value><br>
 * OrigTransfererConnectedLineName: <value><br>
 * OrigTransfererAccountCode: <value><br>
 * OrigTransfererContext: <value><br>
 * OrigTransfererExten: <value><br>
 * OrigTransfererPriority: <value><br>
 * OrigTransfererUniqueid: <value><br>
 * OrigTransfererLinkedid: <value><br>
 * OrigBridgeUniqueid: <value><br>
 * OrigBridgeType: <value><br>
 * OrigBridgeTechnology: <value><br>
 * OrigBridgeCreator: <value><br>
 * OrigBridgeName: <value><br>
 * OrigBridgeNumChannels: <value><br>
 * OrigBridgeVideoSourceMode: <value><br>
 * OrigBridgeVideoSource: <value><br>
 * SecondTransfererChannel: <value><br>
 * SecondTransfererChannelState: <value><br>
 * SecondTransfererChannelStateDesc: <value><br>
 * SecondTransfererCallerIDNum: <value><br>
 * SecondTransfererCallerIDName: <value><br>
 * SecondTransfererConnectedLineNum: <value><br>
 * SecondTransfererConnectedLineName: <value><br>
 * SecondTransfererAccountCode: <value><br>
 * SecondTransfererContext: <value><br>
 * SecondTransfererExten: <value><br>
 * SecondTransfererPriority: <value><br>
 * SecondTransfererUniqueid: <value><br>
 * SecondTransfererLinkedid: <value><br>
 * SecondBridgeUniqueid: <value><br>
 * SecondBridgeType: <value><br>
 * SecondBridgeTechnology: <value><br>
 * SecondBridgeCreator: <value><br>
 * SecondBridgeName: <value><br>
 * SecondBridgeNumChannels: <value><br>
 * SecondBridgeVideoSourceMode: <value><br>
 * SecondBridgeVideoSource: <value><br>
 * DestType: <value><br>
 * DestBridgeUniqueid: <value><br>
 * DestApp: <value><br>
 * LocalOneChannel: <value><br>
 * LocalOneChannelState: <value><br>
 * LocalOneChannelStateDesc: <value><br>
 * LocalOneCallerIDNum: <value><br>
 * LocalOneCallerIDName: <value><br>
 * LocalOneConnectedLineNum: <value><br>
 * LocalOneConnectedLineName: <value><br>
 * LocalOneAccountCode: <value><br>
 * LocalOneContext: <value><br>
 * LocalOneExten: <value><br>
 * LocalOnePriority: <value><br>
 * LocalOneUniqueid: <value><br>
 * LocalOneLinkedid: <value><br>
 * LocalTwoChannel: <value><br>
 * LocalTwoChannelState: <value><br>
 * LocalTwoChannelStateDesc: <value><br>
 * LocalTwoCallerIDNum: <value><br>
 * LocalTwoCallerIDName: <value><br>
 * LocalTwoConnectedLineNum: <value><br>
 * LocalTwoConnectedLineName: <value><br>
 * LocalTwoAccountCode: <value><br>
 * LocalTwoContext: <value><br>
 * LocalTwoExten: <value><br>
 * LocalTwoPriority: <value><br>
 * LocalTwoUniqueid: <value><br>
 * LocalTwoLinkedid: <value><br>
 * DestTransfererChannel: <value><br>
 * TransfereeChannel: <value><br>
 * TransfereeChannelState: <value><br>
 * TransfereeChannelStateDesc: <value><br>
 * TransfereeCallerIDNum: <value><br>
 * TransfereeCallerIDName: <value><br>
 * TransfereeConnectedLineNum: <value><br>
 * TransfereeConnectedLineName: <value><br>
 * TransfereeAccountCode: <value><br>
 * TransfereeContext: <value><br>
 * TransfereeExten: <value><br>
 * TransfereePriority: <value><br>
 * TransfereeUniqueid: <value><br>
 * TransfereeLinkedid: <value><br>
 * 
 * 
 * Arguments<br>
 * Result - Indicates if the transfer was successful or if it failed.<br>
 * Fail - An internal error occurred.<br>
 * Invalid - Invalid configuration for transfer (e.g. Not bridged)<br>
 * Not Permitted - Bridge does not permit transfers<br>
 * Success - Transfer completed successfully<br>
 * Note<br>
 * Icon<br>
 * A result of Success does not necessarily mean that a target was succesfully
 * contacted. It means that a party was succesfully placed into the dialplan at
 * the expected location. OrigTransfererChannel<br>
 * OrigTransfererChannelState - A numeric code for the channel's current state,
 * related to OrigTransfererChannelStateDesc<br>
 * OrigTransfererChannelStateDesc<br>
 * Down<br>
 * Rsrvd<br>
 * OffHook<br>
 * Dialing<br>
 * Ring<br>
 * Ringing<br>
 * Up<br>
 * Busy<br>
 * Dialing Offhook<br>
 * Pre-ring<br>
 * Unknown<br>
 * <br>
 * OrigTransfererCallerIDNum<br>
 * OrigTransfererCallerIDName<br>
 * OrigTransfererConnectedLineNum<br>
 * <br>
 * OrigTransfererConnectedLineName<br>
 * OrigTransfererAccountCode<br>
 * OrigTransfererContext<br>
 * OrigTransfererExten<br>
 * OrigTransfererPriority<br>
 * OrigTransfererUniqueid<br>
 * OrigTransfererLinkedid - Uniqueid of the oldest channel associated with this
 * channel.<br>
 * OrigBridgeUniqueid<br>
 * OrigBridgeType - The type of bridge<br>
 * OrigBridgeTechnology - Technology in use by the bridge<br>
 * OrigBridgeCreator - Entity that created the bridge if applicable<br>
 * OrigBridgeName - Name used to refer to the bridge by its BridgeCreator if
 * applicable<br>
 * <br>
 * OrigBridgeNumChannels - Number of channels in the bridge<br>
 * OrigBridgeVideoSourceMode - ** none<br>
 * talker<br>
 * single<br>
 * The video source mode for the bridge.<br>
 * OrigBridgeVideoSource - If there is a video source for the bridge, the unique
 * ID of the channel that is the video source.<br>
 * SecondTransfererChannel<br>
 * SecondTransfererChannelState - A numeric code for the channel's current
 * state, related to SecondTransfererChannelStateDesc<br>
 * SecondTransfererChannelStateDesc<br>
 * Down<br>
 * Rsrvd<br>
 * OffHook<br>
 * Dialing<br>
 * Ring<br>
 * Ringing<br>
 * Up<br>
 * Busy<br>
 * Dialing Offhook<br>
 * Pre-ring<br>
 * Unknown<br>
 * SecondTransfererCallerIDNum<br>
 * SecondTransfererCallerIDName<br>
 * SecondTransfererConnectedLineNum<br>
 * SecondTransfererConnectedLineName<br>
 * SecondTransfererAccountCode<br>
 * SecondTransfererContext<br>
 * SecondTransfererExten<br>
 * SecondTransfererPriority<br>
 * SecondTransfererUniqueid<br>
 * SecondTransfererLinkedid - Uniqueid of the oldest channel associated with
 * this channel.<br>
 * <br>
 * SecondBridgeUniqueid<br>
 * SecondBridgeType - The type of bridge<br>
 * SecondBridgeTechnology - Technology in use by the bridge<br>
 * SecondBridgeCreator - Entity that created the bridge if applicable<br>
 * SecondBridgeName - Name used to refer to the bridge by its BridgeCreator if
 * applicable<br>
 * SecondBridgeNumChannels - Number of channels in the bridge<br>
 * SecondBridgeVideoSourceMode - ** none<br>
 * talker<br>
 * single<br>
 * The video source mode for the bridge.<br>
 * SecondBridgeVideoSource - If there is a video source for the bridge, the
 * unique ID of the channel that is the video source.<br>
 * DestType - Indicates the method by which the attended transfer completed.<br>
 * Bridge - The transfer was accomplished by merging two bridges into one.<br>
 * App - The transfer was accomplished by having a channel or bridge run a
 * dialplan application.<br>
 * Link - The transfer was accomplished by linking two bridges together using a
 * local channel pair.<br>
 * Threeway - The transfer was accomplished by placing all parties into a
 * threeway call.<br>
 * Fail - The transfer failed.<br>
 * DestBridgeUniqueid - Indicates the surviving bridge when bridges were merged
 * to complete the transfer<br>
 * Note<br>
 * Icon<br>
 * This header is only present when DestType is Bridge or Threeway<br>
 * DestApp - Indicates the application that is running when the transfer
 * completes<br>
 * Note<br>
 * Icon<br>
 * This header is only present when DestType is App<br>
 * LocalOneChannel<br>
 * LocalOneChannelState - A numeric code for the channel's current state,
 * related to LocalOneChannelStateDesc<br>
 * LocalOneChannelStateDesc<br>
 * Down<br>
 * Rsrvd<br>
 * OffHook<br>
 * Dialing<br>
 * Ring<br>
 * Ringing<br>
 * Up<br>
 * Busy<br>
 * Dialing Offhook<br>
 * Pre-ring<br>
 * Unknown<br>
 * LocalOneCallerIDNum<br>
 * LocalOneCallerIDName<br>
 * LocalOneConnectedLineNum<br>
 * LocalOneConnectedLineName<br>
 * LocalOneAccountCode<br>
 * LocalOneContext<br>
 * LocalOneExten<br>
 * LocalOnePriority<br>
 * LocalOneUniqueid<br>
 * LocalOneLinkedid - Uniqueid of the oldest channel associated with this
 * channel.<br>
 * LocalTwoChannel<br>
 * LocalTwoChannelState - A numeric code for the channel's current state,
 * related to LocalTwoChannelStateDesc<br>
 * LocalTwoChannelStateDesc<br>
 * Down<br>
 * Rsrvd<br>
 * OffHook<br>
 * Dialing<br>
 * Ring<br>
 * Ringing<br>
 * Up<br>
 * Busy<br>
 * Dialing Offhook<br>
 * Pre-ring<br>
 * Unknown<br>
 * LocalTwoCallerIDNum<br>
 * LocalTwoCallerIDName<br>
 * LocalTwoConnectedLineNum<br>
 * LocalTwoConnectedLineName<br>
 * LocalTwoAccountCode<br>
 * LocalTwoContext<br>
 * LocalTwoExten<br>
 * LocalTwoPriority<br>
 * LocalTwoUniqueid<br>
 * LocalTwoLinkedid - Uniqueid of the oldest channel associated with this
 * channel.<br>
 * DestTransfererChannel - The name of the surviving transferer channel when a
 * transfer results in a threeway call<br>
 * <br>
 * Note<br>
 * Icon<br>
 * This header is only present when DestType is Threeway<br>
 * TransfereeChannel<br>
 * TransfereeChannelState - A numeric code for the channel's current state,
 * related to TransfereeChannelStateDesc<br>
 * TransfereeChannelStateDesc<br>
 * Down<br>
 * Rsrvd<br>
 * OffHook<br>
 * Dialing<br>
 * Ring<br>
 * Ringing<br>
 * Up<br>
 * Busy<br>
 * Dialing Offhook<br>
 * Pre-ring<br>
 * Unknown<br>
 * TransfereeCallerIDNum<br>
 * TransfereeCallerIDName<br>
 * TransfereeConnectedLineNum<br>
 * TransfereeConnectedLineName<br>
 * TransfereeAccountCode<br>
 * TransfereeContext<br>
 * TransfereeExten<br>
 * TransfereePriority<br>
 * TransfereeUniqueid<br>
 * <br>
 * TransfereeLinkedid - Uniqueid of the oldest channel associated with this
 * channel.<br>
 * 
 * @author Jacky Luo
 *
 */
public class AttendedTransferEvent extends ManagerEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4526291078365634816L;
	
	public AttendedTransferEvent(Object source) {
		super(source);

	}

	private String result;
	private String origTransfererChannel;
	private String origTransfererChannelState;
	private String origTransfererChannelStateDesc;
	private String origTransfererCallerIDNum;
	private String origTransfererCallerIDName;
	private String origTransfererConnectedLineNum;
	private String origTransfererConnectedLineName;
	private String origTransfererAccountCode;
	private String origTransfererContext;
	private String origTransfererExten;
	private String origTransfererPriority;
	private String origTransfererUniqueid;
	private String origTransfererLinkedid;
	private String origBridgeUniqueid;
	private String origBridgeType;
	private String origBridgeTechnology;
	private String origBridgeCreator;
	private String origBridgeName;
	private String origBridgeNumChannels;
	private String origBridgeVideoSourceMode;
	private String origBridgeVideoSource;
	private String secondTransfererChannel;
	private String secondTransfererChannelState;
	private String secondTransfererChannelStateDesc;
	private String secondTransfererCallerIDNum;
	private String secondTransfererCallerIDName;
	private String secondTransfererConnectedLineNum;
	private String secondTransfererConnectedLineName;
	private String secondTransfererAccountCode;
	private String secondTransfererContext;
	private String secondTransfererExten;
	private String secondTransfererPriority;
	private String secondTransfererUniqueid;
	private String secondTransfererLinkedid;
	private String secondBridgeUniqueid;
	private String secondBridgeType;
	private String secondBridgeTechnology;
	private String secondBridgeCreator;
	private String secondBridgeName;
	private String secondBridgeNumChannels;
	private String secondBridgeVideoSourceMode;
	private String secondBridgeVideoSource;
	private String destType;
	private String destBridgeUniqueid;
	private String destApp;
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
	private String desttransfererChannel;
	private String transfereeChannel;
	private String transfereeChannelState;
	private String transfereeChannelStateDesc;
	private String transfereeCallerIDNum;
	private String transfereeCallerIDName;
	private String transfereeConnectedLineNum;
	private String transfereeConnectedLineName;
	private String transfereeAccountCode;
	private String transfereeContext;
	private String transfereeExten;
	private String transfereePriority;
	private String transfereeUniqueid;
	private String transfereeLinkedid;
	public String getResult() {
		return result;
	}
	public String getOrigTransfererChannel() {
		return origTransfererChannel;
	}
	public String getOrigTransfererChannelState() {
		return origTransfererChannelState;
	}
	public String getOrigTransfererChannelStateDesc() {
		return origTransfererChannelStateDesc;
	}
	public String getOrigTransfererCallerIDNum() {
		return origTransfererCallerIDNum;
	}
	public String getOrigTransfererCallerIDName() {
		return origTransfererCallerIDName;
	}
	public String getOrigTransfererConnectedLineNum() {
		return origTransfererConnectedLineNum;
	}
	public String getOrigTransfererConnectedLineName() {
		return origTransfererConnectedLineName;
	}
	public String getOrigTransfererAccountCode() {
		return origTransfererAccountCode;
	}
	public String getOrigTransfererContext() {
		return origTransfererContext;
	}
	public String getOrigTransfererExten() {
		return origTransfererExten;
	}
	public String getOrigTransfererPriority() {
		return origTransfererPriority;
	}
	public String getOrigTransfererUniqueid() {
		return origTransfererUniqueid;
	}
	public String getOrigTransfererLinkedid() {
		return origTransfererLinkedid;
	}
	public String getOrigBridgeUniqueid() {
		return origBridgeUniqueid;
	}
	public String getOrigBridgeType() {
		return origBridgeType;
	}
	public String getOrigBridgeTechnology() {
		return origBridgeTechnology;
	}
	public String getOrigBridgeCreator() {
		return origBridgeCreator;
	}
	public String getOrigBridgeName() {
		return origBridgeName;
	}
	public String getOrigBridgeNumChannels() {
		return origBridgeNumChannels;
	}
	public String getOrigBridgeVideoSourceMode() {
		return origBridgeVideoSourceMode;
	}
	public String getOrigBridgeVideoSource() {
		return origBridgeVideoSource;
	}
	public String getSecondTransfererChannel() {
		return secondTransfererChannel;
	}
	public String getSecondTransfererChannelState() {
		return secondTransfererChannelState;
	}
	public String getSecondTransfererChannelStateDesc() {
		return secondTransfererChannelStateDesc;
	}
	public String getSecondTransfererCallerIDNum() {
		return secondTransfererCallerIDNum;
	}
	public String getSecondTransfererCallerIDName() {
		return secondTransfererCallerIDName;
	}
	public String getSecondTransfererConnectedLineNum() {
		return secondTransfererConnectedLineNum;
	}
	public String getSecondTransfererConnectedLineName() {
		return secondTransfererConnectedLineName;
	}
	public String getSecondTransfererAccountCode() {
		return secondTransfererAccountCode;
	}
	public String getSecondTransfererContext() {
		return secondTransfererContext;
	}
	public String getSecondTransfererExten() {
		return secondTransfererExten;
	}
	public String getSecondTransfererPriority() {
		return secondTransfererPriority;
	}
	public String getSecondTransfererUniqueid() {
		return secondTransfererUniqueid;
	}
	public String getSecondTransfererLinkedid() {
		return secondTransfererLinkedid;
	}
	public String getSecondBridgeUniqueid() {
		return secondBridgeUniqueid;
	}
	public String getSecondBridgeType() {
		return secondBridgeType;
	}
	public String getSecondBridgeTechnology() {
		return secondBridgeTechnology;
	}
	public String getSecondBridgeCreator() {
		return secondBridgeCreator;
	}
	public String getSecondBridgeName() {
		return secondBridgeName;
	}
	public String getSecondBridgeNumChannels() {
		return secondBridgeNumChannels;
	}
	public String getSecondBridgeVideoSourceMode() {
		return secondBridgeVideoSourceMode;
	}
	public String getSecondBridgeVideoSource() {
		return secondBridgeVideoSource;
	}
	public String getDestType() {
		return destType;
	}
	public String getDestBridgeUniqueid() {
		return destBridgeUniqueid;
	}
	public String getDestApp() {
		return destApp;
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
	public String getDesttransfererChannel() {
		return desttransfererChannel;
	}
	public String getTransfereeChannel() {
		return transfereeChannel;
	}
	public String getTransfereeChannelState() {
		return transfereeChannelState;
	}
	public String getTransfereeChannelStateDesc() {
		return transfereeChannelStateDesc;
	}
	public String getTransfereeCallerIDNum() {
		return transfereeCallerIDNum;
	}
	public String getTransfereeCallerIDName() {
		return transfereeCallerIDName;
	}
	public String getTransfereeConnectedLineNum() {
		return transfereeConnectedLineNum;
	}
	public String getTransfereeConnectedLineName() {
		return transfereeConnectedLineName;
	}
	public String getTransfereeAccountCode() {
		return transfereeAccountCode;
	}
	public String getTransfereeContext() {
		return transfereeContext;
	}
	public String getTransfereeExten() {
		return transfereeExten;
	}
	public String getTransfereePriority() {
		return transfereePriority;
	}
	public String getTransfereeUniqueid() {
		return transfereeUniqueid;
	}
	public String getTransfereeLinkedid() {
		return transfereeLinkedid;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public void setOrigTransfererChannel(String origTransfererChannel) {
		this.origTransfererChannel = origTransfererChannel;
	}
	public void setOrigTransfererChannelState(String origTransfererChannelState) {
		this.origTransfererChannelState = origTransfererChannelState;
	}
	public void setOrigTransfererChannelStateDesc(String origTransfererChannelStateDesc) {
		this.origTransfererChannelStateDesc = origTransfererChannelStateDesc;
	}
	public void setOrigTransfererCallerIDNum(String origTransfererCallerIDNum) {
		this.origTransfererCallerIDNum = origTransfererCallerIDNum;
	}
	public void setOrigTransfererCallerIDName(String origTransfererCallerIDName) {
		this.origTransfererCallerIDName = origTransfererCallerIDName;
	}
	public void setOrigTransfererConnectedLineNum(String origTransfererConnectedLineNum) {
		this.origTransfererConnectedLineNum = origTransfererConnectedLineNum;
	}
	public void setOrigTransfererConnectedLineName(String origTransfererConnectedLineName) {
		this.origTransfererConnectedLineName = origTransfererConnectedLineName;
	}
	public void setOrigTransfererAccountCode(String origTransfererAccountCode) {
		this.origTransfererAccountCode = origTransfererAccountCode;
	}
	public void setOrigTransfererContext(String origTransfererContext) {
		this.origTransfererContext = origTransfererContext;
	}
	public void setOrigTransfererExten(String origTransfererExten) {
		this.origTransfererExten = origTransfererExten;
	}
	public void setOrigTransfererPriority(String origTransfererPriority) {
		this.origTransfererPriority = origTransfererPriority;
	}
	public void setOrigTransfererUniqueid(String origTransfererUniqueid) {
		this.origTransfererUniqueid = origTransfererUniqueid;
	}
	public void setOrigTransfererLinkedid(String origTransfererLinkedid) {
		this.origTransfererLinkedid = origTransfererLinkedid;
	}
	public void setOrigBridgeUniqueid(String origBridgeUniqueid) {
		this.origBridgeUniqueid = origBridgeUniqueid;
	}
	public void setOrigBridgeType(String origBridgeType) {
		this.origBridgeType = origBridgeType;
	}
	public void setOrigBridgeTechnology(String origBridgeTechnology) {
		this.origBridgeTechnology = origBridgeTechnology;
	}
	public void setOrigBridgeCreator(String origBridgeCreator) {
		this.origBridgeCreator = origBridgeCreator;
	}
	public void setOrigBridgeName(String origBridgeName) {
		this.origBridgeName = origBridgeName;
	}
	public void setOrigBridgeNumChannels(String origBridgeNumChannels) {
		this.origBridgeNumChannels = origBridgeNumChannels;
	}
	public void setOrigBridgeVideoSourceMode(String origBridgeVideoSourceMode) {
		this.origBridgeVideoSourceMode = origBridgeVideoSourceMode;
	}
	public void setOrigBridgeVideoSource(String origBridgeVideoSource) {
		this.origBridgeVideoSource = origBridgeVideoSource;
	}
	public void setSecondTransfererChannel(String secondTransfererChannel) {
		this.secondTransfererChannel = secondTransfererChannel;
	}
	public void setSecondTransfererChannelState(String secondTransfererChannelState) {
		this.secondTransfererChannelState = secondTransfererChannelState;
	}
	public void setSecondTransfererChannelStateDesc(String secondTransfererChannelStateDesc) {
		this.secondTransfererChannelStateDesc = secondTransfererChannelStateDesc;
	}
	public void setSecondTransfererCallerIDNum(String secondTransfererCallerIDNum) {
		this.secondTransfererCallerIDNum = secondTransfererCallerIDNum;
	}
	public void setSecondTransfererCallerIDName(String secondTransfererCallerIDName) {
		this.secondTransfererCallerIDName = secondTransfererCallerIDName;
	}
	public void setSecondTransfererConnectedLineNum(String secondTransfererConnectedLineNum) {
		this.secondTransfererConnectedLineNum = secondTransfererConnectedLineNum;
	}
	public void setSecondTransfererConnectedLineName(String secondTransfererConnectedLineName) {
		this.secondTransfererConnectedLineName = secondTransfererConnectedLineName;
	}
	public void setSecondTransfererAccountCode(String secondTransfererAccountCode) {
		this.secondTransfererAccountCode = secondTransfererAccountCode;
	}
	public void setSecondTransfererContext(String secondTransfererContext) {
		this.secondTransfererContext = secondTransfererContext;
	}
	public void setSecondTransfererExten(String secondTransfererExten) {
		this.secondTransfererExten = secondTransfererExten;
	}
	public void setSecondTransfererPriority(String secondTransfererPriority) {
		this.secondTransfererPriority = secondTransfererPriority;
	}
	public void setSecondTransfererUniqueid(String secondTransfererUniqueid) {
		this.secondTransfererUniqueid = secondTransfererUniqueid;
	}
	public void setSecondTransfererLinkedid(String secondTransfererLinkedid) {
		this.secondTransfererLinkedid = secondTransfererLinkedid;
	}
	public void setSecondBridgeUniqueid(String secondBridgeUniqueid) {
		this.secondBridgeUniqueid = secondBridgeUniqueid;
	}
	public void setSecondBridgeType(String secondBridgeType) {
		this.secondBridgeType = secondBridgeType;
	}
	public void setSecondBridgeTechnology(String secondBridgeTechnology) {
		this.secondBridgeTechnology = secondBridgeTechnology;
	}
	public void setSecondBridgeCreator(String secondBridgeCreator) {
		this.secondBridgeCreator = secondBridgeCreator;
	}
	public void setSecondBridgeName(String secondBridgeName) {
		this.secondBridgeName = secondBridgeName;
	}
	public void setSecondBridgeNumChannels(String secondBridgeNumChannels) {
		this.secondBridgeNumChannels = secondBridgeNumChannels;
	}
	public void setSecondBridgeVideoSourceMode(String secondBridgeVideoSourceMode) {
		this.secondBridgeVideoSourceMode = secondBridgeVideoSourceMode;
	}
	public void setSecondBridgeVideoSource(String secondBridgeVideoSource) {
		this.secondBridgeVideoSource = secondBridgeVideoSource;
	}
	public void setDestType(String destType) {
		this.destType = destType;
	}
	public void setDestBridgeUniqueid(String destBridgeUniqueid) {
		this.destBridgeUniqueid = destBridgeUniqueid;
	}
	public void setDestApp(String destApp) {
		this.destApp = destApp;
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
	public void setDesttransfererChannel(String desttransfererChannel) {
		this.desttransfererChannel = desttransfererChannel;
	}
	public void setTransfereeChannel(String transfereeChannel) {
		this.transfereeChannel = transfereeChannel;
	}
	public void setTransfereeChannelState(String transfereeChannelState) {
		this.transfereeChannelState = transfereeChannelState;
	}
	public void setTransfereeChannelStateDesc(String transfereeChannelStateDesc) {
		this.transfereeChannelStateDesc = transfereeChannelStateDesc;
	}
	public void setTransfereeCallerIDNum(String transfereeCallerIDNum) {
		this.transfereeCallerIDNum = transfereeCallerIDNum;
	}
	public void setTransfereeCallerIDName(String transfereeCallerIDName) {
		this.transfereeCallerIDName = transfereeCallerIDName;
	}
	public void setTransfereeConnectedLineNum(String transfereeConnectedLineNum) {
		this.transfereeConnectedLineNum = transfereeConnectedLineNum;
	}
	public void setTransfereeConnectedLineName(String transfereeConnectedLineName) {
		this.transfereeConnectedLineName = transfereeConnectedLineName;
	}
	public void setTransfereeAccountCode(String transfereeAccountCode) {
		this.transfereeAccountCode = transfereeAccountCode;
	}
	public void setTransfereeContext(String transfereeContext) {
		this.transfereeContext = transfereeContext;
	}
	public void setTransfereeExten(String transfereeExten) {
		this.transfereeExten = transfereeExten;
	}
	public void setTransfereePriority(String transfereePriority) {
		this.transfereePriority = transfereePriority;
	}
	public void setTransfereeUniqueid(String transfereeUniqueid) {
		this.transfereeUniqueid = transfereeUniqueid;
	}
	public void setTransfereeLinkedid(String transfereeLinkedid) {
		this.transfereeLinkedid = transfereeLinkedid;
	}
	
}
