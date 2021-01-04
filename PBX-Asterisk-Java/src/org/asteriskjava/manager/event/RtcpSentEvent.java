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

import java.net.InetAddress;

/**
 * An RtcpSentEvent is triggered when Asterisk sends an RTCP message.<p>
 * Available since Asterisk 1.6<p>
 * It is implemented in <code>main/rtp.c</code>
 *
 * @author srt
 * @version $Id: RtcpSentEvent.java 1141 2008-08-19 18:08:19Z srt $
 * @since 1.0.0
 */
public class RtcpSentEvent extends AbstractRtcpEvent
{
    private static final long serialVersionUID = 1L;

    private InetAddress toAddress;
    private Integer toPort;
    private Long ourSsrc;
    private Double sentNtp;
    private Long sentRtp;
    private Long sentPackets;
    private Long sentOctets;
    private Long cumulativeLoss;
    private Long theirLastSr;

 //   Event: RTCPSent
    private String Channel;
    private String ChannelState;
    private String ChannelStateDesc;
    private String CallerIDNum;
    private String CallerIDName;
    private String ConnectedLineNum;
    private String ConnectedLineName;
//    AccountCode: <value>
//    Context: <value>
    private String Exten;
    private String Priority;
//    Uniqueid: <value>
//    Linkedid: <value>
    private String ssrc; 
    private String PT;
    private String To;
//    ReportCount: <value>
//    [SentNTP:] <value>
//    [SentRTP:] <value>
//    [SentPackets:] <value>
//    [SentOctets:] <value>
//    ReportXSourceSSRC: <value>
//    ReportXFractionLost: <value>
//    ReportXCumulativeLost: <value>
//    ReportXHighestSequence: <value>
//    ReportXSequenceNumberCycles: <value>
//    ReportXIAJitter: <value>
//    ReportXLSR: <value>
//    ReportXDLSR: <value>
    
    private String from;
    private String reportcount;
    private String report0cumulativelost;
    private String report0sequencenumbercycles;
    private String report0highestsequence;
    private String report0fractionlost;
    private String report0iajitter;
    private String report0lsr;
    private String report0sourcessrc;
    private String report0dlsr;
//    private String report0fractionlost;
//    private String report0iajitter;
//    private String report0iajitter;
    
    public RtcpSentEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the IP address the RTCP message has been sent to.
     *
     * @return the IP address the RTCP message has been sent to.
     */
    public InetAddress getToAddress()
    {
        return toAddress;
    }

    /**
     * Returns the port the RTCP message has been sent to.
     *
     * @return the port the RTCP message has been sent to.
     */
    public Integer getToPort()
    {
        return toPort;
    }

    public void setTo(String to)
    {
        // Format is "%s:%d"
        this.toAddress = stringToAddress(to);
        this.toPort = stringToPort(to);
    }

    /**
     * Returns our synchronization source identifier that uniquely identifies the source of a stream.
     * @return our synchronization source identifier.
     */
    public Long getOurSsrc()
    {
        return ourSsrc;
    }

    public void setOurSsrc(Long ourSsrc)
    {
        this.ourSsrc = ourSsrc;
    }

    public Double getSentNtp()
    {
        return sentNtp;
    }

    public void setSentNtp(Double sentNtp)
    {
        this.sentNtp = sentNtp;
    }

    public Long getSentRtp()
    {
        return sentRtp;
    }

    public void setSentRtp(Long sentRtp)
    {
        this.sentRtp = sentRtp;
    }

    /**
     * Returns the number of packets sent.
     *
     * @return the number of packets sent.
     */
    public Long getSentPackets()
    {
        return sentPackets;
    }

    public void setSentPackets(Long sentPackets)
    {
        this.sentPackets = sentPackets;
    }

    /**
     * Returns the number of octets (bytes) sent.
     *
     * @return the number of octets (bytes) sent.
     */
    public Long getSentOctets()
    {
        return sentOctets;
    }

    public void setSentOctets(Long sentOctets)
    {
        this.sentOctets = sentOctets;
    }

    public Long getCumulativeLoss()
    {
        return cumulativeLoss;
    }

    public void setCumulativeLoss(Long cumulativeLoss)
    {
        this.cumulativeLoss = cumulativeLoss;
    }

    public Long getTheirLastSr()
    {
        return theirLastSr;
    }

    public void setTheirLastSr(Long theirLastSr)
    {
        this.theirLastSr = theirLastSr;
    }

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getChannel() {
		return Channel;
	}

	public String getChannelState() {
		return ChannelState;
	}

	public String getChannelStateDesc() {
		return ChannelStateDesc;
	}

	public String getCallerIDNum() {
		return CallerIDNum;
	}

	public String getCallerIDName() {
		return CallerIDName;
	}

	public String getConnectedLineNum() {
		return ConnectedLineNum;
	}

	public String getConnectedLineName() {
		return ConnectedLineName;
	}

	public String getExten() {
		return Exten;
	}

	public String getPriority() {
		return Priority;
	}

	public String getSsrc() {
		return ssrc;
	}

	public String getPT() {
		return PT;
	}

	public String getTo() {
		return To;
	}

	public void setToAddress(InetAddress toAddress) {
		this.toAddress = toAddress;
	}

	public void setToPort(Integer toPort) {
		this.toPort = toPort;
	}

	public void setChannel(String channel) {
		Channel = channel;
	}

	public void setChannelState(String channelState) {
		ChannelState = channelState;
	}

	public void setChannelStateDesc(String channelStateDesc) {
		ChannelStateDesc = channelStateDesc;
	}

	public void setCallerIDNum(String callerIDNum) {
		CallerIDNum = callerIDNum;
	}

	public void setCallerIDName(String callerIDName) {
		CallerIDName = callerIDName;
	}

	public void setConnectedLineNum(String connectedLineNum) {
		ConnectedLineNum = connectedLineNum;
	}

	public void setConnectedLineName(String connectedLineName) {
		ConnectedLineName = connectedLineName;
	}

	public void setExten(String exten) {
		Exten = exten;
	}

	public void setPriority(String priority) {
		Priority = priority;
	}

	public void setSsrc(String ssrc) {
		this.ssrc = ssrc;
	}

	public void setPT(String pT) {
		PT = pT;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getReportcount() {
		return reportcount;
	}

	public String getReport0cumulativelost() {
		return report0cumulativelost;
	}

	public String getReport0sequencenumbercycles() {
		return report0sequencenumbercycles;
	}

	public String getReport0highestsequence() {
		return report0highestsequence;
	}

	public String getReport0fractionlost() {
		return report0fractionlost;
	}

	public String getReport0iajitter() {
		return report0iajitter;
	}

	public String getReport0lsr() {
		return report0lsr;
	}

	public String getReport0sourcessrc() {
		return report0sourcessrc;
	}

	public String getReport0dlsr() {
		return report0dlsr;
	}

	public void setReportcount(String reportcount) {
		this.reportcount = reportcount;
	}

	public void setReport0cumulativelost(String report0cumulativelost) {
		this.report0cumulativelost = report0cumulativelost;
	}

	public void setReport0sequencenumbercycles(String report0sequencenumbercycles) {
		this.report0sequencenumbercycles = report0sequencenumbercycles;
	}

	public void setReport0highestsequence(String report0highestsequence) {
		this.report0highestsequence = report0highestsequence;
	}

	public void setReport0fractionlost(String report0fractionlost) {
		this.report0fractionlost = report0fractionlost;
	}

	public void setReport0iajitter(String report0iajitter) {
		this.report0iajitter = report0iajitter;
	}

	public void setReport0lsr(String report0lsr) {
		this.report0lsr = report0lsr;
	}

	public void setReport0sourcessrc(String report0sourcessrc) {
		this.report0sourcessrc = report0sourcessrc;
	}

	public void setReport0dlsr(String report0dlsr) {
		this.report0dlsr = report0dlsr;
	}
    
    
}