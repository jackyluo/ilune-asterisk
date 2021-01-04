
package org.asteriskjava.manager.event;

/**
 * A QueueCallerLeaveEvent is triggered Raised when a caller leaves a Queue.
 * <p>
 * Event: QueueCallerJoinEvent
 * <p>
 * Event: QueueCallerLeave Channel: <value> ChannelState: <value>
 * ChannelStateDesc: <value> CallerIDNum: <value> CallerIDName: <value>
 * ConnectedLineNum: <value> ConnectedLineName: <value> AccountCode: <value>
 * Context: <value> Exten: <value> Priority: <value> Uniqueid: <value> Queue:
 * <value> Count: <value> Position: <value>
 * <p>
 * Arguments Channel ChannelState - A numeric code for the channel's current
 * state, related to ChannelStateDesc ChannelStateDesc Down Rsrvd OffHook
 * Dialing Ring Ringing Up Busy Dialing Offhook Pre-ring Unknown CallerIDNum
 * CallerIDName ConnectedLineNum ConnectedLineName AccountCode Context Exten
 * Priority Uniqueid Queue - The name of the queue. Count - The total number of
 * channels in the queue. Position - This channel's current position in the
 * queue.
 */
public class QueueCallerLeaveEvent extends  QueueEvent  { 
	
	public QueueCallerLeaveEvent(Object source) {
		super(source);
		 
	}
//	 private String uniqueId;
//	    private String channel;
//	    private String queue;
//	    private Integer count;
//	    private String interFace;
//	    private String ringinuse;
//	    private String calleridname;
//	    private String exten;
//	    private String calleridnum;
//	    private String connectedlinenum;
	    
//	private String channel;
	private String channelState;
	private String channelStateDesc;
	private String callerIDNum;
//	private String CallerIDName;
//	private String ConnectedLineNum;
	private String connectedLineName;
	private String accountCode;
	private String context;
//	private String exten;
	private String priority;
//	private String Uniqueid;
//	private String Queue;
//	private Integer Count;
	private String position;
	public String getChannelState() {
		return channelState;
	}
	public String getChannelStateDesc() {
		return channelStateDesc;
	}
	public String getCallerIDNum() {
		return callerIDNum;
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
	public String getPriority() {
		return priority;
	}
	public String getPosition() {
		return position;
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
	public void setConnectedLineName(String connectedLineName) {
		this.connectedLineName = connectedLineName;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	 
	
	
}
