 
package org.asteriskjava.manager.event;

/**
 *Raised when a device state changes<br>
 *This differs from the ExtensionStatus event because this event is raised for all device state changes, not only for changes that affect dialplan hints.
 *<br>
 *Syntax<br>
Event: DeviceStateChange<br>
Device: <value><br>
State: <value><br>
*/
public class DeviceStateChangeEvent extends ManagerEvent
{
    /**
     * Serializable version identifier.
     */
    private static final long serialVersionUID = 0L;

    /**
     * No device INUSE or BUSY.
     */
    public static final int NOT_INUSE = 0;

    /**
     * One or more devices INUSE.
     */
    public static final int INUSE = 1;

    /**
     * All devices BUSY.
     */
    public static final int BUSY = 1 << 1;

    /**
     * All devices UNAVAILABLE/UNREGISTERED.
     */
    public static final int UNAVAILABLE = 1 << 2;

    /**
     * One or more devices RINGING.
     */
    public static final int RINGING = 1 << 3;

    private String Device;
    private String State; 

    public DeviceStateChangeEvent(Object source)
    {
        super(source);
    }

	public String getDevice() {
		return Device;
	}

	public String getState() {
		return State;
	}

	public void setDevice(String device) {
		Device = device;
	}

	public void setState(String state) {
		State = state;
	}
 
}
