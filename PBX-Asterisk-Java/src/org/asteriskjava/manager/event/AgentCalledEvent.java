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

/**
 * An AgentCalledEvent is triggered when an agent is rung.
 * <p/>
 * To enable AgentCalledEvents you have to set
 * <code>eventwhencalled = yes</code> in <code>queues.conf</code>.
 * <p/>
 * This event is implemented in <code>apps/app_queue.c</code>
 *
 * @author srt
 * @version $Id: AgentCalledEvent.java 1154 2008-08-24 02:05:26Z srt $
 */
public class AgentCalledEvent extends AgentEvent
{
    /**
     * Serializable version identifier.
     */
    private static final long serialVersionUID = 1L;
  //  private String queue;
//     private String agentCalled;
//     private String agentName;
//     private String channelCalling;
 //   private String destinationChannel;
//    private String callerIdNum;
 //   private String callerIdName;
//    private String context;
 //   private String extension;
//    private String priority;
 //   private String uniqueId;
    private Map<String, String> variables;
    
  //  Event: AgentCalled
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
//    private String uniqueId;
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
//    private String _interface;

    /**
     * @param source
     */
    public AgentCalledEvent(Object source)
    {
        super(source);
    }

//     
//
//    public String getAgentCalled() {
//		return agentCalled;
//	}
//
//
//
//	public String getAgentName() {
//		return agentName;
//	}
//
//
//
//	public String getChannelCalling() {
//		return channelCalling;
//	}
//
//
//
//	public void setAgentCalled(String agentCalled) {
//		this.agentCalled = agentCalled;
//	}
//
//
//
//	public void setAgentName(String agentName) {
//		this.agentName = agentName;
//	}
//
//
//
//	public void setChannelCalling(String channelCalling) {
//		this.channelCalling = channelCalling;
//	}



	/**
     * Returns the channel variables if <code>eventwhencalled</code> is set to <code>vars</code>
     * in <code>queues.conf</code>.<p>
     * Available since Asterisk 1.6
     *
     * @return the channel variables.
     * @since 1.0.0
     */
    public Map<String, String> getVariables()
    {
        return variables;
    }

    /**
     * Sets the channel variables.<p>
     * Available since Asterisk 1.6
     *
     * @param variables the channel variables.
     * @since 1.0.0
     */
    public void setVariables(Map<String, String> variables)
    {
        this.variables = variables;
    }



	public static long getSerialversionuid() {
		return serialVersionUID;
	}


    
}
