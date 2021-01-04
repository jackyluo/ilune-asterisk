package cn.ilune.asterisk.ami.action.client;

import cn.ilune.asteriskjava.manager.DefaultManagerConnection;
import cn.ilune.asteriskjava.manager.ManagerEventListener;
import cn.ilune.asteriskjava.manager.action.QueueStatusAction;
import cn.ilune.asteriskjava.manager.event.ManagerEvent;
import cn.ilune.asteriskjava.manager.response.ManagerResponse;


public class QueueStatusActionClient {


public static void main(String[] args) throws Exception {
		
		String ip="132.97.185.26",user="admin",pwd="123456";
		
		if(args!=null ){
			if(args.length==1)
				ip = args[0];
			if(args.length==2){
				ip = args[0];
				user = args[1];
			}
			if(args.length>=3){
				ip = args[0];
				user = args[1];
				pwd = args[2];
			}
		}			
		//ip = "168.150.18.247";
		ip = "asterisk.ccs.szca.com";
		ip = "192.168.118.233";
		ip = "132.97.190.33";
		  user = "admin";
		pwd = "AMI123456Admin";
		//host = "192.168.118.233";
		DefaultManagerConnection dmc = new DefaultManagerConnection();
		
		dmc.setUsername(user);			
		dmc.setHostname(ip);
		dmc.setPassword(pwd);
				 
		//dmc = getDefaultManagerConnection();
		dmc.login();
		
		dmc.addEventListener(new ManagerEventListener() {			
			public void onManagerEvent(ManagerEvent event) {			 
				System.out.println(event);
			}
		});
		
		
		
		String queue = null;
		queue = "sales";
		//queue = "support";
		queue = "queue_0";
		QueueStatusAction qa = new QueueStatusAction();
		//qa.setQueue(queue);
 		qa.setMember("SIP/801");
		qa.setActionId("QueueStatusAction-0001");
		ManagerResponse resp = dmc.sendAction(qa);		
		System.out.println("QueueStatusAction resp="+resp);
		//QueueParamsEvent - generated 
		//QueueMemberEvent - mapping to queue member
		//QueueEntryEvent - mapping to queue caller
		//QueueStatusCompleteEvent - complete
		//Thread.sleep(3*1000);
		
		 
		dmc.logoff();
	}


}
