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
 * An RTCPReceivedEvent is triggered when Asterisk receives an RTCP message.<p>
 * Available since Asterisk 1.6<p>
 * It is implemented in <code>main/rtp.c</code>
 *
 * @author srt
 * @version $Id: RtcpReceivedEvent.java 1203 2008-11-11 17:11:50Z srt $
 * @since 1.0.0
 */
public class RtcpReceivedEvent extends AbstractRtcpEvent
{
    private static final long serialVersionUID = 1L;

    /**
     * Payload identifier for a sender report.
     */
    public static final int PT_SENDER_REPORT = 200;

    /**
     * Payload identifier for a receiver report.
     */
    public static final int PT_RECEIVER_REPORT = 201;
    public static final int PT_H261_FUR = 192;

    private InetAddress fromAddress;
    private Integer fromPort;
    private Long pt;
    private Long receptionReports;
    private Long senderSsrc;
    private Long packetsLost;
    private Long highestSequence;
    private Long sequenceNumberCycles;
    private Double lastSr;
    private Double rtt;
   // Event: RTCPReceived
    private String channel;
    private String channelState;
    private String channelStateDesc;
    private String callerIDNum;
    private String callerIDName;
    private String connectedLineNum;
    private String connectedLineName;
    private String accountCode;
    private String context;
    private String exten;
    private String priority;
    private String uniqueId;
    private String linkedId;
    private String ssrc;
//    private String PT: <value>
    private String from;
    private String to;
//    private String RTT: <value>
    private String reportCount;
    private String SentNTP ;
    private String SentRTP ;
    private String SentPackets ;
    private String SentOctets ;
    private String reportXSourceSSRC;
    private String reportXFractionLost;
    private String reportXCumulativeLost;
    private String reportXHighestSequence;
    private String reportXSequenceNumberCycles;
    private String reportXIAJitter;
    private String reportXLSR;
    private String reportXDLSR;
    private String report0lsr;
    private String report0sourcessrc;
    private String report0dlsr;
    private String report0cumulativelost;
    private String report0sequencenumbercycles;
    private String report0highestsequence;
    private String report0fractionlost;
    private String report0iajitter;
    
    
    public RtcpReceivedEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the IP address the RTCP message has been received from.
     *
     * @return the IP address the RTCP message has been received from.
     */
    public InetAddress getFromAddress()
    {
        return fromAddress;
    }

    /**
     * Returns the port of the RTCP message has been received from.
     *
     * @return the port of the RTCP message has been received from.
     */
    public Integer getFromPort()
    {
        return fromPort;
    }

    public void setFrom(String from)
    {
        // Format is "%s:%d"
        this.fromAddress = stringToAddress(from);
        this.fromPort = stringToPort(from);
    }

    /**
     * Indicates the format of the payload, typical values are 200 for sender reports and
     * 201 for receiver reports.
     *
     * @return the format of the payload.
     * @see #PT_SENDER_REPORT
     * @see #PT_RECEIVER_REPORT
     */
    public Long getPt()
    {
        return pt;
    }

    public void setPt(String ptString)
    {
        // Format is "PT: %d(%s)"
        if (ptString == null || ptString.length() == 0)
        {
            this.pt = null;
            return;
        }

        if (ptString.indexOf('(') > 0)
        {
            this.pt = Long.parseLong(ptString.substring(0, ptString.indexOf('(')));
        }
        else
        {
            this.pt = Long.parseLong(ptString);
        }
    }

    public Long getReceptionReports()
    {
        return receptionReports;
    }

    public void setReceptionReports(Long receptionReports)
    {
        this.receptionReports = receptionReports;
    }

    /**
     * Returns the synchronization source identifier of the sender.
     *
     * @return the synchronization source identifier of the sender.
     */
    public Long getSenderSsrc()
    {
        return senderSsrc;
    }

    public void setSenderSsrc(Long senderSsrc)
    {
        this.senderSsrc = senderSsrc;
    }

    /**
     * Returns the number of packets lost so far.
     *
     * @return the number of packets lost.
     */
    public Long getPacketsLost()
    {
        return packetsLost;
    }

    public void setPacketsLost(Long packetsLost)
    {
        this.packetsLost = packetsLost;
    }

    public Long getHighestSequence()
    {
        return highestSequence;
    }

    public void setHighestSequence(Long highestSequence)
    {
        this.highestSequence = highestSequence;
    }

    public Long getSequenceNumberCycles()
    {
        return sequenceNumberCycles;
    }

    public void setSequenceNumberCycles(Long sequenceNumberCycles)
    {
        this.sequenceNumberCycles = sequenceNumberCycles;
    }

    public Double getLastSr()
    {
        return lastSr;
    }

    public void setLastSr(Double lastSr)
    {
        this.lastSr = lastSr;
    }

    /**
     * Returns the round trip time.
     *
     * @return the round trip time in seconds, may be <code>null</code>.
     */
    public Double getRtt()
    {
        return rtt;
    }

    public void setRtt(String rttString)
    {
        this.rtt = secStringToDouble(rttString);
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

	 

	public String getSsrc() {
		return ssrc;
	}

	public String getFrom() {
		return from;
	}

	public String getReportCount() {
		return reportCount;
	}

	public String getReportXSourceSSRC() {
		return reportXSourceSSRC;
	}

	public String getReportXFractionLost() {
		return reportXFractionLost;
	}

	public String getReportXCumulativeLost() {
		return reportXCumulativeLost;
	}

	public String getReportXHighestSequence() {
		return reportXHighestSequence;
	}

	public String getReportXSequenceNumberCycles() {
		return reportXSequenceNumberCycles;
	}

	public String getReportXIAJitter() {
		return reportXIAJitter;
	}

	public String getReportXLSR() {
		return reportXLSR;
	}

	public String getReportXDLSR() {
		return reportXDLSR;
	}

	public void setFromAddress(InetAddress fromAddress) {
		this.fromAddress = fromAddress;
	}

	public void setFromPort(Integer fromPort) {
		this.fromPort = fromPort;
	}

//	public void setPt(Long pt) {
//		this.pt = pt;
//	}

	public void setRtt(Double rtt) {
		this.rtt = rtt;
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

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public void setLinkedId(String linkedId) {
		this.linkedId = linkedId;
	}

	public void setSsrc(String ssrc) {
		this.ssrc = ssrc;
	}

	public void setReportCount(String reportCount) {
		this.reportCount = reportCount;
	}

	public void setReportXSourceSSRC(String reportXSourceSSRC) {
		this.reportXSourceSSRC = reportXSourceSSRC;
	}

	public void setReportXFractionLost(String reportXFractionLost) {
		this.reportXFractionLost = reportXFractionLost;
	}

	public void setReportXCumulativeLost(String reportXCumulativeLost) {
		this.reportXCumulativeLost = reportXCumulativeLost;
	}

	public void setReportXHighestSequence(String reportXHighestSequence) {
		this.reportXHighestSequence = reportXHighestSequence;
	}

	public void setReportXSequenceNumberCycles(String reportXSequenceNumberCycles) {
		this.reportXSequenceNumberCycles = reportXSequenceNumberCycles;
	}

	public void setReportXIAJitter(String reportXIAJitter) {
		this.reportXIAJitter = reportXIAJitter;
	}

	public void setReportXLSR(String reportXLSR) {
		this.reportXLSR = reportXLSR;
	}

	public void setReportXDLSR(String reportXDLSR) {
		this.reportXDLSR = reportXDLSR;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getTo() {
		return to;
	}

	public String getSentNTP() {
		return SentNTP;
	}

	public String getSentRTP() {
		return SentRTP;
	}

	public String getSentPackets() {
		return SentPackets;
	}

	public String getSentOctets() {
		return SentOctets;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setSentNTP(String sentNTP) {
		SentNTP = sentNTP;
	}

	public void setSentRTP(String sentRTP) {
		SentRTP = sentRTP;
	}

	public void setSentPackets(String sentPackets) {
		SentPackets = sentPackets;
	}

	public void setSentOctets(String sentOctets) {
		SentOctets = sentOctets;
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

//	public void setPt(Long pt) {
//		this.pt = pt;
//	}

	public void setReport0lsr(String report0lsr) {
		this.report0lsr = report0lsr;
	}

	public void setReport0sourcessrc(String report0sourcessrc) {
		this.report0sourcessrc = report0sourcessrc;
	}

	public void setReport0dlsr(String report0dlsr) {
		this.report0dlsr = report0dlsr;
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
    
    
    
}
