/*
 *  Copyright 2004-2006 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.asteriskjava.manager.event;

/**
 * An AgentCompleteEvent is triggered when at the end of a call if the caller
 * was connected to an agent.<p>
 * It is implemented in <code>apps/app_queue.c</code>.<p>
 * Available since Asterisk 1.2
 * 
 * @author srt
 * @version $Id: AgentCompleteEvent.java 938 2007-12-31 03:23:38Z srt $
 * @since 0.2
 */
public class AgentCompleteEvent  extends AgentEvent
{
    /**
     * Serial version identifier.
     */
    private static final long serialVersionUID = 2108033737226142194L;

    private Long holdTime;
    private Long talkTime;
    private String reason;
    
    //Event: AgentComplete
//    private String channel;
//    private String channelState;
//    private String channelStateDesc;
//    private String callerIDNum;
//    private String callerIDName;
//    private String connectedLineNum;
//    private String connectedLineName;
//    private String accountCode;
//    private String context;
//    private String exten;
//    private String priority;
//    private String uniqueid;
//    private String linkedid;
//    private String destChannel;
//    private String destChannelState;
//    private String destChannelStateDesc;
//    private String destCallerIDNum;
//    private String destCallerIDName;
//    private String destConnectedLineNum;
//    private String destConnectedLineName;
//    private String destAccountCode;
//    private String destContext;
//    private String destExten;
//    private String destPriority;
//    private String destUniqueid;
//    private String destLinkedid;
//    private String queue;
//    private String memberName;
//    private String Interface;
//    private String HoldTime;
//    private String TalkTime;
//    private String Reason;
    

    public AgentCompleteEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the amount of time the caller was on hold.
     * 
     * @return the amount of time the caller was on hold in seconds.
     */
    public Long getHoldTime()
    {
        return holdTime;
    }

    /**
     * Sets the amount of time the caller was on hold.
     * 
     * @param holdtime the amount of time the caller was on hold in seconds.
     */
    public void setHoldTime(Long holdtime)
    {
        this.holdTime = holdtime;
    }

    /**
     * Returns the amount of time the caller talked to the agent.
     * 
     * @return the amount of time the caller talked to the agent in seconds.
     */
    public Long getTalkTime()
    {
        return talkTime;
    }

    /**
     * Sets the amount of time the caller talked to the agent.
     * 
     * @param talkTime the amount of time the caller talked to the agent in
     *            seconds.
     */
    public void setTalkTime(Long talkTime)
    {
        this.talkTime = talkTime;
    }

    /**
     * Returns if the agent or the caller terminated the call.
     * 
     * @return "agent" if the agent terminated the call, "caller" if the caller
     *         terminated the call.
     */
    public String getReason()
    {
        return reason;
    }

    /**
     * Sets if the agent or the caller terminated the call.
     * 
     * @param reason "agent" if the agent terminated the call, "caller" if the
     *            caller terminated the call.
     */
    public void setReason(String reason)
    {
        this.reason = reason;
    }

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
//     
//	public String getChannel() {
//		return channel;
//	}
//
//	public String getChannelState() {
//		return channelState;
//	}
//
//	public String getChannelStateDesc() {
//		return channelStateDesc;
//	}
//
//	public String getCallerIDNum() {
//		return callerIDNum;
//	}
//
//	public String getCallerIDName() {
//		return callerIDName;
//	}
//
//	public String getConnectedLineNum() {
//		return connectedLineNum;
//	}
//
//	public String getConnectedLineName() {
//		return connectedLineName;
//	}
//
//	public String getAccountCode() {
//		return accountCode;
//	}
//
//	public String getContext() {
//		return context;
//	}
//
//	public String getExten() {
//		return exten;
//	}
//
//	public String getPriority() {
//		return priority;
//	}
//
//	public String getUniqueid() {
//		return uniqueid;
//	}
//
//	public String getLinkedid() {
//		return linkedid;
//	}
//
//	public String getDestChannel() {
//		return destChannel;
//	}
//
//	public String getDestChannelState() {
//		return destChannelState;
//	}
//
//	public String getDestChannelStateDesc() {
//		return destChannelStateDesc;
//	}
//
//	public String getDestCallerIDNum() {
//		return destCallerIDNum;
//	}
//
//	public String getDestCallerIDName() {
//		return destCallerIDName;
//	}
//
//	public String getDestConnectedLineNum() {
//		return destConnectedLineNum;
//	}
//
//	public String getDestConnectedLineName() {
//		return destConnectedLineName;
//	}
//
//	public String getDestAccountCode() {
//		return destAccountCode;
//	}
//
//	public String getDestContext() {
//		return destContext;
//	}
//
//	public String getDestExten() {
//		return destExten;
//	}
//
//	public String getDestPriority() {
//		return destPriority;
//	}
//
//	public String getDestUniqueid() {
//		return destUniqueid;
//	}
//
//	public String getDestLinkedid() {
//		return destLinkedid;
//	}
//
//	public String getQueue() {
//		return queue;
//	}
//
//	public String getMemberName() {
//		return memberName;
//	}
//
//	public String getInterface() {
//		return Interface;
//	}
//
//	public void setChannel(String channel) {
//		this.channel = channel;
//	}
//
//	public void setChannelState(String channelState) {
//		this.channelState = channelState;
//	}
//
//	public void setChannelStateDesc(String channelStateDesc) {
//		this.channelStateDesc = channelStateDesc;
//	}
//
//	public void setCallerIDNum(String callerIDNum) {
//		this.callerIDNum = callerIDNum;
//	}
//
//	public void setCallerIDName(String callerIDName) {
//		this.callerIDName = callerIDName;
//	}
//
//	public void setConnectedLineNum(String connectedLineNum) {
//		this.connectedLineNum = connectedLineNum;
//	}
//
//	public void setConnectedLineName(String connectedLineName) {
//		this.connectedLineName = connectedLineName;
//	}
//
//	public void setAccountCode(String accountCode) {
//		this.accountCode = accountCode;
//	}
//
//	public void setContext(String context) {
//		this.context = context;
//	}
//
//	public void setExten(String exten) {
//		this.exten = exten;
//	}
//
//	public void setPriority(String priority) {
//		this.priority = priority;
//	}
//
//	public void setUniqueid(String uniqueid) {
//		this.uniqueid = uniqueid;
//	}
//
//	public void setLinkedid(String linkedid) {
//		this.linkedid = linkedid;
//	}
//
//	public void setDestChannel(String destChannel) {
//		this.destChannel = destChannel;
//	}
//
//	public void setDestChannelState(String destChannelState) {
//		this.destChannelState = destChannelState;
//	}
//
//	public void setDestChannelStateDesc(String destChannelStateDesc) {
//		this.destChannelStateDesc = destChannelStateDesc;
//	}
//
//	public void setDestCallerIDNum(String destCallerIDNum) {
//		this.destCallerIDNum = destCallerIDNum;
//	}
//
//	public void setDestCallerIDName(String destCallerIDName) {
//		this.destCallerIDName = destCallerIDName;
//	}
//
//	public void setDestConnectedLineNum(String destConnectedLineNum) {
//		this.destConnectedLineNum = destConnectedLineNum;
//	}
//
//	public void setDestConnectedLineName(String destConnectedLineName) {
//		this.destConnectedLineName = destConnectedLineName;
//	}
//
//	public void setDestAccountCode(String destAccountCode) {
//		this.destAccountCode = destAccountCode;
//	}
//
//	public void setDestContext(String destContext) {
//		this.destContext = destContext;
//	}
//
//	public void setDestExten(String destExten) {
//		this.destExten = destExten;
//	}
//
//	public void setDestPriority(String destPriority) {
//		this.destPriority = destPriority;
//	}
//
//	public void setDestUniqueid(String destUniqueid) {
//		this.destUniqueid = destUniqueid;
//	}
//
//	public void setDestLinkedid(String destLinkedid) {
//		this.destLinkedid = destLinkedid;
//	}
//
//	public void setQueue(String queue) {
//		this.queue = queue;
//	}
//
//	public void setMemberName(String memberName) {
//		this.memberName = memberName;
//	}
//
//	public void setInterface(String interface1) {
//		Interface = interface1;
//	}
}
