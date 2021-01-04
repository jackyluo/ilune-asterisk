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
 * A HangupEvent is triggered when a channel is hung up.<p>
 * It is implemented in <code>channel.c</code>
 *
 * @author srt
 * @version $Id: HangupEvent.java 969 2008-02-03 14:24:22Z srt $
 */
public class HangupRequestEvent extends AbstractChannelEvent
{
    /**
     * Serializable version identifier.
     */
    static final long serialVersionUID = 0L;
// 'hanguprequest', attributes: {linkedid=1503931750.253, calleridname=<unknown>, channel=SIP/802-00000021, 
    //cause=16, language=zh, privilege=call,all, exten=s, calleridnum=<unknown>, context=LocalSets, 
    //event=HangupRequest, connectedlinenum=805, uniqueid=1503931758.256, channelstatedesc=Up, 
    //connectedlinename=<unknown>, priority=1, channelstate=6}. Please report at http://jira.reucon.org/browse/AJ
      private Integer cause;
    private String causeTxt;
    private String linkedId;
	private String language; 
	private String connectedlinename;
	private String priority;
	private String channelstate;
	private String exten;
	private String context;
	private String connectedlinenum;
	private String channelstatedesc;
    public HangupRequestEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the cause of the hangup.
     *
     * @return the hangup cause.
     * @see org.asteriskjava.live.HangupCause
     */
    public Integer getCause()
    {
        return cause;
    }

    /**
     * Sets the cause of the hangup.
     *
     * @param cause the hangup cause.
     */
    public void setCause(Integer cause)
    {
        this.cause = cause;
    }

    /**
     * Returns the textual representation of the hangup cause.
     *
     * @return the textual representation of the hangup cause.
     * @since 0.2
     */
    public String getCauseTxt()
    {
        return causeTxt;
    }

    /**
     * Sets the textual representation of the hangup cause.
     *
     * @param causeTxt the textual representation of the hangup cause.
     * @since 0.2
     */
    public void setCauseTxt(String causeTxt)
    {
        this.causeTxt = causeTxt;
    }

	public String getLinkedId() {
		return linkedId;
	}

	public String getLanguage() {
		return language;
	}

	public String getConnectedlinename() {
		return connectedlinename;
	}

	public String getPriority() {
		return priority;
	}

	public String getChannelstate() {
		return channelstate;
	}

	public String getExten() {
		return exten;
	}

	public String getContext() {
		return context;
	}

	public String getConnectedlinenum() {
		return connectedlinenum;
	}

	public String getChannelstatedesc() {
		return channelstatedesc;
	}

	public void setLinkedId(String linkedid) {
		this.linkedId = linkedid;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setConnectedlinename(String connectedlinename) {
		this.connectedlinename = connectedlinename;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public void setChannelstate(String channelstate) {
		this.channelstate = channelstate;
	}

	public void setExten(String exten) {
		this.exten = exten;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public void setConnectedlinenum(String connectedlinenum) {
		this.connectedlinenum = connectedlinenum;
	}

	public void setChannelstatedesc(String channelstatedesc) {
		this.channelstatedesc = channelstatedesc;
	}
    
    
    
}
