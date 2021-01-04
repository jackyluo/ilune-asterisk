package cn.ilune.asterisk.ami.action.client;

import cn.ilune.asteriskjava.manager.ManagerConnection;
import cn.ilune.asteriskjava.manager.ManagerConnectionFactory;
import cn.ilune.asteriskjava.manager.ManagerEventListener;
import cn.ilune.asteriskjava.manager.action.AtxferAction;
import cn.ilune.asteriskjava.manager.event.ManagerEvent;
import cn.ilune.asteriskjava.manager.response.ManagerResponse;


public class AtxferActionClient {

	public static void main(String[] args) throws Exception {
		String host = "168.150.18.247", user = "admin", pwd = "AMI123456Admin";
		host = "192.168.118.233";
		ManagerConnectionFactory factory = new ManagerConnectionFactory(host, user, pwd);
		ManagerConnection conn = factory.createManagerConnection();
		conn.addEventListener(new ManagerEventListener() {
			public void onManagerEvent(ManagerEvent event) {
				System.out.println(event);
			}
		});
		conn.login();
		AtxferAction action = new AtxferAction();
		/**
		 * //channelֵ���ɣ� //1.ʹ��sip show channels ��ѯ��ǰ��������ͨ����ͨ��<br>
		 * 
		 * localhost*CLI> sip show channels <br>
		 * Peer User/ANR Call ID Format Hold Last Message Expiry Peer <br>
		 * 132.97.185.2 805 ZjBlN2ZiZWMyNjU (ulaw) No Rx: INFO 805 <br>
		 * 132.97.185.2 (None) 0f3054ba35220d2 (nothing) No Init: OPTIONS 803
		 * <br>
		 * 132.97.186.130 802 0f4dae037e92114 (ulaw) No Tx: ACK 802 <br>
		 * 3 active SIP dialogs<br>
		 * localhost*CLI><br>
		 * 
		 * 
		 * 2.ʹ��sip show channel 0f4dae037e92114��ѯchannelֵ ��Owner channel ID<br>
		 *  localhost*CLI> sip show channel 0f4dae037e92114<br>
		 * 
		 * SIP Call<br>
		 * Curr. trans. direction: Outgoing<br>
		 * Call-ID: 0f4dae037e92114c0fd1054243f98be5@132.97.186.6:5060<br>
		 * Owner channel ID: SIP/802-0000007c<br>
		 * Our Codec Capability: (g722|ulaw|alaw)<br>
		 * Non-Codec Capability (DTMF): 1<br>
		 * Their Codec Capability: (ulaw|gsm|alaw)<br>
		 * Joint Codec Capability: (ulaw|alaw)<br>
		 * Format: (ulaw)<br>
		 * 
		 */
		action.setChannel("SIP/801-0000000e");
		//actionId �������
		action.setActionId("thisisatest");
		//mysql -> cfg_sippeers.context
		action.setContext("LocalSets");
		//Ŀ��ֻ�����
		action.setExten("802");
		//�����
		action.setPriority(1);
		ManagerResponse resp = conn.sendAction(action);
		System.out.println("AtxferAction resp=" + resp);
		conn.logoff();
	}
}
