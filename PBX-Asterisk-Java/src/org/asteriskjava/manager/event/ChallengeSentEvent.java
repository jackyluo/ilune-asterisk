package org.asteriskjava.manager.event;

public class ChallengeSentEvent extends ManagerEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6940635879401354667L;

	public ChallengeSentEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	private String eventTV;
	private String severity;
	private String service;
	private String eventVersion;
	private String accountID;
	private String sessionID;
	private String localAddress;
	private String remoteAddress;
	private String challenge;
	private String module;
	private String sessionTV;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getEventTV() {
		return eventTV;
	}
	public String getSeverity() {
		return severity;
	}
	public String getService() {
		return service;
	}
	public String getEventVersion() {
		return eventVersion;
	}
	public String getAccountID() {
		return accountID;
	}
	public String getSessionID() {
		return sessionID;
	}
	public String getLocalAddress() {
		return localAddress;
	}
	public String getRemoteAddress() {
		return remoteAddress;
	}
	public String getChallenge() {
		return challenge;
	}
	public String getModule() {
		return module;
	}
	public String getSessionTV() {
		return sessionTV;
	}
	public void setEventTV(String eventTV) {
		this.eventTV = eventTV;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public void setService(String service) {
		this.service = service;
	}
	public void setEventVersion(String eventVersion) {
		this.eventVersion = eventVersion;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}
	public void setRemoteAddress(String remoteAddress) {
		this.remoteAddress = remoteAddress;
	}
	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public void setSessionTV(String sessionTV) {
		this.sessionTV = sessionTV;
	}
	
}
