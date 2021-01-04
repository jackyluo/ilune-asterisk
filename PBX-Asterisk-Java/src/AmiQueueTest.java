

import cn.ilune.asteriskjava.manager.DefaultManagerConnection;
import cn.ilune.asteriskjava.manager.action.QueueAddAction;
import cn.ilune.asteriskjava.manager.action.StatusAction;
import cn.ilune.asteriskjava.manager.response.ManagerResponse;

public class AmiQueueTest  {
	 
	public static void main(String[] args) throws Exception {
		
		String ip="132.97.185.26",username="admin",pwd="123456";
		
		if(args!=null ){
			if(args.length==1)
				ip = args[0];
			if(args.length==2){
				ip = args[0];
				username = args[1];
			}
			if(args.length>=3){
				ip = args[0];
				username = args[1];
				pwd = args[2];
			}
		}			
		
		DefaultManagerConnection dmc;

		dmc = new DefaultManagerConnection();
		
		dmc.setUsername(username);			
		dmc.setHostname(ip);
		dmc.setPassword(pwd);
				 
		//dmc = getDefaultManagerConnection();
		dmc.login();
		ManagerResponse resp = dmc.sendAction(new StatusAction());
		System.out.println("StatusAction resp="+resp);
		 
		QueueAddAction qa = new QueueAddAction();
		//qa.setQueue("sales");
		qa.setQueue("support");
		qa.setMemberName("����");
		qa.setInterface("SIP/108");
		resp = dmc.sendAction(qa);
		System.out.println("QueueAddAction resp="+resp);
		
		qa = new QueueAddAction();
		//qa.setQueue("sales");
		qa.setQueue("support");
		qa.setMemberName("����");
		qa.setInterface("SIP/109");
		resp = dmc.sendAction(qa);		
		System.out.println("QueueAddAction resp="+resp);
		
		qa = new QueueAddAction();
		qa.setQueue("sales");
		//qa.setQueue("support");
		qa.setMemberName("����");
		qa.setInterface("SIP/109");
		resp = dmc.sendAction(qa);		
		System.out.println("QueueAddAction resp="+resp);
		
		 
		dmc.logoff();
	}
}
