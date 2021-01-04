package org.asteriskjava.manager.event;

public class FullyBootedEvent extends ManagerEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2987439722341243241L;

	public FullyBootedEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	private String status;
	private String uptime;
	private String lastReload;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getStatus() {
		return status;
	}
	public String getUptime() {
		return uptime;
	}
	public String getLastReload() {
		return lastReload;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public void setLastReload(String lastReload) {
		this.lastReload = lastReload;
	}
	
}
