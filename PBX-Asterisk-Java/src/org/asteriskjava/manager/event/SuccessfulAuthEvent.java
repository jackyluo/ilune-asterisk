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
 
public class SuccessfulAuthEvent extends ResponseEvent
{
     
    private static final long serialVersionUID = 0L;
    /*
     * {usingpassword=0, remoteaddress=IPV4/TCP/132.97.186.167/13682, eventversion=1, event=SuccessfulAuth, privilege=security,all, service=AMI, 
     * eventtv=2017-06-26T16:51:54.072+0800, severity=Informational, localaddress=IPV4/TCP/0.0.0.0/5038, sessiontv=2017-06-26T16:51:54.072+0800, 
     * sessionid=0x7fb7fc000be8, accountid=admin}. Please report at http://jira.reucon.org/browse/AJ
     * */
    private Integer usingpassword;
    private String remoteaddress;
    private String eventversion;
    private String event;
    private String privilege;
    private String service;
    private String eventtv;
    private String severity;
    private String localaddress;
    private String sessiontv;
    private String sessionid;
    private String accountid;

    /**
     * @param source
     */
    public SuccessfulAuthEvent(Object source)
    {
        super(source);
    }

	public Integer getUsingpassword() {
		return usingpassword;
	}

	public void setUsingpassword(Integer usingpassword) {
		this.usingpassword = usingpassword;
	}

	public String getRemoteaddress() {
		return remoteaddress;
	}

	public void setRemoteaddress(String remoteaddress) {
		this.remoteaddress = remoteaddress;
	}

	public String getEventversion() {
		return eventversion;
	}

	public void setEventversion(String eventversion) {
		this.eventversion = eventversion;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getEventtv() {
		return eventtv;
	}

	public void setEventtv(String eventtv) {
		this.eventtv = eventtv;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getLocaladdress() {
		return localaddress;
	}

	public void setLocaladdress(String localaddress) {
		this.localaddress = localaddress;
	}

	public String getSessiontv() {
		return sessiontv;
	}

	public void setSessiontv(String sessiontv) {
		this.sessiontv = sessiontv;
	}

	public String getSessionid() {
		return sessionid;
	}

	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}

	public String getAccountid() {
		return accountid;
	}

	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
