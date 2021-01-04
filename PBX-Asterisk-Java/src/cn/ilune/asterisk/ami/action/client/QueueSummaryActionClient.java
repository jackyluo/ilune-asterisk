package cn.ilune.asterisk.ami.action.client;

import cn.ilune.asteriskjava.manager.ManagerConnection;
import cn.ilune.asteriskjava.manager.ManagerConnectionFactory;
import cn.ilune.asteriskjava.manager.ManagerEventListener;
import cn.ilune.asteriskjava.manager.action.QueueSummaryAction;
import cn.ilune.asteriskjava.manager.event.ManagerEvent;

public class QueueSummaryActionClient {
	public static void main(String[] args) throws Exception {
		String ip="168.150.18.247",user="admin",pwd="AMI123456Admin";
		ip = "asterisk.ccs.szca.com";
		ManagerConnectionFactory factory = new ManagerConnectionFactory(ip,user,pwd);
		ManagerConnection conn = factory .createManagerConnection(); 
		conn.addEventListener(new ManagerEventListener() {			
			public void onManagerEvent(ManagerEvent event) {			 
				System.out.println(event);
			}
		});
		conn.login();
		QueueSummaryAction action = new QueueSummaryAction();
		conn.sendAction(action);
		conn.logoff();
	}
}
