/*
 *  Copyright 2009 Sebastian.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package org.asteriskjava.manager.event;

/**
 * A CoreShowChannelEvent is triggered for each active channel in response to a CoreShowChannelsAction.
 *
 * @author sebastian gutierrez
 * @version $Id: CoreShowChannelEvent.java 1348 2009-07-10 13:48:31Z srt $
 * @see org.asteriskjava.manager.action.CoreShowChannelsAction
 * @since 1.0.0
 */
public class CoreShowChannelEvent extends ResponseEvent
{
    /**
     * Serializable version identifier.
     */
    static final long serialVersionUID = 0L;

    private String uniqueId;
    private String channel;
    private String context;
    private String extension;
    private String priority;
    private String channelState;
    private String channelStateDesc;
    private String application;
    private String applicationData;
    private String calleridnum;
    private String duration;
    private String accountCode;
    private String bridgedChannel;
    private String bridgedUniqueId;

    public CoreShowChannelEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the channel state
     *
     * @return channel state
     */

    public String getChannelState()
    {
        return channelState;
    }

    public void setChannelState(String channelState)
    {
        this.channelState = channelState;
    }

    /**
     * Returns the Account code
     *
     * @return accountcode
     */
    public String getAccountCode()
    {
        return accountCode;
    }

    public void setAccountCode(String accountcode)
    {
        this.accountCode = accountcode;
    }

    /**
     * Returns the Aplication is runnning that channel at that time
     *
     * @return aplication name
     */
    public String getApplication()
    {
        return application;
    }

    public void setApplication(String application)
    {
        this.application = application;
    }

    /**
     * Returns the Aplication Data is runnning that channel at that time
     * this is the parameters passed to that dialplan application
     *
     * @return aplication data
     */
    public String getApplicationData()
    {
        return applicationData;
    }

    public void setApplicationData(String applicationdata)
    {
        this.applicationData = applicationdata;
    }

    /**
     * Returns the Bridged Channel if is bridged to one
     *
     * @return Channel name
     */
    public String getBridgedChannel()
    {
        return bridgedChannel;
    }

    public void setBridgedChannel(String bridgedChannel)
    {
        this.bridgedChannel = bridgedChannel;
    }

    /**
     * Returns the Bridged UniqueID
     *
     * @return uniqueid
     */
    public String getBridgeduniqueId()
    {
        return bridgedUniqueId;
    }

    public void setBridgedUniqueId(String bridgeduniqueid)
    {
        this.bridgedUniqueId = bridgeduniqueid;
    }

    /**
     * Returns the CallerID
     *
     * @return callerid
     */
    public String getCalleridnum()
    {
        return calleridnum;
    }

    public void setCalleridnum(String calleridnum)
    {
        this.calleridnum = calleridnum;
    }

    /**
     * Returns the Originate Channel name
     *
     * @return Channel name
     */
    public String getChannel()
    {
        return channel;
    }

    public void setChannel(String channel)
    {
        this.channel = channel;
    }

    /**
     * Returns the Channel state description (RING,...)
     *
     * @return description
     */
    public String getChannelStateDesc()
    {
        return channelStateDesc;
    }

    public void setChannelStateDesc(String channelstatedesc)
    {
        this.channelStateDesc = channelstatedesc;
    }

    /**
     * Returns the Context the channel is
     *
     * @return context
     */
    public String getContext()
    {
        return context;
    }

    public void setContext(String context)
    {
        this.context = context;
    }

    /**
     * Returns the duration of the call
     *
     * @return duration
     */
    public String getDuration()
    {
        return duration;
    }

    public void setDuration(String duration)
    {
        this.duration = duration;
    }

    /**
     * Returns the Extension dialed
     *
     * @return extension
     */
    public String getExtension()
    {
        return extension;
    }

    public void setExtension(String extension)
    {
        this.extension = extension;
    }

    /**
     * Returns the Priority the channel actualy is
     *
     * @return priority
     */
    public String getPriority()
    {
        return priority;
    }

    public void setPriority(String priority)
    {
        this.priority = priority;
    }

    /**
     * Returns the Uniqueid
     *
     * @return uniqueid
     */
    public String getUniqueId()
    {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId)
    {
        this.uniqueId = uniqueId;
    }

    
}
