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
 * A HoldEvent is triggered when a channel is put on hold (or no longer on
 * hold).
 * <p>
 * It is implemented in <code>channels/chan_sip.c</code>.
 * <p>
 * Available since Asterisk 1.2 for SIP channels, as of Asterisk 1.6 this event
 * is also supported for IAX2 channels.
 * <p>
 * To receive HoldEvents for SIP channels you must set
 * <code>callevents = yes</code> in <code>sip.conf</code>.
 *
 * @author srt
 * @version $Id: HoldEvent.java 1228 2009-01-20 14:54:31Z srt $
 * @since 0.2
 */
public class HoldEvent extends ManagerEvent {
	/**
	 * Serializable version identifier.
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * The name of the channel.
	 */
	private String channel;

	/**
	 * The unique id of the channel.
	 */
	private String uniqueId;

	private Boolean status;
	/*
	 * Event: Unhold Channel: <value> ChannelState: <value> ChannelStateDesc:
	 * <value> CallerIDNum: <value> CallerIDName: <value> ConnectedLineNum:
	 * <value> ConnectedLineName: <value> AccountCode: <value> Context: <value>
	 * Exten: <value> Priority: <value> Uniqueid: <value> Linkedid: <value>
	 */
//	private String calleridname;
	private String exten;
	private String callerIdNum;
	private String connectedLineNum;
	private String connectedLineName;
	private String priority;
	private String channelState;
	private String callerIdName;

	/**
	 * Creates a new HoldEvent.
	 *
	 * @param source
	 */
	public HoldEvent(Object source) {
		super(source);

		/*
		 * Asterisk prior to 1.6 uses Hold and Unhold events instead of the
		 * status So we set the status to true in the Hold event and to false in
		 * Unhold. For Asterisk 1.6 this is overridden by the status property
		 * received with the hold event.
		 */
		setStatus(true);
	}

	/**
	 * Returns the name of the channel.
	 *
	 * @return channel the name of the channel.
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * Sets the name of the channel.
	 *
	 * @param channel
	 *            the name of the channel.
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * Returns the unique id of the channel.
	 *
	 * @return the unique id of the channel.
	 */
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * Sets the unique id of the channel.
	 *
	 * @param uniqueId
	 *            the unique id of the channel.
	 */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	/**
	 * Returns whether this is a hold or unhold event.
	 *
	 * @return <code>true</code> if this a hold event, <code>false</code> if
	 *         it's an unhold event.
	 * @since 1.0.0
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * Returns whether this is a hold or unhold event.
	 *
	 * @param status
	 *            <code>true</code> if this a hold event, <code>false</code> if
	 *            it's an unhold event.
	 * @since 1.0.0
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * Returns whether this is a hold event.
	 *
	 * @return <code>true</code> if this a hold event, <code>false</code> if
	 *         it's an unhold event.
	 * @since 1.0.0
	 */
	public boolean isHold() {
		return status != null && status;
	}

	/**
	 * Returns whether this is an unhold event.
	 *
	 * @return <code>true</code> if this an unhold event, <code>false</code> if
	 *         it's a hold event.
	 * @since 1.0.0
	 */
	public boolean isUnhold() {
		return status != null && !status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getExten() {
		return exten;
	}

	public String getCallerIdNum() {
		return callerIdNum;
	}

	public String getConnectedLineNum() {
		return connectedLineNum;
	}

	public String getConnectedLineName() {
		return connectedLineName;
	}

	public String getPriority() {
		return priority;
	}

	public String getChannelState() {
		return channelState;
	}

	public String getCallerIdName() {
		return callerIdName;
	}

	public void setExten(String exten) {
		this.exten = exten;
	}

	public void setCallerIdNum(String callerIdNum) {
		this.callerIdNum = callerIdNum;
	}

	public void setConnectedLineNum(String connectedLineNum) {
		this.connectedLineNum = connectedLineNum;
	}

	public void setConnectedLineName(String connectedLineName) {
		this.connectedLineName = connectedLineName;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public void setChannelState(String channelState) {
		this.channelState = channelState;
	}

	public void setCallerIdName(String callerIdName) {
		this.callerIdName = callerIdName;
	}
	
	
}
