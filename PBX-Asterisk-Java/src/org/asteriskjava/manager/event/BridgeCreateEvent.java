
package org.asteriskjava.manager.event;

/**
 * BridgeCreate<br>
 * Synopsis<br>
 * Raised when a bridge is created.<br>
 * Description<br>
 * Syntax<br>
 * Event: BridgeCreate<br>
 * BridgeUniqueid: <value><br>
 * BridgeType: <value><br>
 * BridgeTechnology: <value><br>
 * BridgeCreator: <value><br>
 * BridgeName: <value><br>
 * BridgeNumChannels: <value><br>
 * BridgeVideoSourceMode: <value><br>
 * BridgeVideoSource: <value><br>
 * Arguments<br>
 * BridgeUniqueid<br>
 * BridgeType - The type of bridge<br>
 * BridgeTechnology - Technology in use by the bridge<br>
 * BridgeCreator - Entity that created the bridge if applicable<br>
 * BridgeName - Name used to refer to the bridge by its BridgeCreator if
 * applicable<br>
 * BridgeNumChannels - Number of channels in the bridge<br>
 * BridgeVideoSourceMode - ** none<br>
 * talker<br>
 * single<br>
 * The video source mode for the bridge.<br>
 * BridgeVideoSource - If there is a video source for the bridge, the unique ID
 * of the channel that is the video source.<br>
 * 
 */
public class BridgeCreateEvent extends BridgeEvent {
	/**
	 * Serializable version identifier.
	 */
	private static final long serialVersionUID = 0L;

	public BridgeCreateEvent(Object source) {
		super(source);
	}
	//Event: BridgeCreate
	private String BridgeUniqueid;
	private String BridgeType;
	private String BridgeTechnology;
	private String BridgeCreator;
	private String BridgeName;
	private String BridgeNumChannels;
	private String BridgeVideoSourceMode;
	private String BridgeVideoSource;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getBridgeUniqueid() {
		return BridgeUniqueid;
	}
	public String getBridgeType() {
		return BridgeType;
	}
	public String getBridgeTechnology() {
		return BridgeTechnology;
	}
	public String getBridgeCreator() {
		return BridgeCreator;
	}
	public String getBridgeName() {
		return BridgeName;
	}
	public String getBridgeNumChannels() {
		return BridgeNumChannels;
	}
	public String getBridgeVideoSourceMode() {
		return BridgeVideoSourceMode;
	}
	public String getBridgeVideoSource() {
		return BridgeVideoSource;
	}
	public void setBridgeUniqueid(String bridgeUniqueid) {
		BridgeUniqueid = bridgeUniqueid;
	}
	public void setBridgeType(String bridgeType) {
		BridgeType = bridgeType;
	}
	public void setBridgeTechnology(String bridgeTechnology) {
		BridgeTechnology = bridgeTechnology;
	}
	public void setBridgeCreator(String bridgeCreator) {
		BridgeCreator = bridgeCreator;
	}
	public void setBridgeName(String bridgeName) {
		BridgeName = bridgeName;
	}
	public void setBridgeNumChannels(String bridgeNumChannels) {
		BridgeNumChannels = bridgeNumChannels;
	}
	public void setBridgeVideoSourceMode(String bridgeVideoSourceMode) {
		BridgeVideoSourceMode = bridgeVideoSourceMode;
	}
	public void setBridgeVideoSource(String bridgeVideoSource) {
		BridgeVideoSource = bridgeVideoSource;
	}
	
}
