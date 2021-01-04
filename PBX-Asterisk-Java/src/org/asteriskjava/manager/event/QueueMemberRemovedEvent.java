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
 * A QueueMemberRemovedEvent is triggered when a queue member is removed from a
 * queue.
 * <p>
 * It is implemented in <code>apps/app_queue.c</code>.
 * <p>
 * Available since Asterisk 1.2
 * 
 * @author srt
 * @version $Id: QueueMemberRemovedEvent.java 938 2007-12-31 03:23:38Z srt $
 * @since 0.2
 */
public class QueueMemberRemovedEvent extends AbstractQueueMemberEvent {
	/**
	 * Serial version identifier.
	 */
	private static final long serialVersionUID = 2108033737226142194L;

	public QueueMemberRemovedEvent(Object source) {
		super(source);
	}
	// 20180826
	 
	private String paused;
	private String penalty;
	private Long lastPause;
	private String stateInterface;
	private String incall;
	private String membership;
	private String Interface;
	private String callstaken;
	private String ringinuse;
	private Long lastCall;
	private String status;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getPaused() {
		return paused;
	}
	public String getPenalty() {
		return penalty;
	}
	public Long getLastPause() {
		return lastPause;
	}
	public String getStateInterface() {
		return stateInterface;
	}
	public String getIncall() {
		return incall;
	}
	public String getMembership() {
		return membership;
	}
	public String getInterface() {
		return Interface;
	}
	public String getCallstaken() {
		return callstaken;
	}
	public String getRinginuse() {
		return ringinuse;
	}
	public Long getLastCall() {
		return lastCall;
	}
	public String getStatus() {
		return status;
	}
	public void setPaused(String paused) {
		this.paused = paused;
	}
	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}
	public void setLastPause(Long lastPause) {
		this.lastPause = lastPause;
	}
	public void setStateInterface(String stateInterface) {
		this.stateInterface = stateInterface;
	}
	public void setIncall(String incall) {
		this.incall = incall;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	public void setInterface(String interface1) {
		Interface = interface1;
	}
	public void setCallstaken(String callstaken) {
		this.callstaken = callstaken;
	}
	public void setRinginuse(String ringinuse) {
		this.ringinuse = ringinuse;
	}
	public void setLastCall(Long lastCall) {
		this.lastCall = lastCall;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
}
