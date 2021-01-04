package org.asteriskjava.manager.event;

public class LocalOptimizationBeginEvent extends ManagerEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7003169943250108633L;

	public LocalOptimizationBeginEvent(Object source) {
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
	private String sourceChannel;
	private String sourceChannelState;
	private String sourceChannelStateDesc;
	private String sourceCallerIDNum;
	private String sourceCallerIDName;
	private String sourceConnectedLineNum;
	private String sourceConnectedLineName;
	private String sourceAccountCode;
	private String sourceContext;
	private String sourceExten;
	private String sourcePriority;
	private String sourceUniqueid;
	private String sourceLinkedid;
	private String destUniqueId;
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
	public String getSourceChannel() {
		return sourceChannel;
	}
	public String getSourceChannelState() {
		return sourceChannelState;
	}
	public String getSourceChannelStateDesc() {
		return sourceChannelStateDesc;
	}
	public String getSourceCallerIDNum() {
		return sourceCallerIDNum;
	}
	public String getSourceCallerIDName() {
		return sourceCallerIDName;
	}
	public String getSourceConnectedLineNum() {
		return sourceConnectedLineNum;
	}
	public String getSourceConnectedLineName() {
		return sourceConnectedLineName;
	}
	public String getSourceAccountCode() {
		return sourceAccountCode;
	}
	public String getSourceContext() {
		return sourceContext;
	}
	public String getSourceExten() {
		return sourceExten;
	}
	public String getSourcePriority() {
		return sourcePriority;
	}
	public String getSourceUniqueid() {
		return sourceUniqueid;
	}
	public String getSourceLinkedid() {
		return sourceLinkedid;
	}
	public String getDestUniqueId() {
		return destUniqueId;
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
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}
	public void setSourceChannelState(String sourceChannelState) {
		this.sourceChannelState = sourceChannelState;
	}
	public void setSourceChannelStateDesc(String sourceChannelStateDesc) {
		this.sourceChannelStateDesc = sourceChannelStateDesc;
	}
	public void setSourceCallerIDNum(String sourceCallerIDNum) {
		this.sourceCallerIDNum = sourceCallerIDNum;
	}
	public void setSourceCallerIDName(String sourceCallerIDName) {
		this.sourceCallerIDName = sourceCallerIDName;
	}
	public void setSourceConnectedLineNum(String sourceConnectedLineNum) {
		this.sourceConnectedLineNum = sourceConnectedLineNum;
	}
	public void setSourceConnectedLineName(String sourceConnectedLineName) {
		this.sourceConnectedLineName = sourceConnectedLineName;
	}
	public void setSourceAccountCode(String sourceAccountCode) {
		this.sourceAccountCode = sourceAccountCode;
	}
	public void setSourceContext(String sourceContext) {
		this.sourceContext = sourceContext;
	}
	public void setSourceExten(String sourceExten) {
		this.sourceExten = sourceExten;
	}
	public void setSourcePriority(String sourcePriority) {
		this.sourcePriority = sourcePriority;
	}
	public void setSourceUniqueid(String sourceUniqueid) {
		this.sourceUniqueid = sourceUniqueid;
	}
	public void setSourceLinkedid(String sourceLinkedid) {
		this.sourceLinkedid = sourceLinkedid;
	}
	public void setDestUniqueId(String destUniqueId) {
		this.destUniqueId = destUniqueId;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
