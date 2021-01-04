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
 * A QueueMemberPausedEvent is triggered when a queue member is paused or
 * unpaused.
 * <p>
 * It is implemented in <code>apps/app_queue.c</code>.
 * <p>
 * Available since Asterisk 1.2
 *
 * @author srt
 * @version $Id: QueueMemberPausedEvent.java 1208 2008-12-09 13:40:39Z srt $
 * @since 0.2
 */
public class QueueMemberPauseEvent extends AbstractQueueMemberEvent {
	/**
	 * Serial version identifier.
	 */
	private static final long serialVersionUID = 1L;

	private Boolean paused;
	private String queue;
	private String memberName;
	private String Interface;
	private String stateInterface;
	private String membership;
	private String penalty;
	private String callsTaken;
	private String lastCall;
	private String lastPause;
	private String inCall;
	private String status;
	//private String paused;
	private String pausedReason;
	private String ringinuse;
	private String reason;
	/**
	 * The reason why the queue member has been paused (optional).
	 */
	//private String reason;

	public QueueMemberPauseEvent(Object source) {
		super(source);
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Boolean getPaused() {
		return paused;
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
	public String getStateInterface() {
		return stateInterface;
	}
	public String getMembership() {
		return membership;
	}
	public String getPenalty() {
		return penalty;
	}
	public String getCallsTaken() {
		return callsTaken;
	}
	public String getLastCall() {
		return lastCall;
	}
	public String getLastPause() {
		return lastPause;
	}
	public String getInCall() {
		return inCall;
	}
	public String getStatus() {
		return status;
	}
	public String getPausedReason() {
		return pausedReason;
	}
	public String getRinginuse() {
		return ringinuse;
	}
	public String getReason() {
		return reason;
	}
	public void setPaused(Boolean paused) {
		this.paused = paused;
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
	public void setStateInterface(String stateInterface) {
		this.stateInterface = stateInterface;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}
	public void setCallsTaken(String callsTaken) {
		this.callsTaken = callsTaken;
	}
	public void setLastCall(String lastCall) {
		this.lastCall = lastCall;
	}
	public void setLastPause(String lastPause) {
		this.lastPause = lastPause;
	}
	public void setInCall(String inCall) {
		this.inCall = inCall;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setPausedReason(String pausedReason) {
		this.pausedReason = pausedReason;
	}
	public void setRinginuse(String ringinuse) {
		this.ringinuse = ringinuse;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
  
}
