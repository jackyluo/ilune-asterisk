
package org.asteriskjava.manager.event;

/**
 * BridgeDestroy<br>
 * Synopsis<br>
 * Raised when a bridge is destroyed.<br>
 * Description<br>
 * Syntax<br>
 * Event: BridgeDestroy<br>
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
 */
public class BridgeDestroyEvent extends BridgeEvent {
	/**
	 * Serializable version identifier.
	 */
	private static final long serialVersionUID = 0L;

	public BridgeDestroyEvent(Object source) {
		super(source);
	}
	//Event: BridgeDestroy
	private String bridgeUniqueid;
	private String bridgeType;
	private String bridgeTechnology;
	private String bridgeCreator;
	private String bridgeName;
	private String bridgeNumChannels;
	private String bridgeVideoSourceMode;
	private String bridgeVideoSource;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getBridgeUniqueid() {
		return bridgeUniqueid;
	}
	public String getBridgeType() {
		return bridgeType;
	}
	public String getBridgeTechnology() {
		return bridgeTechnology;
	}
	public String getBridgeCreator() {
		return bridgeCreator;
	}
	public String getBridgeName() {
		return bridgeName;
	}
	public String getBridgeNumChannels() {
		return bridgeNumChannels;
	}
	public String getBridgeVideoSourceMode() {
		return bridgeVideoSourceMode;
	}
	public String getBridgeVideoSource() {
		return bridgeVideoSource;
	}
	public void setBridgeUniqueid(String bridgeUniqueid) {
		this.bridgeUniqueid = bridgeUniqueid;
	}
	public void setBridgeType(String bridgeType) {
		this.bridgeType = bridgeType;
	}
	public void setBridgeTechnology(String bridgeTechnology) {
		this.bridgeTechnology = bridgeTechnology;
	}
	public void setBridgeCreator(String bridgeCreator) {
		this.bridgeCreator = bridgeCreator;
	}
	public void setBridgeName(String bridgeName) {
		this.bridgeName = bridgeName;
	}
	public void setBridgeNumChannels(String bridgeNumChannels) {
		this.bridgeNumChannels = bridgeNumChannels;
	}
	public void setBridgeVideoSourceMode(String bridgeVideoSourceMode) {
		this.bridgeVideoSourceMode = bridgeVideoSourceMode;
	}
	public void setBridgeVideoSource(String bridgeVideoSource) {
		this.bridgeVideoSource = bridgeVideoSource;
	}
	
	
}
