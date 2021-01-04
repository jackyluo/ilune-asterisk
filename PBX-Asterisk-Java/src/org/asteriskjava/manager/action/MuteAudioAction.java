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
package org.asteriskjava.manager.action;


/**
 * Project Name : AsteriskJava<br>
 * Package Name : org.asteriskjava.manager.action<br>
 * File Name    : MuteAudioAction.java<br>
 * Type Name    : <br>
 * Created on   : 2014-3-13 ÉÏÎç11:11:14<br>
 * Created by   : JackyLuo <br>
 * Note:<br>
 * Mute an incoming or outgoing audio stream on a channel.
 * 
 */
public class MuteAudioAction extends AbstractManagerAction
{
    
    
    /**
	 * Project Name : AsteriskJava<br>
	 * Package Name : org.asteriskjava.manager.action<br>
	 * File Name    : MuteAudioAction.java<br>
	 * Field Type   : long<br>
	 * Field Name   : serialVersionUID<br>
	 * Defined on   : 2014-3-13 ÉÏÎç11:11:51<br>
	 * Defined by   : JackyLuo<br>
	 * Note:<br>
	 *
	 * 
	 */
	private static final long serialVersionUID = -3030575973115846017L;
	
	public final static String DIRECTION_IN = "in";
	public final static String DIRECTION_OUT = "out";
	public final static String DIRECTION_ALL = "all";
	
//	Direction: <type> ¨C Audio to mute (read | write | both)
	
	//public final static String DIRECTION_READ = "read";
	//public final static String DIRECTION_WRITE = "write";
	//public final static String DIRECTION_BOTH = "both";
	
	public final static String STATE_ON = "on";
	public final static String STATE_OFF = "off";
	//public final static String STATE_0 = "0";
	//public final static String STATE_1 = "1";
	
	private String channel;
    //private Boolean paused;
    private String state;
    //private String uniqueId;
    private String direction;
     
    
    /**
     * Creates a new empty MuteAudioAction.
     */
    public MuteAudioAction()
    {

    }

    /*
     
    public MuteAudioAction(String channel)
    {
        this.channel = channel;
        
    }
 
    public MuteAudioAction(String channel, String state)
    {
        this.channel = channel;
        this.state = state;
        
    }
  */

    /**
     * Returns the name of this action, i.e. "QueuePause".
     * 
     * @return the name of this action.
     */
    @Override
   public String getAction()
    {
        return "MuteAudio";
    }


	public String getChannel() {
		return channel;
	}


	public void setChannel(String channel) {
		this.channel = channel;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

          
}
