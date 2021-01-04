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
 * File Name : MixMonitorAction.java<br>
 * Type Name : <br>
 * Created on : 2014-4-30 下午3:49:35<br>
 * Created by : JackyLuo <br>
 * Note:<br>
 * The MixMonitorAction starts monitoring (recording) a channel. 通话渠道混合录音，wav格式
 */
public class MixMonitorAction extends AbstractManagerAction {

	/**
	 * Project Name : AsteriskJava<br>
	 * Package Name : org.asteriskjava.manager.action<br>
	 * File Name : MixMonitorAction.java<br>
	 * Field Type : long<br>
	 * Field Name : serialVersionUID<br>
	 * Defined on : 2014-4-30 下午4:31:04<br>
	 * Defined by : JackyLuo<br>
	 * Note:<br>
	 * 
	 * 
	 */
	private static final long serialVersionUID = -8846010047895919133L;
	private String channel;
	private String file;

	private static String FORMAT = ".wav";

	public MixMonitorAction(String channel, String file) {
		super();
		this.channel = channel;
		this.file = file;
	}

	@Override
	public String getAction() {
		return "MixMonitor";
	}
 
	public String getChannel() {
		return channel;
	}
	 
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getFile() {
		if (file.endsWith(FORMAT))
			return file;
		else
			return file + FORMAT;
	}

	public void setFile(String file) {
		this.file = file;
	}
}
