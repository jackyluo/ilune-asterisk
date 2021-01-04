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

import java.util.Map;
 
public abstract class AgentEvent extends AbstractAgentEvent 
{
     
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String agentCalled;
     private String agentName;
     private String channelCalling;
 
    
    private String channel;
    private String channelState;
    private String channelStateDesc;
    private String callerIdNum;
    private String callerIdName;
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
    private String destLanguage;
    private String destAccountCode;
    private String destContext;
    private String destExten;
    private String destPriority;
    private String destUniqueid;
    private String destLinkedid;
    private String queue;
    private String memberName;
    private String Interface;

    /**
     * @param source
     */
    public AgentEvent(Object source)
    {
        super(source);
    }

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAgentCalled() {
		return agentCalled;
	}

	public String getAgentName() {
		return agentName;
	}

	public String getChannelCalling() {
		return channelCalling;
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

	public String getCallerIdNum() {
		return callerIdNum;
	}

	public String getCallerIdName() {
		return callerIdName;
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

	public String getDestLanguage() {
		return destLanguage;
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

	public String getQueue() {
		return queue;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getInterface() {
		return Interface;
	}

	public void setAgentCalled(String agentCalled) {
		this.agentCalled = agentCalled;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public void setChannelCalling(String channelCalling) {
		this.channelCalling = channelCalling;
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

	public void setCallerIdNum(String callerIdNum) {
		this.callerIdNum = callerIdNum;
	}

	public void setCallerIdName(String callerIdName) {
		this.callerIdName = callerIdName;
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

	public void setDestLanguage(String destLanguage) {
		this.destLanguage = destLanguage;
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

	public void setQueue(String queue) {
		this.queue = queue;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setInterface(String interface1) {
		Interface = interface1;
	}

    
       
    
}
