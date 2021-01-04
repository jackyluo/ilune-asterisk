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
 * A NewCallerIdEvent is triggered when the caller id of a channel changes.<p>
 * It is implemented in <code>channel.c</code>
 * 
 * @author srt
 * @version $Id: NewCallerIdEvent.java 973 2008-02-03 16:21:12Z srt $
 */
public class NewCallerIdEvent extends AbstractChannelEvent
{
    /**
     * Serializable version identifier.
     */
    static final long serialVersionUID = 6639570533512201213L;

    /**
     * Callerid presentation/screening.
     */
    private Integer cidCallingPres;
    //private String cidCallingPres;
    private String cidCallingPresTxt;
    
  //  Event: NewCallerid
    private String channel;
    private String  channelState;
    private String  channelStateDesc;
    private String  callerIDNum;
    private String  callerIDName;
    private String  connectedLineNum;
    private String connectedLineName;
    private String accountCode;
    private String context;
    private String exten;
    private String priority;
    private String uniqueId;
    private String linkedId;
    //private String CID-CallingPres;
    public NewCallerIdEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the CallerId presentation/screening.
     * 
     * @return the CallerId presentation/screening.
     * @since 0.2
     */
    public Integer getCidCallingPres()
    {
        return cidCallingPres;
    }

    /**
     * Returns the textual respresentation of the CallerId presentation/screening.
     * 
     * @return the textual respresentation of the CallerId presentation/screening.
     * @since 0.2
     */
    public String getCidCallingPresTxt()
    {
        return cidCallingPresTxt;
    }

    /**
     * Sets the CallerId presentation/screening in the form "%d (%s)".
     * 
     * @param s the CallerId presentation/screening in the form "%d (%s)".
     * @since 0.2
     */
    public void setCidCallingPres(String s)
    {
        int spaceIdx;

        if (s == null)
        {
            return;
        }

        spaceIdx = s.indexOf(' ');
        if (spaceIdx <= 0)
        {
            spaceIdx = s.length();
        }

        try
        {
            this.cidCallingPres = Integer.valueOf(s.substring(0, spaceIdx));
        }
        catch (NumberFormatException e)
        {
            return;
        }

        if (s.length() > spaceIdx + 3)
        {
            this.cidCallingPresTxt = s.substring(spaceIdx + 2, s.length() - 1);
        }
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

	 

	//public void setCidCallingPres(Integer cidCallingPres) {
	//	this.cidCallingPres = cidCallingPres;
	//}

	public void setCidCallingPresTxt(String cidCallingPresTxt) {
		this.cidCallingPresTxt = cidCallingPresTxt;
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

	public String getUniqueId() {
		return uniqueId;
	}

	public String getLinkedId() {
		return linkedId;
	}

	public void setCidCallingPres(Integer cidCallingPres) {
		this.cidCallingPres = cidCallingPres;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public void setLinkedId(String linkedId) {
		this.linkedId = linkedId;
	}

	 
    
    
    
}
