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
 * An AgentConnectEvent is triggered when a caller is connected to an agent.<p>
 * It is implemented in <code>apps/app_queue.c</code>.<p>
 * Available since Asterisk 1.2
 * 
 * @author srt
 * @version $Id: AgentConnectEvent.java 1074 2008-06-23 03:15:35Z srt $
 * @since 0.2
 */
public class AgentConnectEvent extends AgentEvent
{
    /**
     * Serial version identifier.
     */
    private static final long serialVersionUID = 0L;

    private Long holdTime;
    private String bridgedChannel;
    private Long ringtime;
    
    //Event: AgentConnect
 //   private String channel;
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
// //   private String uniqueId;
//    private String linkedId;
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
//    Interface;
//    RingTime;
//    HoldTime;
//    private String destLanguage;
//    private String Interface;

    public AgentConnectEvent(Object source)
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
     * Returns the unique ID of the queue member channel that is taking the
     * call. This is useful when trying to link recording filenames back to a
     * particular call from the queue.<p>
     * Available since Asterisk 1.4.
     * 
     * @return the unique ID of the queue member channel that is taking the
     *         call.
     */
    public String getBridgedChannel()
    {
        return bridgedChannel;
    }

    /**
     * Sets the unique ID of the queue member channel that is taking the call.
     * 
     * @param bridgedChannel the unique ID of the queue member channel that is
     *            taking the call.
     */
    public void setBridgedChannel(String bridgedChannel)
    {
        this.bridgedChannel = bridgedChannel;
    }

    /**
     * Returns the amount of time the agent's channel was ringing before answered.<p>
     * Available since Asterisk 1.6.
     *
     * @return the amount of time the agent's channel was ringing before answered in seconds.
     * @since 1.0.0
     */
    public Long getRingtime()
    {
        return ringtime;
    }

    public void setRingtime(Long ringtime)
    {
        this.ringtime = ringtime;
    }

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
 
//	public String getChannel() {
//		return channel;
//	}

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
//	 
////	public String getLinkedid() {
////		return linkedid;
////	}
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
////	public String getQueue() {
////		return queue;
////	}
////
////	public String getMemberName() {
////		return memberName;
////	}
//
////	public void setChannel(String channel) {
////		channel = channel;
////	}
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
 
////
////	public void setLinkedid(String linkedid) {
////		this.linkedid = linkedid;
////	}
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
////	public void setQueue(String queue) {
////		this.queue = queue;
////	}
////
////	public void setMemberName(String memberName) {
////		this.memberName = memberName;
////	}
//
//	public String getDestLanguage() {
//		return destLanguage;
//	}
//
//	public String getInterface() {
//		return Interface;
//	}
//
//	public void setDestLanguage(String destLanguage) {
//		this.destLanguage = destLanguage;
//	}
//
//	public void setInterface(String interface1) {
//		Interface = interface1;
//	}
//
//	public String getLinkedId() {
//		return linkedId;
//	}
//
//	public void setLinkedId(String linkedId) {
//		this.linkedId = linkedId;
//	}
    
}
