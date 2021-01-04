package org.asteriskjava.manager.action;

public class BlindTransferAction extends AbstractManagerAction {

	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 6907537909465585958L;
	@Override
    public String getAction()
    {
        return "BlindTransfer";
    }
	public BlindTransferAction(){}
	public BlindTransferAction(String channel,String context,String exten){
		this.channel = channel;
		this.context = context;
		this.exten = exten;
	}
	private String channel;
	private String context;
	private String exten;
	public String getChannel() {
		return channel;
	}
	public String getContext() {
		return context;
	}
	public String getExten() {
		return exten;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public void setExten(String exten) {
		this.exten = exten;
	}
	
}
